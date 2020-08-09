package day16_String;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class String_Method2 {
    public static void main(String[] args) {
        // isEmpty()


        String n1 = "main";
        System.out.println(n1.isEmpty() );

        String n2 = "";
        System.out.println(n2.isEmpty());


        // equals() CAN NOT IGNORE CASE SENCETETIVITY

        String str1 = "Java"; // String pool
        String str2 = new String("Java"); // heap
        System.out.println(str1+ " " + str2);
        System.out.println(str1 == str2); // false


        System.out.println(str1.equals(str2) );// true to compeare values use this equal method

        String str3 = new String("Java"); // heap
        String str4 = new String ("Java");// heap
        System.out.println(str3==str4);// false - because two different objects

        System.out.println(str3.equals(str4));


        String str5 = "Java"; // String pool
        String str6 = "Java"; // String pool
        System.out.println(str5==str6); // true
        System.out.println(str5.equals(str6)); // true

        String str7 = "JAVA";
        String str8 = "java";
        System.out.println(str7==str8);// false
        System.out.println(str7.equals(str8)); // false


        // equalsIgnoreCase()
        String str9 = "JAVA";
        String str10 = "java";
        System.out.println(str9.equalsIgnoreCase(str10));

        // contains() included or not
        String str = "I like to learn java programming language";
        System.out.println(str.contains("python")); // false
        System.out.println(!str.contains("python")); // true




        System.out.println(str.contains("java")); // true
        System.out.println(str.contains("JAVA"));// false


        //startsWith()

        String s1 = "Minara";
        System.out.println(s1.startsWith("M"));// true
        System.out.println(s1.startsWith("J"));// false


        System.out.println(s1.startsWith("Mi"));// true
        System.out.println(s1.toLowerCase().contains("mi"));//  true

        // endsWith()
























    }
}
