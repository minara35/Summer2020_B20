package day23_Arrays;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Enter your number");
            double num1 = scan.nextInt();
            double num2 = scan.nextInt();
            System.out.println("Enter math operator");
            char o = scan.next().charAt(0);

       /*    double result = (o =='+')? num1 + num2 : (o == '-')? num1 -num2 : (o== '/')? num1/num2
                    : (o == '*')? num1*num2 : (o == '%')? num1 % num2 : 0;



            System.out.println(result); // 10, 3 % = 1.0;  10, 4 & = 0.0

        */

            switch(o){
                case '-': // substraction
                    System.out.println(num1-num2);
                    break;
                case'+':
                    System.out.println(num1 + num2);
                    break;
                case '/': // division
                    System.out.println(num1 / num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '%':
                    System.out.println(num1 %num2);
                    break;
                default:
                    System.out.println("Invalid Operator");

            }



            System.out.println("Do you want to continue");
            String answer = scan.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))){ // while the answer is invalid
                System.out.println("Invalid answer, please enter yes or no");
                System.out.println("Do you want to continue");
                answer = scan.next().toLowerCase(); // 30, 40 , !sure , !okay, "yes"

            }

            if(answer.equalsIgnoreCase("no")){
                break;
            }
        }
        System.out.println("Thanks for using Cybertek' Calculator");
        System.exit(0);




    }

}
