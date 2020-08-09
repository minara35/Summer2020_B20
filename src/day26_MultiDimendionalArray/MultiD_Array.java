package day26_MultiDimendionalArray;

import java.util.Arrays;

public class MultiD_Array {
    public static void main(String[] args) {
        char[] ch1 = {'A', 'B'};
        char[] ch2 = {'C', 'D', 'E'};
        char[] ch3 = {'F', 'G', 'H'};
        //                 0,  1       0,  1    2     0    1     2
        char[][] ch2d ={ {'A', 'B'},{'C', 'D', 'E'},{'F', 'G', 'H'}};
        //                 0            1               2

        System.out.println(Arrays.toString(ch2d[1]));

        // H
        System.out.println( ch2d[2][2]);
        // C
        System.out.println(ch2d[1][0]);
        //G  B
        System.out.println(ch2d[2][1] +" "+ ch2d[0][1]);
        System.out.println("======================");
        // {1,2,3}, {4}, {5,6}, {7,8,9,10};

        //                0          1    2         3
        int[] [] arr1D = {{1,2,3}, {4}, {5,6}, {7,8,9,10}};

        // [7,8,9,10]

        System.out.println(Arrays.toString(arr1D[3]));
        // [1,2,3]
        // [4]
        // [5,6]
        // [7,8,9,10]
        for(int i =0; i <= arr1D.length-1; i++){
            System.out.println(Arrays.toString(arr1D[i]));
        }

        System.out.println("=======================");

        for (int[] a: arr1D) {
            System.out.println(Arrays.toString(a));
        }

        System.out.println(Arrays.deepToString(arr1D));
        }
}
