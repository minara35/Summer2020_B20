package day15_String;

//import java.util.Scanner;

public class String_Intro {
    public static void main(String[] args) {
        String str = "Cybertek"; // literal object
        // Scanner scan = new Scanner(System.in);

        String name = new String("Cybertek");
        String s1 = "cat"; //String literal will save in one String poole
        String s2 = "cat";// String literal
        System.out.println(s1 == s2); // true
        // cat == cat
        String d1 = "Dog"; // String literal
        String d2 = "dog";// String literal will save just ONE Object in String poole
        System.out.println(d1 == d2); // false

        String t1 = new String("tiger"); // 1 new object in Java hipe  in different locations it will return FALSE
        String t2 = new String("tiger");//  1 new object in Java hipe
        System.out.println((t1==t2));// false

        String c1 = "Cybertek"; // String pool
        String c2 = new String("Cybertek"); // heap
        String c3 = new String ("cybertek"); // heap
        String c4 = "Cybertek"; // String pool
        String c5 = "cybertek"; // will be new String pool because cansentetive
        System.out.println(c1 == c2); // false
        // Cybertek = new String (Cybertek);

        System.out.println(c2 == c3); // false
        // new String (Cybertek) == new String (Cybertek);
        System.out.println(c1 == c4); // true
        // Cybertek == Cybertek;

        System.out.println(c4 == c5); // false because 2 different objects
        // Cybertek == cybertek;









    }


}
