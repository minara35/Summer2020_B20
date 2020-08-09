package day13_Scanner;

import java.util.Scanner;

public class NextLine_VS_NextMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// enter
        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();// 12000
        scan.nextLine();// we use to take out the Enters that are left in the scanner.so we can use the nextLine


        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine(); // enter
        System.out.println("Salary: " + salary);
        System.out.println("full name: " + fullName);


    }

}
