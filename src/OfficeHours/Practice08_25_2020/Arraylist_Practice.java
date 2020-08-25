package OfficeHours.Practice08_25_2020;


import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist_Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println(list1);


        Integer[] nums1 = {80,90,100};
        ArrayList<Integer>list2 = new ArrayList<>();
        list2.addAll(list1);
        list2.addAll(Arrays.asList(50,60,70));
        list2.addAll(Arrays.asList(nums1));
        System.out.println(list2);
       // list2.remove(8); // remove the index 80
       // Integer a =80;
      //  list2.remove(new Integer(a));
       // list2.remove(new Integer(30));
       // list2.remove(new Integer(70));
        list2.removeAll(Arrays.asList(90,30,70));
        list2.removeIf(p-> p > 50); // if object value greater than 50 that will be removed
        System.out.println(list2);
        list2.addAll(Arrays.asList(100,200, 300, 100, 100));
        list2.retainAll(Arrays.asList(100, 200, 300));

        System.out.println(list2);
        System.out.println("Size " + list2.size()); //5
        list2.clear(); //removes everything
        System.out.println(list2); //[]
        System.out.println(list2.isEmpty()); // true
        System.out.println("==================================");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        //list3.set(list3.size()-1, 30);
        System.out.println(list3);
        for(int i =0; i<=list3.size()-1; i++){
          Integer each =   list3.get(i); // gets each element
            if(each % 2 !=0){
                list3.set(i, each*2);

            }else{
                list3.set(i, each*3);

            }

        }
        System.out.println(list3);


        System.out.println("==================================");

        ArrayList<String> countries = new ArrayList<>();
        countries.addAll(Arrays.asList("America", "Russia", "Canada", "Australia", "England", "Kyrgyzstan" ));
       // countries.removeIf(p-> p.endsWith("a"));
        countries.removeIf(p -> p.charAt(p.length()-1) == 'a'); //remove if last char end with 'a'

       // countries.removeIf(p->p.startsWith('A'));
        countries.removeIf(p->p.charAt(0) =='A');
        System.out.println(countries);


    }
}
