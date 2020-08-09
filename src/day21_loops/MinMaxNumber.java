package day21_loops;

import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = -99999999; // any user entered input Will be greater then  -999999
        int min = 99999999;// any user entered input Will n=be less than 9999999

        for(int i=1; i<=5; i++){
            System.out.println("Enter number");
            int num = scan.nextInt();

            if( num > max) {
                 max = num;


            }if (num < min){
                min = num;
            }
        }
        System.out.println("Max num is: " + max);
        System.out.println("Min num is: " + min);
    }
}
