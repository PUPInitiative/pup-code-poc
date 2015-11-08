package info.pupcode.model.cfg;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by fabientronche1 on 23.10.15.
 */
@Entity
@Table(name = "IDENTITY")
public class Identity extends AbstractAuditable<Identity, Long> implements Serializable {


    @Column(name = "NICKNAME", columnDefinition = "The nickname of the Identity", length = 100, unique = true, nullable = false)
    private String nickname;
    @Column(name = "EMAIL", columnDefinition = "The nickname of the Identity", unique = true, nullable = false)
    private String email;

    @OneToMany
    private Set<PhoneNumber> phoneNumberSet = new HashSet<PhoneNumber>();


    public Identity() {

    }

    public String getNickname() {

        return nickname;
    }

    public void setNickname(String nickname) {

        this.nickname = nickname;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Identity identity = (Identity) o;

        return new EqualsBuilder()
                .append(getId(), identity.getId())
                .append(nickname, identity.nickname)
                .append(email, identity.email)
                .isEquals();
    }

    @Override
    public int hashCode() {

        return new HashCodeBuilder(17, 37)
                .append(getId())
                .append(nickname)
                .append(email)
                .toHashCode();
    }

    public Set<PhoneNumber> getPhoneNumberSet() {

        return phoneNumberSet;
    }

    public void setPhoneNumberSet(Set<PhoneNumber> phoneNumberSet) {

        this.phoneNumberSet = phoneNumberSet;
    }
}