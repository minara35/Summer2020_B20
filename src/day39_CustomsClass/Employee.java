package day39_CustomsClass;

public class Employee {
    /*
    Attributes:
		employeeName, gender, SSN, JobTitle, Salary
     */

    String name;
    char gender;
    long SSN;
    String jobTitle;
    double salary;

    public void setEmployeeInfo(String employeeName, char employeeGender, long employeeSSN, String employeeJobTitle, double employeeSalary) {
        name = employeeName;
        gender = employeeGender;
        SSN = employeeSSN;
        jobTitle = employeeJobTitle;
        salary = employeeSalary;
    }
    public void getEmployeeInfo(){
        System.out.println("Name: " + name + ", Gender: " + gender + ", Job Title: " + jobTitle + ", Salary: $" + salary);

        String ssn = "" + SSN;
        System.out.println("Last 4 digits SSN: " + ssn.substring(ssn.length()-4)); //
    }





}
