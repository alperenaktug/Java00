import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;

public class DateTimes {
    public static void main(String[] args) {


        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        Instant instant = Instant.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(instant);
    }
}
