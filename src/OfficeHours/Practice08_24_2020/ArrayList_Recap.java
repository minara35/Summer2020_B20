package OfficeHours.Practice08_24_2020;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
array fixed size
supports primitive or non primitive

collection: dynamic size (add, remove)
ONLY supports non-primitive

bulk operation accepts only collection type
addAll()
removeAll() - removes
retainAll() - keeps - oposit of removeAll
containAll()


Collections Utility:
swap
max
sort
set
get
sort()





 */
public class ArrayList_Recap {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10,20,30,50));
        System.out.println(list1); //[10, 20, 30, 50]

        for(int each : list1){
            System.out.println(each);
        }


        System.out.println("============================");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(30,40,50,60,70,80,90,100,200));


        // remove 40,50,90,100

        list2.removeAll(Arrays.asList(40,50,90,100));
        System.out.println(list2); //[30, 60, 70, 80, 200]
        Collections.swap(list2, 0,list2.size()-1);
        System.out.println(list2); //[200, 60, 70, 80, 30]

        System.out.println(list2.get(0)); //200
        System.out.println(list2.get(list2.size()-1)); //30

        // arr[0]=300;
        list2.set(0,300);
        System.out.println(list2); // [300, 60, 70, 80, 30]


        Collections.sort(list2);
        System.out.println(list2); //[30, 60, 70, 80, 300]

        System.out.println("=================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed", "Minara", "Elnura", "Nurba", "Askat", "Alan", "Ahmed"));
        names.removeIf(p->p.equals("Ahmed"));
        System.out.println(names);

        System.out.println("=================");


        ArrayList<Integer> grades = new ArrayList<>();
        grades.addAll(Arrays.asList(50,65,45,55,75,85,95,98,200,87,40,56,62));
        grades.removeIf(p -> p < 60);
        System.out.println(grades);// [65, 75, 85, 95, 98, 200, 87, 62]

ArrayList<String> students = new ArrayList<>();
students.addAll(Arrays.asList("Violet", "Begaim", "Asel", "Uluk", "Elvira"));

// names to keep in Array list Asel, Uluk

        students.retainAll(Arrays.asList("Asel", "Uluk"));
        System.out.println(students); //[Asel, Uluk]



    }
}
