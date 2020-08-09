package day37_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Minara");
        students.add("Mukhtar");
        students.add("Alan");
        students.add("Talant");
        students.add("Uluk");

        // verify that the names Ulku, Bursa are contained in students lisst
        boolean r = students.containsAll(Arrays.asList("Ulku", "Bursa","Dan"));
        System.out.println(r); // false

        System.out.println("====================");
        ArrayList<String>  group1 = new ArrayList<>();
        // add all student names in your group

        group1.addAll(Arrays.asList("Mike", "Zak","Aizhan","Saim" ));
        // verify your mentor and one of your closest friend' names are contained in the list
        boolean r2 = group1.containsAll( Arrays.asList("Murodil", "Kuzzat") );

        System.out.println(r2);


        System.out.println("====================================================");

        ArrayList<String> employees =new ArrayList<>();
        employees.addAll( Arrays.asList( "Ahmed", "Muhtar", "Ahmed", "Virginia", "Beslan", "Ibrahim", "Ahmed") );

        System.out.println(employees);

        employees.retainAll(  Arrays.asList("Ahmed", "Dawud")  );
        System.out.println(employees);









    }
}
