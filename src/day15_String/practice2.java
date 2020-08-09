package day15_String;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:"); // Cybertek
        String firstName = scan.next();
        System.out.println("Enter your last name:");  // School
        String lastName = scan.next();
        // String fullName = firstName.concat(" ".concat(lastName)); // CybertekSchool
       String fullName = firstName + " " + lastName;

        System.out.println("Your full name is: " + fullName);
        //System.out.println("Your full name is: ".concat(fullName));








    }
}
