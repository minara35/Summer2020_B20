package OfficeHours.Practice07_13_2020;

import java.util.Arrays;

public class CombineTwoArray_ForLoop {
    public static void main(String[] args) {
        char[] a1 = {'A','B', 'C'};
        char[] a2 = {'D', 'E', 'F', 'G', 'H'};
        char[] a3 = new char[a1.length+a2.length]; //{'A','B', 'C', 'D'}; // index

        int index =0;
        for(int i=0; i<= a1.length-1; i++){
            a3[index]= a1[i];
            index++;

        }
        for(int j=0; j<= a2.length-1; j++) {
            a3[index] = a2[j];
            index++;
        }
        /*
         for(int i = 0; i <= a1.length-1; i++){
            a3[i]  = a1[i];
        }

        for(int j = 0; j <= a2.length-1; j++ ){
            a3[j+a1.length] = a2[j];
        }

        /*
        int j = 0;
        while(j <= a2.length-1){
            a3[index] = a2[j];
            index++;
          j++  ;
        }
*/




        System.out.println(Arrays.toString(a3));// [A, B, C, D, E, F, G, H]
        }
}
