package day16_String;

import java.util.Scanner;

public class WarmUp_Tasks {

    /*
    Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

     */
    public static void main(String[] args) {
        // extra task:
        String str = "I like to drink Pepsi";
        String drink = str.substring(16);
        System.out.println(drink);
        String action = str.substring(10, 15);
        System.out.println(action);


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first words:");
        String word1 = scan.next();// apple
        System.out.println("Enter second word: ");
        String word2 = scan.next(); // banana
        //String result = word1.substring(1).concat(word2.substring(1));
        String result = word1.substring(1) + word2.substring(1);


        System.out.println(result);
    }
}
