package day37_ArraysList;

import Library.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/*
 write a program that can find the frequency of character from a String
                        DO NOT use nested loop
                        "AABBCCDDEE"  ==> "ABCDE"
                        output: A2B2C2D2E2

 */
public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = "AABBC";
        ArrayList<String> list = new ArrayList<>();
        list.addAll( Arrays.asList(str.split(""))   );

/*for(String each : str.split("")){
   list.add(each);
}
        System.out.println(list);

 */

String nonDup = Util.removeDup(str); // ABC  to avoid duplication

for(String each : nonDup.split("")) { // AABBC
    int count = Collections.frequency(list, each);
    System.out.print(each + count); //A2B2C1
}
    }

}
