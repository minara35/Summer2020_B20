package day41_Static;

public class PrintingCustomClassObjects {
    public static void main(String[] args) {
        String str = new String("Cybertek");
        System.out.println(str);// Cybertek object name
        System.out.println(new String("School")); // object


        System.out.println(str.toString());// Cybertek object name
        System.out.println(new String("School").toString()); // object

        System.out.println("========================");
        Carpet c1 = new Carpet();
        c1.customOrder(5,6,19,true);
        System.out.println(c1);
    }
}
