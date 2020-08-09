package day13_Scanner;

import java.util.Scanner;

public class NextLine_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// Enter
        System.out.println("Enter Building Number: "); //1340
        int buildingNum = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Street name: ");
        String streetName = scan.nextLine();
        System.out.println(buildingNum+ " "+streetName );
        scan.close();






    }
}
