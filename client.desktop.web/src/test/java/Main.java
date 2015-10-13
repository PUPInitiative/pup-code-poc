import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by fabientronche1 on 25.09.15.
 */
public class Main {


    public static void main(String[] args) {

        Locale locale = Locale.getDefault();
        System.err.println(locale.getDisplayName());
        Calendar c = new GregorianCalendar(locale);
        System.err.println(c.getTimeZone());
        locale = Locale.CANADA;
        System.err.println(locale.getDisplayName());
        c = new GregorianCalendar(locale);
        System.err.println(c.getTimeZone());
        SimpleDateFormat sdf = new SimpleDateFormat();
    }
}
