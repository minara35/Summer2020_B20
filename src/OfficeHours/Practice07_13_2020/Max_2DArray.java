package OfficeHours.Practice07_13_2020;

public class Max_2DArray {
    /*
    write a program that can find the maximum number from any given two dimentional array
     */

    public static void main(String[] args) {
        //                 0 1 2    0 1 2 3    0 1  2 3  4
        int [][] arr2D = {{1,2,3}, {4,5,6,7}, {8,9,10,11,12}, {13,14,15,16,17,18}}; // we can store dementional arr as many we want
        //                  0        1          2



     int max = arr2D[0][0]; // max from first array
        for(int j =0; j<= arr2D.length-1; j++) { // j: index numbers of arrays

            int[] eachArray = arr2D[j];
            for (int i = 0; i <= eachArray.length - 1; i++) { // i:  // get each element index elements
                int eachNum = eachArray[i];
                if (eachNum > max) {
                    max = eachNum;
                }
            }
        }
            System.out.println("Max num :" + max); // 12




    }

}
