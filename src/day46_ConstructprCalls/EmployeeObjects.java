package day46_ConstructprCalls;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Cristina");
        System.out.println(employee1);

        System.out.println("==================================");
        Employee employee2 = new Employee("Mika", "SDET");
        System.out.println(employee2);
        System.out.println("==================================");

        Employee employee3 = new Employee ("Ulan", "QA", 2374687);
        System.out.println(employee3);
        System.out.println("==================================");

        Employee employee4 = new Employee ("Alan", "QA", 2374687, 150000);
        System.out.println(employee4);

        System.out.println("==================================");

        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>(list1);
        ArrayList<Integer> list3 = new ArrayList<>( Arrays.asList(1,2,3,4,5) );



    }
}
