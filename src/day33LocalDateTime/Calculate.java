package day33LocalDateTime;

import java.util.Arrays;

/*
1. create a method that can calculate the addition of two integers
        2. create a method that can calculate the addition of two decimals
        3. create a method that can calculate the multiplication of two integers
        4. create a method that can calculate the multiplication of two decimals

 */
public class Calculate {
    public static void main(String[] args) {
        int a =10;
       double b =20;
        System.out.println(addition(a,(int)b));
        float num1 = 10;
        float num2 = 9;
        System.out.println(addition((int)num1, (int)num2)); //will be double 19.0 because we can

        System.out.println(addition(90, 5.5 ));
        System.out.println(addition(10,30));

        int[] arr1 = {4,2,5,7};
        Arrays.sort(arr1);
        char[] arr2 = {'c', 'b', 'a'};
        Arrays.sort(arr2);

        System.out.println("Cybertek");
        System.out.println('A');
        System.out.println(123);
        System.out.println(12.5);

        long l1 =100;
        long l2 =200;
        System.out.println(multiplication((int)l1,l2)); // double will exicute




    }
    public static int addition(int a , int b){
        return a+b; //10
    }
    public static double addition(double a, double b){
        return a+b; // 10.2
    }

    public static double addition(double a, int b){
        return a+b; //10.2
    }

    public static int multiplication(int a, int b){
        return a*b;
    }
    public static double multiplication(double a, double b){
        return a*b;
    }

}
