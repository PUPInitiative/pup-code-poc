package info.pupcode.model.cfg;

import org.hibernate.cfg.Configuration;


import org.hibernate.dialect.PostgreSQL9Dialect;
import org.hibernate.envers.tools.hbm2ddl.EnversSchemaGenerator;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.springframework.data.jpa.domain.AbstractAuditable;

/**
 * Created by fabientronche1 on 07.11.15.
 */
public class JPAGenerator {

    public static void main(String[] args) {

        Configuration config = new Configuration();

//make sure you set the dialect correctly for your database (oracle for example below)
        config.setProperty("hibernate.dialect", PostgreSQL9Dialect.class.getName());

//add all of your entities
        config.addAnnotatedClass(FriendNetworkConfig.class);
        config.addAnnotatedClass(EmailAddress.class);
        config.addAnnotatedClass(PhoneNumber.class);
        config.addAnnotatedClass(Device.class);
        config.addAnnotatedClass(Identity.class);
        config.addAnnotatedClass(Peer.class);

        SchemaExport export = new EnversSchemaGenerator(config).export();
        export.execute(true, false, false, false);
    }

}
