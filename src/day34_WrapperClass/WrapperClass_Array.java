package day34_WrapperClass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WrapperClass_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Integer[] arr1 = {1,2,3,4};
        for(int each:arr1){
            System.out.print(each + " "); // unboxing 1 2 3 4
        }
        System.out.println();
        Double[] arr3 = {1.0, 2.0, 3.0, 4.0};
      for(Double each : arr3){
          System.out.print(each + " "); // kicking 1.0 2.0 3.0 4.0
      }

        System.out.println();

      char[] arr5 = {65, 67,68,69};

        System.out.println(Arrays.toString(arr5)); //[A, C, D, E]


        char ch = 79;
        Character ch2 = 79;
        System.out.println(ch2); //O

        String[] nums1 = {"12.5", "13.5", "14.5", "15.5"};

        double[] nums2 = new double[nums1.length];

        for( int i = 0; i <= nums1.length-1; i++){
            nums2[i] = Double.parseDouble(nums1[i]) ;
        }


        System.out.println(Arrays.toString(nums2));





    }
}
