import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        //Date
        Date today = Calendar.getInstance().getTime();
        System.out.println(today);

        //int year = today.getYear(); //Deprecated -> 가능한 쓰지말라는 것
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println(year);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(today));

        //LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy--MM-dd HH:mm:ss");
        System.out.println(localDateTime.format(dateTimeFormatter));

        System.out.println(localDateTime.plusYears(1).plusMonths(1).plusDays(1).format(dateTimeFormatter));

    }

}
