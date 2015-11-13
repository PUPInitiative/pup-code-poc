package info.pupcode.model.repo.test;

import info.pupcode.model.cfg.FriendNetworkConfig;
import info.pupcode.model.cfg.Identity;
import info.pupcode.model.repo.IdentityRepository;
import junit.framework.Assert;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.Resource;

/**
 * Created by fabientronche1 on 07.11.15.
 */
@RunWith(ConcordionRunner.class)
public class NetworkConfigCreationFixture extends AbstractConcordionFixture {


    public Identity givenIdentiyNameFor(String nickname, String email) {

        Identity identity = springConfigTest.identity();
        identity.setNickname(nickname);
        identity.setEmail(email);
        return identity;
    }

    public FriendNetworkConfig givenNewFriendNetworkConfig() {

        return springConfigTest.friendNetworkConfig();
    }

    public Long storeIdentityService(Identity identity) {
        IdentityRepository identityRepository = applicationContext.getBean(IdentityRepository.class);
        Identity identity1 = identityRepository.save(identity);
        return identity1.getId();
    }
}
