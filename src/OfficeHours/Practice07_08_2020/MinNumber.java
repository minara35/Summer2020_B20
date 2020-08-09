package OfficeHours.Practice07_08_2020;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 2147483647;

        // Whatever user enters it will ALWAYS be less than 2147483647

        /*for(int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int n = scan.nextInt();

            if (n < min) {
                min = n;
            }
        }
            System.out.println(min);

         */


        int j = 1;
        while(j <= 5){

            System.out.println("Enter a number");
            int n = scan.nextInt();


            if(n < min){
                min = n;
            }

            j++;
        }
        System.out.println("min" + min);



    }
}
