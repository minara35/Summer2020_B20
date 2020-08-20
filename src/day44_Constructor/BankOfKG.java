package day44_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

//import static day44_Constructor.HumanResources.*; // imports all static from Humanresource

public class BankOfKG {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
       /* list.addAll(Arrays.asList(employee1,employee3, employee5));
        // by using static import we are ablee to import the static memberes so can call them without the class name
        //list.add(HumanResources.employee1);
       // list.add(HumanResources.employee3);
        //list.add(HumanResources.employee5);

        */
        list.addAll(Arrays.asList(HumanResources.employee1, HumanResources.employee3, HumanResources.employee2));
        System.out.println("Total Number of employees: "+ list.size());


        System.out.println("=============================================");

        for(Employee each : list){
            System.out.println(each.name + " : " + each.salary);
        }
    }
}
