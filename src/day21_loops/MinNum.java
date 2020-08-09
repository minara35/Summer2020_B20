package day21_loops;

import java.util.Scanner;

public class MinNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 9999999;

        for(int i = 1; i <= 5; i++){
            System.out.println("Enter number");
            int num = scan.nextInt();

            if (num < min){
                min = num;

            }

        }
        System.out.println("Min num: " + min);
    }
}
