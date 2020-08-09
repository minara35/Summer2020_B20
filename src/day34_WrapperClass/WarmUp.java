package day34_WrapperClass;
/*
use the LocalDate&ime get the current date and time in the follow
 */

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

public class WarmUp {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyy");
       LocalDateTime today= LocalDateTime.now();

        System.out.println(today);
        System.out.println(today.format(dtf));



    }
}
