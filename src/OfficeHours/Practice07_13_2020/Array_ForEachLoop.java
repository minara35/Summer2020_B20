package OfficeHours.Practice07_13_2020;

import java.util.Arrays;

public class Array_ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {98, 97,100,200,55,60};

        Arrays.sort(arr); // 55 97 98 100 200
        System.out.println(Arrays.toString(arr));
        int[] descArr = new int[arr.length];

        int count = arr.length-1;
        for(int each: arr){
            descArr[count] = each;
            count--;

        }
        System.out.print(Arrays.toString(descArr));


    }
}
