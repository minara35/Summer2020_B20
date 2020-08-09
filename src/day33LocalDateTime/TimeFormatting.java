package day33LocalDateTime;
/*
year: yy, yyyy
Month: MM(number) MMM(three letters), MMMM(full Name)
days: dd
days name: E(week day three letters), EEEE(full name)


 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatting {
    public static void main(String[] args) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMM/dd/yyyy, EEEE");
        LocalDate ld= LocalDate.of(2020,07,25);
        System.out.println(ld);
        System.out.println(ld.format(dateFormat)); // Jul/25/2020, Saturday

        /*
        hours: hh
        minutes: mm
        seconds: ss
        am/pm: a
         */

        LocalTime now = LocalTime.now();
        System.out.println(now);

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now1 = LocalTime.now();
        System.out.println(now1);
        System.out.println(now1.format(timeFormat));

        // May/20/2019 DayName 4:30pm









    }
}
