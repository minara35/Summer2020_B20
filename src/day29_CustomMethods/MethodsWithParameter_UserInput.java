package day29_CustomMethods;

import java.util.Scanner;

public class MethodsWithParameter_UserInput {

    public static void main(String[] args) {
        printHello(5); // argument given num
        System.out.println("==================");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth year and current year ");
       // age(1990, 2020);
        age(scan.nextInt(), scan.nextInt());

    }



    public static void printHello(int numberOfTimes){ // how we are giving parameter by given user number
        for(int i=0; i< numberOfTimes ; i++){ // n - will give user any number will print by them
            System.out.println("hello world");
        }

    }




    public static void age(int birthYear, int currentYear){ // this method is reuseble
        if(currentYear < birthYear){ // to fix bug that age can't be negative
            System.out.println("Invalid enter");
        }else {
            int age = currentYear - birthYear;
            System.out.println("You are " + age + " years old");
        }

    }


}
