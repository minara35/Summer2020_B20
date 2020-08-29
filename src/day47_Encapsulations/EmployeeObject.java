package day47_Encapsulations;

import day39_CustomsClass.CapitalOne;

public class EmployeeObject {
    public static void main(String[] args) {
        CapitalOneEmployees  obj = new CapitalOneEmployees("Karim", 34, "SDET");


        obj.setID(1878789);
        obj.setAddress("Brooklyn");
        obj.setSalary(130000);
        System.out.println(obj.employeeName);
        System.out.println(obj.age);
        System.out.println(obj.jobTitle);
        System.out.println(obj.companyName);
        System.out.println(obj.getID());
        System.out.println(obj.getAddress());
        System.out.println(obj.getSalary());
        System.out.println(obj);
    }
}
