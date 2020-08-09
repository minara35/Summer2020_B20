package day23_Arrays;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {

        String[] month = {"Jan", "Feb", "March", "Apr","May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1~12");
        int n = scan.nextInt(); //3
        System.out.println(month[n-1]);

    }
}
