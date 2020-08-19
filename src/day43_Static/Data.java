package day43_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class Data {
    static int[] arr= new int [3]; //1,2,3



    static ArrayList<Integer> list = new ArrayList<>();



   // public static void main(String[] args) {
    static {
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        list.add(4);
        list.add(5);
        list.add(6);
       System.out.println("Static block");

        //System.out.println(Arrays.toString(arr));
        //System.out.println(list);
    }

}
