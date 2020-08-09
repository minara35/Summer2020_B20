package day22_NestedLoop;

import java.util.Scanner;

public class UpperCaseLowerCase {
    /*
     1. Write a program that asks user to enter a string. If string started with uppercase and ends with lowercase letter then print true, otherwise print false
        Ex:
           Input: Cybertek
           output: true
           Input: CyberteK
           output: false

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter String");
        String str = scan.next();
        char ch1 = str.charAt(0);
        char last = str.charAt(str.length()-1);
        boolean start = ch1>='A' && ch1 <= 'Z'; // upperCase
        boolean end = last >='a' && last <='z';  // lowerCase
       // System.out.println(start && end);
        if (start && end){
            System.out.println("true");// Alan true
        }else{
            System.out.println("false");// alan false
        }





    }
}
