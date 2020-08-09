package day13_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String yourName = scan.nextLine();

        System.out.println("Enter company name: ");

        String companyName = scan.nextLine();
        System.out.println("Your name: " + yourName);
        System.out.println("Company name: " + companyName);






    }
}
