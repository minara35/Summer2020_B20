package day16_String;

import java.util.Scanner;

public class EqualWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word ");
        String first = scan.next();
        System.out.println("Enter your second word");

        String second = scan.next();
        // if(first.equals(second)){

        // ternary
        String result = (first.equalsIgnoreCase(second)) ? "Equal" : "Not equal";
        // to ignore Case sencetivity
        System.out.println(result);



        /*
        if(first.equals(second)){
            System.out.println("They are equal");
        }else{
            System.out.println("They are not equal");
        }
         */

    }
}
