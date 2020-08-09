package OfficeHours.Practice07_13_2020;

import java.util.Scanner;

public class FrequencyOfWord {
    public static void main(String[] args) {

            String str = "dog dog dog cat cat cat cat cat cat Dog Dog Dog";
            str = str.toLowerCase();

            int countOfDog = 0; // 1+1+1

            while(str.contains("dog")){//: true true true false
                str = str.replaceFirst("dog", "");
                //"dog dog"
                //"dog"
                //""
                countOfDog++;
            }

            int countOfCat = 0;

            while(str.contains("cat")){
                str = str.replaceFirst("cat", "");
                countOfCat++;
            }



            System.out.println("Dog: "+countOfDog);
            System.out.println("Cat: "+countOfCat);

            System.out.println(countOfDog);
            System.out.println(str);
            System.out.println( countOfCat == countOfDog );


        System.out.println("====================================");
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
      if (word.contains("java")){
        char ch =  word.charAt(0);
        char ch1 = word.charAt(1);
        exists =true;

        }else {
          exists = false;
      }
        System.out.println(exists);


        }

}
