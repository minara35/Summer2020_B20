package day30_CustomMethods;

import java.util.Arrays;

public class ReturnMethods4 {
    public static void main(String[] args) {
        int [] a1 ={1,2,3};
        int [] a2 ={4,2,3};
       int [] c = combine2Arrays(a1, a2);
        System.out.println(Arrays.toString(c)); // [1, 2, 3, 4, 2, 3]
        System.out.println(c[0]);


    }
    public static int[] combine2Arrays(int[] arr1, int[] arr2) {
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

        return arr3;
    }
}