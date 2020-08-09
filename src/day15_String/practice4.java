package day15_String;

import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scan.next();// minara

        System.out.println("Enter your last name: ");
        String lastName = scan.next();// abdrakhmanova

        String fullName = firstName + " " + lastName; // minara abdrakhmanova
        fullName= fullName.toUpperCase(); // MINARA ABDRAKHMANOVA
        System.out.println(fullName);


    }
}
