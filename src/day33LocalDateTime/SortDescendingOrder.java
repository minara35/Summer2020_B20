package day33LocalDateTime;
/*
 1. create a return method that can return an int array in descending order
        2. create a return method that can return a double array in descending order
        3. create a return method that can return a String array in descending order
        4. create a return method that can return a char array in descending order


 */

import java.util.Arrays;

public class SortDescendingOrder {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,3};
        Arrays.sort(arr); // 1,2,3,4,6

        int[] arr2 = new int[arr.length];
        System.out.println(Arrays.toString(arr2)); //[0, 0, 0, 0, 0]
        int k= arr.length-1;
        for(int i=0; i<=arr.length-1; i++){
            arr2[i] = arr[k];
            k--;

        }
        System.out.println(Arrays.toString(arr2));


        System.out.println("=========================");

        int[] score = {100, 75, 85, 95,65};
       score = sortDesc(score);
        System.out.println(Arrays.toString(score));//[100, 95, 85, 75, 65]

        /*arr2[0]  = arr[arr.length-1];
        arr2[1] = arr[3];
        arr2[2] = arr[2];
        arr2[3] = arr[1];
        arr2[arr2.length-1] = arr[0];

         */


    }

    public static int[] sortDesc(int[]arr){
        Arrays.sort(arr); // 1,2,3,4,6

        int[] arr2 = new int[arr.length];
        System.out.println(Arrays.toString(arr2)); //[0, 0, 0, 0, 0]
        int k= arr.length-1;
        for(int i=0; i<=arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;

        }
        return arr2 ;

    }

    public static double[] sortDesc(double[] arr){
        double [] arr2 = new double[arr.length];
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr2)); //[0, 0, 0, 0, 0]
        int k= arr.length-1;
        for(int i=0; i<=arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;

        }
        return arr2 ;

    }

    public static char[] sortDesc(char[] arr) {
        char[] arr2 = new char[arr.length];
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr2)); //[0, 0, 0, 0, 0]
        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;

        }
        return arr2;
    }
    public static String[] sortDesc(String[] arr) {
        String[] arr2 = new String[arr.length];
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr2)); //[0, 0, 0, 0, 0]
        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;

        }
        return arr2;
    }
}
