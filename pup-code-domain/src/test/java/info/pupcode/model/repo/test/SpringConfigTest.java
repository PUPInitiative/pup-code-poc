package info.pupcode.model.repo.test;

import info.pupcode.model.cfg.FriendNetworkConfig;
import info.pupcode.model.cfg.Identity;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by fabientronche1 on 07.11.15.
 */
@Configuration
public class SpringConfigTest {

    private static int CFG_COUNTER = 0;

    @Bean
    @Scope("prototype")
    public
    @NotNull
    FriendNetworkConfig friendNetworkConfig() {

        FriendNetworkConfig networkConfig = new FriendNetworkConfig();
        networkConfig.setName("Network config test " + CFG_COUNTER);
        networkConfig.setCreatedDate(DateTime.now());
        networkConfig.setLastModifiedDate(DateTime.now());

        CFG_COUNTER++;
        return networkConfig;
    }

    @Bean
    @Scope("prototype")
    public
    @NotNull
    Identity identity() {

        Identity identity = new Identity();
        return identity;
    }
}
