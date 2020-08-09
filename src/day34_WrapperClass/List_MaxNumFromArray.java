package day34_WrapperClass;

import java.util.ArrayList;

public class List_MaxNumFromArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(23);
        list.add(45);
        list.add(3);
        list.add(78);
        list.add(98);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int each : list){

            if(each > max){
                max =each;
            }if(each < min){
                min =each;
            }

        }
        System.out.println("Max "+max);
        System.out.println("Min " + min);
    }
}
