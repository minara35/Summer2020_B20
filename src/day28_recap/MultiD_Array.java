package day28_recap;

import java.util.Arrays;

public class MultiD_Array {
    public static void main(String[] args) {

        int[] arr1D = {1,2,3}; // single dementional array
        //               0 1 2   0 1 2   0 1 2
        int[][] arr2D ={{1,2,3},{4,5,3},{6,7,8}}; // multydemantional array  // we hve to use Arrays.deeptoString()
//                       0         1       2
        // {4,5,3}
        System.out.println(Arrays.toString(arr2D[1])); // to print  single dimentional int array [4,5,3]
        System.out.println(Arrays.deepToString(arr2D));// to print multidementional array [[1, 2, 3], [4, 5, 3], [6, 7, 8]]


        // 6
        System.out.println(arr2D[2][0]); // 6


        System.out.println("============================");
        for(int i =0; i<= arr2D.length-1; i++){ // iterates or gets each one dimentional array
            int[] each1DArray = arr2D[i]; // each1DArray is one dementional array
            //System.out.println(Arrays.toString(each1DArray)); //[1, 2, 3]
                                                                //[4, 5, 3]
                                                                //[6, 7, 8]

            for(int j = 0; j<=each1DArray.length-1; j++) { // iterates the elements of each single dementional array
                int eachNum = each1DArray[j];
                if (eachNum % 2 == 0) { // print even num
                    System.out.print(eachNum + " ");


                }
            }
            System.out.println(); // 1 2 3
            //4 5 3
            //6 7 8

        }


        System.out.println("=============================");

        for(int[] each1D : arr2D){
            for(int eachElement:each1D) {
                if (eachElement % 2 != 0) {


                    System.out.print(eachElement + " ");
                }
            }
            System.out.println();
           /*
            1 2 3
            4 5 3
            6 7 8
            */
        }
    }

}
