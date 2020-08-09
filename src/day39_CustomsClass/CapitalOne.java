package day39_CustomsClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {


        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();
        employee1.setEmployeeInfo("Mike", 'M', 123456787, "QA", 120000);
        employee2.setEmployeeInfo("Minara", 'F', 123485967, "QA", 130000);
        employee3.setEmployeeInfo("Kate", 'F', 768403957, "QA", 100000);
        employee4.setEmployeeInfo("Den", 'M', 548768475, "SDET", 123000);
        employee5.setEmployeeInfo("Hamit", 'M', 857943783, "SDET", 123400);
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList(employee1, employee2, employee3, employee4, employee5));

        //employeeList.removeIf(each -> each.salary < 120000);
        //employeeList.removeIf(each -> each.jobTitle.equals("QA"));
      //  employeeList.removeIf(each -> each.name.toLowerCase().contains("m"));
        employeeList.removeIf(each -> each.name.charAt(0)=='R');

        for(Employee each : employeeList){
            //each.getEmployeeInfo();
            System.out.println(each.name + " : " + each.salary);
        }
        double maxSalary = Integer.MIN_VALUE;
        double minSalary = Integer.MAX_VALUE;

        String name1 = "";
        String name2 ="";
        for (Employee each : employeeList) {
            //  each.getEmployeeInfo();

            double eachSalary = each.salary;
            if (eachSalary > maxSalary) {
                maxSalary = eachSalary;
                name1 = each.name;
            }
            if(eachSalary < minSalary){
                minSalary = eachSalary;
                name2 = each.name;
            }
        }
        System.out.println(maxSalary);
        System.out.println(name1);


        System.out.println(minSalary);
        System.out.println(name2);




    }
}


