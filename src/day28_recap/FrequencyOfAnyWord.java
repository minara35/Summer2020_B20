package day28_recap;

import java.util.Scanner;

public class FrequencyOfAnyWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine(); // enter  catcatdogdog
        String word = scan.next(); // enter cat


        // String str = "catcatcatdogdog";
        // 0, 3 - index of word cat
        /*int count = 0; // to store frequency of word "cat"
        //
        for(int i= 0; i<=str.length()-3; i++){ // index of "cat"
           String r = str.substring(i, i+3);
           if(r.equals("cat")){
               count++;

           }


        }

         */


        int count = 0; // to store frequency of word "cat"
        //
        for(int i= 0; i<=str.length()- word.length(); i++) { // index of "cat"
            String r = str.substring(i, i + word.length());
            if (r.equals(word)) {
                count++;
            }
        }

                System.out.println(count);


    }
}
