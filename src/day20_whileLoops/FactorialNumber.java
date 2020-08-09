package day20_whileLoops;

import java.util.Scanner;

public class FactorialNumber {
    /*
    Write a program that can return the factorial number of any given number
        Ex:
            input: 5
            output: 120
            because: 5! = 5 * 4 * 3 * 2* 1 = 120

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      double result = 1; // 5 * 4 * 3*2 *1
        int n = scan.nextInt();

        for(int i = n; i >= 1; i--){ // i: 5, 4, 3, 2,1
            result *= i;
        }
        System.out.println(result);


    }
}
