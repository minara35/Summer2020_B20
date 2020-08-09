package day13_Scanner;

import java.util.Scanner;

public class Next_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your first name: "); // Cybertek  ONE WORD
        String firstName = scan.next();
        scan.next();// School
        System.out.println("Enter your last name: ");
        String lastName = scan.next();

        String fullName = firstName + " " +lastName;
        System.out.println("Full name is: " + fullName);










    }
}
