package day34_WrapperClass;
import Library.Util;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodCalls {
    public static void main(String[] args) {
        Integer[] arr1 ={1,2,3,4};
        Integer[] arr2 = {5,6,7,8};
        Integer[] arr3 = Util.combine2Arrays(arr1,arr2);
        System.out.println(Arrays.toString(arr3)); // [1, 2, 3, 4, 5, 6, 7, 8]


        Integer max = Util.maxNum(arr3);
        System.out.println(max); //8
Integer min = Util.minNum(arr3);
        System.out.println(min);//1

        System.out.println("=====================");


        Character[] ch = {'a', 'a', 'c', 'b', 'b', 'd'};
        ch = Util.sortDesc(ch);
        System.out.println(Arrays.toString(ch));


    }
}
