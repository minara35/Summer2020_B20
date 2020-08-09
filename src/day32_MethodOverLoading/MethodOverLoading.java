package day32_MethodOverLoading;

import java.util.Arrays;

public class MethodOverLoading {

    public static void main(String[] args) {
        int[] arr = {9,8,7};

        Arrays.sort(arr);

        String[] names = {"D", "C", "A"};
        Arrays.sort(names);


    }
    public static void method(int a){

    }
    public static void method(double a ){

    }
}
