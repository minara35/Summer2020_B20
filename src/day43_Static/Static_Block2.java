package day43_Static;

import day42_Static.Tester;

public class Static_Block2 { // main is for initilazing

    static int a ;
    static String b ;

    static Tester tester1 ;

    static {
       a = 100;
       b ="Cybertek";
       tester1.setInfo("Mika", 'F', 8756L,"QA", 123000);

    }
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}
