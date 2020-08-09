package OfficeHours.Practice07_01_2020;

import java.util.Scanner;

public class CombineTwoString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next(); // ight

/// first:
        char ch1 = str1.charAt(str1.length()-1); // last char from str1
        char ch2 = str2.charAt(0); // first char from str2
        if(ch1 == ch2){
            System.out.println(str1 + str2.substring(1));//excluding the first char of the second
        }else {
            System.out.println(str1 + str2);
        }

        //second approche



        String s1 = str1.substring(str1.length()-1);
            // substring(2) ==> e
        String s2 = str2.substring(0, 1); // ==> e

        if(s1.equals(s2) ){
            System.out.println(str1 + str2.substring(1));
        }else {
            System.out.println(str1+str2); // nineight condence 2e in 1e
        }


        // third:
        String c1 = "" + str1.charAt(str1.length()-1); // last char from str1
        String c2 = ""  + str2.charAt(0); // first char from str2
        if(c1.equals(c2) ){
            System.out.println(str1 + str2.substring(1));//excluding the first char of the second
        }else {
            System.out.println(str1 + str2);
        }
    }




}
