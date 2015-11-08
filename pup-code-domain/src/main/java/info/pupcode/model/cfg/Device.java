package info.pupcode.model.cfg;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.joda.time.DateTime;
import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by fabientronche1 on 23.10.15.
 */
@Entity
@Table(name = "DEVICE")
public class Device extends AbstractAuditable<Identity, Long> implements Serializable {

    @Column(name = "MANUFACTURER", columnDefinition = "The device manufacturer", length = 150)
    private String manufacturer;
    @Column(name = "MAC_ADDRESS", columnDefinition = "The device mac address", nullable = false, length = 200)
    private String macAdress;
    @Column(name = "SERIAL_NUMBER", columnDefinition = "The device Serial Number", updatable = false)
    private String serialNumber;
    @Column(name = "IP_ADDRESS", columnDefinition = "The IP address of the Device", nullable = false)
    private String ipAddress;
    @Column(name = "KIND_OF_DEVICE", columnDefinition = "The kind of device", updatable = false, nullable = false)
    private KindOfDevice kindOfDevice;
    @ManyToMany(mappedBy = "devices")
    private Collection<Peer> peers;

    public Device() {

        super();
    }

    public Device(Identity identity, String manufacturer, String macAdress, String serialNumber, KindOfDevice kindOfDevice) {

        this();
        setLastModifiedBy(identity);
        this.manufacturer = manufacturer;
        this.macAdress = macAdress;
        this.serialNumber = serialNumber;
        this.kindOfDevice = kindOfDevice;
    }

    public String getIpAddress() {

        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {

        this.ipAddress = ipAddress;
    }

    public KindOfDevice getKindOfDevice() {

        return kindOfDevice;
    }

    public void setKindOfDevice(KindOfDevice kindOfDevice) {

        this.kindOfDevice = kindOfDevice;
    }

    public String getSerialNumber() {

        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {

        this.serialNumber = serialNumber;
    }

    public String getMacAdress() {

        return macAdress;
    }

    public void setMacAdress(String macAdress) {

        this.macAdress = macAdress;
    }

    public String getManufacturer() {

        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {

        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Device device = (Device) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(manufacturer, device.manufacturer)
                .append(macAdress, device.macAdress)
                .append(serialNumber, device.serialNumber)
                .append(ipAddress, device.ipAddress)
                .append(kindOfDevice, device.kindOfDevice)
                .isEquals();
    }

    @Override
    public int hashCode() {

        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(manufacturer)
                .append(macAdress)
                .append(serialNumber)
                .append(ipAddress)
                .append(kindOfDevice)
                .toHashCode();
    }

    public Collection<Peer> getPeers() {

        return peers;
    }

    public void setPeers(Collection<Peer> peers) {

        this.peers = peers;
    }
}
