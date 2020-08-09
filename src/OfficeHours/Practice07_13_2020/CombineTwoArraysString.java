package OfficeHours.Practice07_13_2020;

import java.util.Arrays;

public class CombineTwoArraysString {
    public static void main(String[] args) {
String[] a1= {"Minara", "Alla", "Hamit"};
String[] a2 = {"Alan", "Talant", "Ulan"};
String[] students = new String[a1.length + a2.length];

        int index =0;
        for(int i=0; i<= a1.length-1; i++){
            //students[0]= a1[0];
            students[i]= a1[i];


        }
        for(int j=0; j<= a2.length-1; j++) {
            students[j + a1.length] = a2[j];
            index++;
        }
/*
 for(int i = 0; i <= a1.length-1; i++){
             students[i] =  a1[i];
        }

        for(int j= 0; j <= a2.length-1; j++){
             students[j+a1.length] = a2[j];
        }
 */

        System.out.println(Arrays.toString(students));//[Minara, Alla, Hamit, Alan, Talant, Ulan]
    }
}
