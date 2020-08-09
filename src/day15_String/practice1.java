package day15_String;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String fName = scan.next();
        char ch1 = fName.charAt(0);

        System.out.println("Enter your last name:");
        String lName = scan.next();
        char ch2 = lName.charAt(0);
        System.out.println("Your initials is: "+ ch1 +". "+ ch2);



    }
}
