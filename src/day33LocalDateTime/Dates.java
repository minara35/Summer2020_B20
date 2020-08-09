package day33LocalDateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {
        LocalDate DOB =LocalDate.of(1990,10,29);
        System.out.println(DOB); //1990-10-29

        LocalDate today =LocalDate.now();
        System.out.println(today);
        LocalDate y = LocalDate.of(2019, 1,1);
        boolean result = y.isLeapYear();
        System.out.println(result);

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter year, month, date");
        int year = scan.nextInt();
        int month= scan.nextInt();
        int day = scan.nextInt();
        LocalDate d = LocalDate.of(year,month,day);
        System.out.println(d); //1978-02-28
        System.out.println(d.isLeapYear()); //false
    }
}
