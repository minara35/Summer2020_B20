package OfficeHours.Practice07_06_2020;

public class Practice1 {
    public static void main(String[] args) {
     String str = " ";
     str.trim(); // ""

        System.out.println(str.isEmpty()); // false

        String str1 = " ";
       str1 = str1.trim(); // ""

        System.out.println(str1.isEmpty()); // true


        System.out.println("=============");

        String ta= "A ";
        ta = ta.concat("B "); // A B
        String tb = "C ";
        ta = ta +tb; // ABC
        ta.replace('C', 'B'); // ABD

        ta = ta + tb;
        System.out.println(ta);

        System.out.println("============");
        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1 ==s2 is" + s1 == s2);
        // "s1 == s2 is abc"  == "abc"
        // false






    }
}
