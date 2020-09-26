package day58_Polymorphism;

import day57_Polymophism.EmployeeTask.Developer;
import day57_Polymophism.EmployeeTask.Employee;
import day57_Polymophism.EmployeeTask.ScrumMaster;
import day57_Polymophism.EmployeeTask.Tester;
import day57_Polymophism.PhoneTasks.Iphone;
import day57_Polymophism.PhoneTasks.Phone;
import day57_Polymophism.PhoneTasks.Samsung;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleINC {
    public static void main(String[] args) {
        Employee[] workers =  {
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new ScrumMaster("Kamil", 78945, "Scrum Master", 120000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new ScrumMaster("Kamil", 78945, "Scrum Master", 120000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M')
        };

        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(workers) );
        int countTesters =0;
        int countDevelopers = 0;
        int countScrumMaster =0;

        /*
        for(int i = 0; i <= phoneShop.size()-1; i++){
            Phone each = phoneShop.get(i);  // get each objects from array

            if( each instanceof Iphone  ){ // checks if the objects is Iphone
                countIphone++;
            }else if(each instanceof Samsung){ // checks if the object is samsung
                countSamSung++;
            }else {
                countHuaWei++;
            }

        }
        */

        for(Employee each  : employees) {
            if (each instanceof Tester) {
                countTesters++;
            }else if (each instanceof Developer) {
                countDevelopers++;
            }else{
               countScrumMaster++;
            }
        }

        System.out.println("Testers: "+countTesters);
        System.out.println("Developers: "+countDevelopers);
        System.out.println("Scram Master: "+countScrumMaster);




    }

}
