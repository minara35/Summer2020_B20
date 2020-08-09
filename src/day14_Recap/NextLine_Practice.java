package day14_Recap;

import java.util.Scanner;

public class NextLine_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter gender:");
        String gender = scan.next();


        System.out.println("Enter your age:");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Country name:");
        String countryName = scan.nextLine();
        scan.nextLine();
        System.out.println("Enter zip cod:");
        int zipCod = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter full name:");
        String fullName = scan.nextLine();

        System.out.println("Enter company name");
        String companyName = scan.nextLine();















    }
}
