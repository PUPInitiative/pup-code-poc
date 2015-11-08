package info.pupcode.model.cfg;

import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by fabientronche1 on 07.11.15.
 */
@Entity
@Table(name = "PHONE_NUMBER")
public class PhoneNumber extends AbstractAuditable<Identity, Long> implements Serializable {

    @Column(name = "NAME", columnDefinition = "The name of the PhoneNumber", nullable = false, length = 50)
    private String name;
    @Column(name = "NUMBER", columnDefinition = "The number of the PhoneNumber", nullable = false, length = 50)
    private String number;

    public PhoneNumber() {

    }

    public PhoneNumber(String name, String number) {

        this.name = name;
        this.number = number;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getNumber() {

        return number;
    }

    public void setNumber(String number) {

        this.number = number;
    }
}
