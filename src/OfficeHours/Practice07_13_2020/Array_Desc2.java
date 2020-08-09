package OfficeHours.Practice07_13_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Desc2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number do you want enter");
        int sizeNum = scan.nextInt(); //5

        int[] arr = new int[sizeNum];
        for(int i =0; i <= sizeNum-1; i++){
            System.out.println("Enter a number");
          arr[i]= scan.nextInt(); // 0, 1, 2 ,3 ,4


        }
        System.out.println(Arrays.toString(arr)); // 3 = 3 4 5 --> [3, 4 5]
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
        System.out.println();

        int[] descArr = new int[sizeNum];
        int count = arr.length-1;
        for(int each: arr) {
            descArr[count] = each;
            count--;
        }
        System.out.print(Arrays.toString(descArr));




    }
}
