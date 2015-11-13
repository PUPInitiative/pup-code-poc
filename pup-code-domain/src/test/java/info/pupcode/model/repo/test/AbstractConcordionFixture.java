package info.pupcode.model.repo.test;

import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fabientronche1 on 08.11.15.
 */
public class AbstractConcordionFixture {

    protected SpringConfigTest springConfigTest;
    protected ClassPathXmlApplicationContext applicationContext;

    @Before
    public void setUp() {

        applicationContext = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        if (springConfigTest == null) {
            springConfigTest = (SpringConfigTest) applicationContext.getBean(SpringConfigTest.class.getName());
        }
    }
}
