package day35_ArrayList;

import java.util.ArrayList;
/*
 1. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
 */

public class ReverseOrder {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(10); // autoBoxing 0
        list.add(20);// 1
        //list.add(3,30); // 2 // can not skip index
        list.add(2,30);
        list.add(40);//3
        list.add(50); //4

        System.out.println(list);
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");// 50 40 30 20 10

        }

    }
}
