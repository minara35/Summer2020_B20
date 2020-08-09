package day30_CustomMethods;

import java.util.Arrays;

public class WarmUpTask {
    /*
     1. create a function that can print out the maximum number between two numbers
    2. create a function that can print out the array of integers in descending order
    3. create a function that can print out the combination of two integer arrays
    4.
        step1: create a function that can check if the given integer is positive, negative or zero
        step2: Use the above method to  write a program that can check every single elements of an array of Integers
        MUST use for each loop

     */
    public static void main(String[] args) {

        maxNum(3,3); // argument must match with parameter int
       int[] arr = {5,2,3,4,5,6,4,7,0,-5,-54,-55,-5,54,-45,-45,-45};
        printDesc(arr);

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {6,7,8,9,10,11,12,13,14};
        combine2Arrays(a1, a2);
        PosNegZero(100);

        System.out.println("========================");

        int [] a3 = {100,-100, -200, 0,0, 900, 5000};
        for(int each : a3){
            PosNegZero(each);
        }
    }

    // task1
    public static void maxNum(int n1, int n2){ // main method is function
       if(n1==n2){
           System.out.println("equal");
           return; // exist the method
       }
        if(n1>n2){
            System.out.println(n1 + " is max");
        }else{
            System.out.println(n2 + " is max");
        }


    }



    //task2
    //[1,2,3,4]====> 4,3,2,1

    public static void printDesc(int[] arr){ // 10,23,4,5,6
        Arrays.sort(arr);// 4 5 6 10 23
        //desending order - revers order

        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    //Task03: {1,2,3] {4,5,6}  ==> {1, 2, 3, 4, 5, 6}
    public static void combine2Arrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (int each : arr2) {
            arr3[i] = each;
            i++;
        }

        System.out.println(Arrays.toString(arr3));


    }

    // task4 positive negative num

    public static void PosNegZero(int num){
        if(num > 0){
            System.out.println(num + " is positive");
        }else if(num < 0){
            System.out.println(num+ " is negative");
        }else{
            System.out.println(num + " is zero");
        }




    }
}
