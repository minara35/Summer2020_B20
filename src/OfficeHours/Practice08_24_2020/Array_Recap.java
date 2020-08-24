package OfficeHours.Practice08_24_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_Recap {
    /*
    Array
    Collection
    map
    Arrays Utility
    toString
    sort()
    equals()


     */
    public static void main(String[] args) {
        int [] arr1 = new int[5];
        //System.out.println(Arrays.toString(arr1));[0, 0, 0, 0, 0]

        arr1[0] = 10;
        arr1[arr1.length-1] = 20;
        System.out.println(Arrays.toString(arr1));
        System.out.println("==================");

        int [] arr2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr2));

        System.out.println(arr2[4] * arr2[1]); // 10
        System.out.println(arr2[0] * arr2[arr2.length-1]); //5

        System.out.println("================================");
        Scanner scan = new Scanner(System.in);
        String [] names = new String[5];


      /*  for(int i =0; i<= names.length-1; i++) {
            System.out.println("Enter enter Name");

            names[i] = scan.nextLine();
        }


       */

        for(int i = names.length-1; i>=0; i--){
            System.out.println("Enter enter Name");

            names[i] = scan.nextLine();
        }


        System.out.println(Arrays.toString(names));



    }
}
