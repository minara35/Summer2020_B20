package day23_Arrays;

import java.util.Scanner;

public class Array_Practice {
    public static void main(String[] args) {
        //String student ="MInara", "Mukhatar ; // can take ONLY one data

        String[] students = {"Cybertek", "Minara", "Nadir", "Aiida"};
        //                     0           1          2        3
        // brackets we can put before or after varible name

        String name1 = students[1];
        System.out.println(name1);
        String name3 = students[3];
        System.out.println(name3);

        System.out.println("==================");

        String[] names = {"Mike", "Adam", "tonny", "John", "Amy"};
        int[] scores = {85, 70, 95, 90, 100};
        /*String n1 = names[0];
        int s1 = scores[0];
        System.out.println(n1+s1);

         */

       /* System.out.println(names[0] + " : " + scores[0]);
        System.out.println(names[1] + " : " + scores[1]);
        System.out.println(names[2] + " : " + scores[2]);
        System.out.println(names[3] + " : " + scores[3]);
        System.out.println(names[4] + " : " + scores[4]);

        */

        for(int i =0; i <=4; i++){
            System.out.println(names[i] + " : " + scores[i]);


        }
        System.out.println("==============");
        String[] classMates = new String[5]; //size is 5
        classMates[0] = "Fatih";
        classMates[2]="Mina";
        classMates[1] = "Vorole";
        classMates[3] = "Mike";
        classMates[4] = "Nike";

        for(int i=0; i <= classMates.length-1; i++){
            System.out.println(classMates[i]);
        }
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 8 items
        //and print two items at a time in 4 line
        //write your code below
        for(int k =0; k <=4; k++){
            System.out.println(arr[k] +" " + arr[1]);
        }








    }
}
