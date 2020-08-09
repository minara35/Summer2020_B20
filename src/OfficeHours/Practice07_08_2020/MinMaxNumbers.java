package OfficeHours.Practice07_08_2020;

import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = -2147483647;
        int min = 2147483647;

        for (int i = 1; i < 100; i++ ) {
            System.out.println("Enter a number");
            int n = scan.nextInt();

            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }

            System.out.println("min" + min);
            System.out.println("max" + max);
        }
    }

