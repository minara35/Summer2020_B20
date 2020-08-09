package OfficeHours.Practice07_13_2020;

import java.util.Arrays;

public class Max2D_Array_2 {
    public static void main(String[] args) {


        //                 0 1 2    0 1 2 3    0 1  2 3  4
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}}; // we can store dementional arr as many we want
        //                  0        1          2

        int max = arr2D[0][0];
        for (int[] each1D : arr2D){ //  to get each one dementional array
         // System.out.println(Arrays.toString(each1D));//
            /*
            [1, 2, 3]
[4, 5, 6, 7]
[8, 9, 10, 11, 12]
[13, 14, 15, 16, 17, 18]

             */

            for(int eachNum : each1D){ // to get each element
                if(eachNum > max){
                    max = eachNum;
                }
            }
        }
        System.out.println("max num: " + max);

    }
}