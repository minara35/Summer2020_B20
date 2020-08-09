package OfficeHours.Practice07_13_2020;

public class Max_3DArray {
    public static void main(String[] args) {
        //                     0      1        0        1        0     1
        int[][][]  arr3D ={ {{1,2}, {3,4}}, {{4,5,7}, {6,8}}, {{9,8},{10,11}} };
        //                       0                  1              2
 int max = arr3D[0][0][0];

 for(int[][] each2D : arr3D){
     for(int [] each1D : each2D){
         for (int eachElement : each1D){
         if(eachElement > max){
          max = eachElement;
         }
     }
 }
 }
        System.out.println("Max num: " + max);

    }

}