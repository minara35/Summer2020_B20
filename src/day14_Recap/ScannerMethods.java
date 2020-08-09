package day14_Recap;

import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int num = scan.nextInt();
        boolean num = scan.nextBoolean();// we can enter ONLY  true or false
        System.out.println("You have entered" + num);

    }
}
