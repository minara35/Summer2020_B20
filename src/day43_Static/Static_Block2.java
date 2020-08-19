package day43_Static;

import day42_Static.Tester;

public class Static_Block2 { // main is for initilazing

    static int a ;
    static String b ;

    static Tester tester1 ;
    static Tester tester2 ;


    // static excelsheet excel =;

    static {
       a = 100;
       b ="Cybertek";
       tester1 = new Tester();
       tester1.setInfo("Mika", 'F', 8756L,"QA", 123000);
        tester2 = new Tester();
       tester2.setInfo("Hamit", 'M', 9878L, "SDET", 130000);
    }
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}
