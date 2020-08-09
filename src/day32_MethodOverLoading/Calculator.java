package day32_MethodOverLoading;

import java.util.Scanner;
/*
write a return method that accepts two numbers and an operator, then returns calculation result.
             if the oerator is invalid, return zero
             otherwise return the result

 */


public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your first number: ");
        double num1 =  scan.nextDouble();

        System.out.println("enter your second number: ");
        double num2 =  scan.nextDouble();

        System.out.println("Enter your math operator: ");
        char operator = scan.next().charAt(0); //
        double r = calculator(num1, operator, num2);
        System.out.println(r);
    }

    public static double calculator(double n1, char operator, double n2){

   double result  =(operator =='*')? n1*n2 : (operator =='/')? n1/n2 :(operator=='+')? n1+n2
   :(operator =='-')? n1-n2 : (operator =='%')? n1%n2 : 0;
        return result;
    }



}
