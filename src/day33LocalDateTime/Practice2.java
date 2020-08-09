package day33LocalDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Practice2 {
    public static void main(String[] args) {
        String[] students = {"Minara", "Uluk", "Mirlan", "Elya", "Libov"};
        LocalDate[] birthDays ={
                LocalDate.of(1990,10,29),
                LocalDate.of(1989,07,20),
                LocalDate.of(1990,04,22),
                LocalDate.of(1990,06,20),
                LocalDate.of(1990,07,07) };

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMMM/dd/yy EEEE");


        //  Odina :  May/23/80 Monday

        for(int i =0; i <= students.length-1; i++){
            System.out.println(students[i]+" : "+ birthDays[i].format(dateFormat) );
        }







    }
}
