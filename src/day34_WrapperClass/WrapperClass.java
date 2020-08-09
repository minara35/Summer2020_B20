package day34_WrapperClass;

import java.util.Arrays;

public class WrapperClass {
    public static void main(String[] args) {
        Integer num = 100;
        int a =100;


        byte t =100;
        int z= t;
        Integer z2 =z;


        Byte d =20;
        int n1 =d;
        byte b2 =40;
       // Integer n2 =b2; // compaile error

        Integer n3 = new Integer (123);
        Integer[] arr = new Integer[3];
        System.out.println(Arrays.toString(arr)); // [null, null, null]

        int p= 200;
        Integer p2= p;// AutoBoxing converting the primitive value to wrapper class

        Integer q1= 500;
        int q2= q1; // Unboxing converting the wrapper class values to primitive

        Double r1 = 300.0;  // wrapper class is only dedicated to its primitive decimal number
        double r2 = r1;

        long l1 =400;
        Long l2 = l1; //Autoboxing

        Float f1 =100.5f;
        Float f2 = f1; //














    }
}
