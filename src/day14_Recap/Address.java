package day14_Recap;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter building number");
        int buildingNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter street address");
        String streetAddress = scan.nextLine();
        System.out.println("State name");
        String state = scan.nextLine();
        System.out.println("Enter city name");
        String cityName = scan.nextLine();
        System.out.println("Enter ZIP code");
        int zipCode = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter Full Name");
        String fullName = scan.nextLine();
        System.out.println("\nShip to: " + fullName + "\n" + buildingNumber + " " +streetAddress
               + "\n"+cityName  +", "+ state + " " + zipCode );






    }
}
