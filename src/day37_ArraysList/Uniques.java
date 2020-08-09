package day37_ArraysList;
/*
 1. write a program that can find the unique characters from a string
                        DO NOT use nested loop
                        "ABABCDEE"
                        output: C D

 */
import java.util.ArrayList;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {
        String str = "AAABBCDDEE";
        String uniques ="";
       /* ArrayList<Character> list = new ArrayList<>();
        for(char each : str.toCharArray()){ // represents every single character in this str
            list.add(each);


        }

        */
        ArrayList<String> list = new ArrayList<>();
        for(String each : str.split("")) { // represents every single character in this str
            list.add(each);
        }
        System.out.println(list); //[A, A, A, B, B, C, D, D, E, E]

for(String each : list) {
    int count = Collections.frequency(list, each);
    if (count == 1) {
     uniques += each;
    }
}
        System.out.println(uniques); //C

    }
}
