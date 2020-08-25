package OfficeHours.Practice08_25_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90));
        //                          0  1 2   3  4  5  6 7   8

        Collections.swap(list1,0,1); // swap 10 and 20
        Collections.swap(list1,list1.size()-2,list1.size()-1); // swaping  num index 2 and last index  num

        System.out.println(list1); //[20, 10, 30, 40, 50, 60, 70, 80, 90]

        Collections.sort(list1);
        System.out.println(list1);

       Integer max =  Collections.max(list1); // autoboxing
        System.out.println("max num"+max);

       // Integer min = Collections.min(list1);
        //System.out.println("min num " + min);
        System.out.println("min num " + Collections.min(list1));
        int max1 = Collections.max(list1); // unboxing
        System.out.println(max1);


        System.out.println("====================================");
        String [] arr = {"Eggs", "Orange", "Milk", "Toilet paper", "Milk", "Toilet paper", "Avacado"};


        ArrayList<String> item = new ArrayList<>();
        item.addAll(Arrays.asList(arr));
        System.out.println(item);
       int  count =Collections.frequency(item, "Toilet paper");
       item.removeIf(I -> Collections.frequency(item,I) !=1); // removing not uniques elements

        System.out.println(count);//2
        System.out.println(item); //[Eggs, Orange, Avacado]



    }
}
