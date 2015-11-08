package info.pupcode.model.cfg;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by fabientronche1 on 19.10.15.
 */
@Entity
@Table(name = "FRIEND_NETWORK_CFG")
public class FriendNetworkConfig extends AbstractAuditable<Identity, Long> implements Serializable {


    @Column(name = "NAME", columnDefinition = "The name of the network", nullable = false, length = 100)
    private String name;

    @Column(name = "COMMENT")
    private String comment;

    @ManyToMany(fetch = FetchType.LAZY, targetEntity = Peer.class)
    private Map<Long, Peer> peerMap = new HashMap<Long, Peer>();

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Map<Long, Peer> getPeerMap() {

        return peerMap;
    }

    public void setPeerMap(Map<Long, Peer> peerMap) {

        this.peerMap = peerMap;
    }

    public String getComment() {

        return comment;
    }

    public void setComment(String comment) {


        this.comment = comment;
    }

    public void addPeer(Peer peer) {

        assert peer != null;

        if (this.peerMap.containsValue(peer))
            return;
        this.peerMap.put(peer.getId(), peer);

    }


    @Override
    public String toString() {

        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        FriendNetworkConfig that = (FriendNetworkConfig) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(name, that.name)
                .append(comment, that.comment)
                .append(peerMap, that.peerMap)
                .isEquals();
    }

    @Override
    public int hashCode() {

        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(name)
                .append(comment)
                .append(peerMap)
                .toHashCode();
    }
}
