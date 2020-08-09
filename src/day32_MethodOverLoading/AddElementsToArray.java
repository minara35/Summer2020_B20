package day32_MethodOverLoading;
/*
write a method that can add element to an array, the method accepts an array and and a number, then returns the new array by appending the number to the last index of the given array
        Ex:
            int[] arr = {1,2,3};
            int num = 4;
            addElement(arr, num); ===> {1,2,3,4}
            use for each loop

 */


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3};
        int num = 4;
        // {1,2,3,4}



        int[] arr2 = new int[arr.length+1];
        arr2[arr2.length-1]=num;  // to assign into last index as 4
        // 1,2,3, 0

       // System.out.println(Arrays.toString(arr2)); // 0,0,0,0
        int i =0;
        for(int each : arr){
           arr2[i]= each;
            i++;

        }
        System.out.println(Arrays.toString(arr2));

        System.out.println("======================");

        int[] score = {85,65,45,55,95};
        int n1 = 87;
       score = addElement(score,n1);
       Arrays.sort(score);
       System.out.println(Arrays.toString(score));




    }


    public static int[] addElement(int[] arr, int num){
        int[] arr2 = new int[arr.length+1];
        arr2[arr2.length-1]=num;  // to assign into last index as 4
        // 1,2,3, 0

        // System.out.println(Arrays.toString(arr2)); // 0,0,0,0
        int i =0;
        for(int each : arr){
            arr2[i]= each;
            i++;

        }
        return arr2;


    }

}
