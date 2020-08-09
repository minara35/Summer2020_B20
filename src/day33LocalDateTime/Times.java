package day33LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Times {
    public static void main(String[] args) {


        //                            23           59         59
        LocalTime t1 = LocalTime.of(15, 45,55);
        System.out.println(t1); // 15:45:55

        LocalTime t2 = LocalTime.now();
        System.out.println(t2);//15:02:12.776

        LocalDateTime t3 = LocalDateTime.of(2020,07,25,15,30);
        System.out.println(t3); //2020-07-25T15:30

        LocalDateTime t4 = LocalDateTime.now();
        System.out.println(t4); //2020-07-25T15:40:10.869






    }
}
