package day43_Static;

import java.util.Arrays;
import static Library.Resources.a; // only imports specific member
import static Library.Resources.*; // imports all class member from Library


public class Test {
    public static void main(String[] args) {

        System.out.println(Static_Block3.a);
        System.out.println(Static_Block3.b);
        System.out.println(Static_Block3.c);


        System.out.println(Arrays.toString(Data.arr));
        System.out.println(Data.list);

        System.out.println("===================");

        System.out.println(a);


    }
}
