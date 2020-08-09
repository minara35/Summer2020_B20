package day20_whileLoops;

import java.util.Scanner;

public class RemoveDuplicates {
    /*
    . write a program that can remove the duplicates from any given String
            Ex:
                input: abcabcaabb
                output: abc
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine(); // ab
        //           0123
        String result = ""; // a
        for(int i = 0; i <= str.length() - 1; i++){
        //  String s ="" + str.charAt(i); // a, b, a, b

            String s = str.substring(i, i+1);

            if(!result.contains(s)){ // if the character is already contained, we will not added
                result += s;
            }


        }
        System.out.println(result);



    }
}
