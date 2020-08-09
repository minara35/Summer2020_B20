package day30_CustomMethods;

import java.util.Arrays;

public class ReturnedMethods3 {
    public static void main(String[] args) {
        int [] arr ={2,3,4,5,40};
       int num = max(arr);
        System.out.println("max num "+num);
        System.out.println(num > 50);



    }
    //             return type void never returns value
    public static int max(int[] arr){ // 2,3,4,5,40
        Arrays.sort(arr); // // 1 2 3 4 5 40
        int max = arr[arr.length-1]; // 40
        return max;


    }
}
