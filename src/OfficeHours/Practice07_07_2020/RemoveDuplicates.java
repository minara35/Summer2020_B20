package OfficeHours.Practice07_07_2020;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine(); // nal

        String result = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            String s = "" + str.charAt(i);
           /*

           if(result.contains(s)){
               continue;
           }else{
               result += s;

           }

            */

            if (!result.contains(s)) {
                result += s;

            }
        }
        System.out.println(result);


        System.out.println("============");

        String result2 = "";
        int index = str.length() - 1;
        while (index <= 0) {
            String s2 = "" + str.charAt(index);
            index++;
            if (!result2.contains(s2)) {
                result += s2;


            }
        }

            System.out.println(result2);


    }
}
