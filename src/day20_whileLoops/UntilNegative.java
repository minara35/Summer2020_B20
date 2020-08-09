package day20_whileLoops;

import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {

/*
Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
            hint: you need an infinite loop

 */

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for(int i =0; i == 0;) { // we can use i <100
            System.out.println("enter a number");
            int num = scan.nextInt();
            if (num < 0) {
                break;
            } else {
                sum += num;
            }
        }
            System.out.println("sum is: " + sum);


    }
}
