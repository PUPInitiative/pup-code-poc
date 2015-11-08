package info.pupcode.model.repo.test;

import info.pupcode.model.cfg.FriendNetworkConfig;
import info.pupcode.model.cfg.Identity;
import org.concordion.integration.junit4.ConcordionRunner;
import org.hibernate.envers.Audited;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import javax.swing.*;

/**
 * Created by fabientronche1 on 07.11.15.
 */
@RunWith(ConcordionRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class NetworkConfigCreationFixture {

    @Autowired
    private SpringConfigTest springConfigTest;

    @Before
    public void setUp() {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        if (springConfigTest == null) {
            springConfigTest = (SpringConfigTest) applicationContext.getBean(SpringConfigTest.class.getName());
        }
    }

    public Identity givenIdentiyFor(String nickname, String email) {

        Identity identity = springConfigTest.identity();
        identity.setNickname(nickname);
        identity.setEmail(email);
        return identity;
    }

    public FriendNetworkConfig givenNewFriendNetworkConfig() {

        return springConfigTest.friendNetworkConfig();
    }
}
