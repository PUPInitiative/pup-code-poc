package info.pupcode.model.cfg;

import javax.persistence.Embeddable;

/**
 * Created by fabientronche1 on 07.11.15.
 */
@Embeddable
public enum KindOfDevice {
    PERSONAL_COMPUTER(0),
    SMARTPHONE(1),
    TABLET(2);

    private int id;

    KindOfDevice(int id) {

        this.id = id;
    }
}
