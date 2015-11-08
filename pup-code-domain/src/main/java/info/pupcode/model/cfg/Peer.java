package info.pupcode.model.cfg;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Map;

/**
 * Created by fabientronche1 on 22.10.15.
 */
@Entity
@Table(name = "PEER")
public class Peer extends AbstractAuditable<Identity, Long> implements Serializable {

    @ManyToMany(fetch = FetchType.LAZY)
    private Map<Long, Device> devices;


    public Peer() {

    }

    public Peer(Map<Long, Device> devices) {

        this.devices = devices;
    }

    public Map<Long, Device> getDevices() {

        return devices;
    }

    public void setDevices(Map<Long, Device> devices) {

        this.devices = devices;
    }

    @Override
    public String toString() {

        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Peer peer = (Peer) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(devices, peer.devices)
                .isEquals();
    }

    @Override
    public int hashCode() {

        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(devices)
                .toHashCode();
    }
}