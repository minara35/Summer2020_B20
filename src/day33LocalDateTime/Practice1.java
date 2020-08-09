package day33LocalDateTime;

import java.time.LocalDate;

public class Practice1 {
    public static void main(String[] args) {
        String[] students = {"Minara", "Uluk", "Mirlan", "Elya", "Libov"};
        LocalDate[] birthDays ={
                LocalDate.of(1990,10,29),
                LocalDate.of(1989,07,20),
                LocalDate.of(1990,04,22),
                LocalDate.of(1990,06,20),
                LocalDate.of(1990,07,07) };

        for(int i=0; i <= students.length-1; i++){
            System.out.println(students[i] + " " + birthDays[i]);
            /*
Minara 1990-10-29
Uluk 1989-07-20
Mirlan 1990-04-22
Elya 1990-06-20
Libov 1990-07-07

             */


        }

        System.out.println("=========================");

        for(LocalDate each :birthDays){
            if(!each.isLeapYear()){
                continue;
            }
            System.out.println(each);
        }

    }
}
