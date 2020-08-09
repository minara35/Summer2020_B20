package day24_Arrays;

import java.util.Scanner;

public class Uniques2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String uniques = "";

        for (int j = 0; j <= str.length() - 1; j++) {
            char ch1 = str.charAt(j); // a
            int count = 0; //1 +1 // frequency of char
            for (int i = 0; i <= str.length() - 1; i++) { // used for finding char  and issigned to int
                char each = str.charAt(i); // a  a  b c c
                if (ch1 == each) {
                    count += 1;
                }
            }
            if (count == 1) {// if it only occured one time
                uniques += ch1;
            }

        }
        System.out.println(uniques); // aabbc -> c unique
    }
}
