package day33LocalDateTime;

import java.text.DecimalFormat;

public class FormatDecimal {
    public static void main(String[] args) {
        DecimalFormat m= new DecimalFormat("0.000");
       double a = 22/7.0;
        System.out.println(a);
        System.out.println(m.format(a));

        //6.6785432122222222
        System.out.println( m.format(6 ) ); //6.000000


    }
}
