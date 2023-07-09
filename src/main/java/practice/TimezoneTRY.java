package practice;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.TimeZone;

public class TimezoneTRY {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        DateTimeFormatter simpleformat = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

        // displaying date


        LocalDateTime localNow = LocalDateTime.now(TimeZone.getTimeZone("Europe/madrid").toZoneId());
        ZonedDateTime zoneNow = ZonedDateTime.now(TimeZone.getTimeZone("Europe/Madrid").toZoneId());
        System.out.println("Today's date and time = "+zoneNow.format(simpleformat));
//        System.out.println(localNow.format(simpleformat));

//        ISO8601DateFormat.format(date, true)


    }
}
