package OfficeHours.Practice08_24_2020;

import java.util.Arrays;
 /*
    Array
    Collection
    Map
    Arrays Utility:
           toString: to print array
           sort: ascending order
           equals: compares two arrays
           asList:  to convert Object Arrays to Collection Type
     */

public class Arrays_Recap2 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,6,7,8};
        for(int each : nums){
            if(each % 3 !=0){
                continue; // skips even num
            }
            System.out.print(each + " ");
        }
        System.out.println();

        String [] names = {"Mika", "Milan", "Elkem", "Aysen"};
        for(String each : names){
            if(!each.toLowerCase().contains("m")){
                continue;
            }
            System.out.print(each + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(names));//[Mika, Milan, Elkem, Aysen]
        System.out.println("====================================================");

        int[] arr1 = {89,79,400,0, -100, -200, 59};
        Arrays.sort(arr1);

        System.out.println( Arrays.toString(arr1) );

        String[] students = {"Mawlan", "Memetjan", "Askat" ,"Nickolas", "Elkem", "Aysen"};
        Arrays.sort(students);

        System.out.println(Arrays.toString(students));


        System.out.println("===============================================");

        int[] a1 = {1,2,3,4};
        int[] a2 = {1,2,4,3};
        System.out.println(  Arrays.equals(a1,a2)   );  // checks elements at each indexes one by one

        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(  Arrays.equals(a1,a2)   );

    }
}
