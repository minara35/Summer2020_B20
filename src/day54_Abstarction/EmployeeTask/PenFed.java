package day54_Abstarction.EmployeeTask;

import java.time.LocalDate;

public class PenFed {
    public static void main(String[] args) {
      Tester tester1 = new Tester("Polat Alemdar",'M', LocalDate.of(1973,11,20),"KABADAYI",1500000);
      // tester1.DOfB= LocalDate.of(2000, 11,20); can only read it, can not modify it

        System.out.println(tester1.gender);
        System.out.println(tester1.DOfB);

        Developer developer1 = new Developer("Comolokko",'F',LocalDate.of(1990,03,10),"SDET",111000);
       // developer1.gender= 'M';  can only read it, can not modify it
       // developer1.DOfB = LocalDate.of(1993, 11, 25);   can only read it, can not modify it

        System.out.println(developer1);




    }
}
