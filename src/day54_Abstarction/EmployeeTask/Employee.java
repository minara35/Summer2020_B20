package day54_Abstarction.EmployeeTask;

import java.time.LocalDate;

public class Employee {
    public String name;
    final public char gender; // final means constant
    final public LocalDate DOfB; // final means constant
    public String jobTitle;
    public double salary;

    public Employee(String name, char gender, LocalDate DOfB, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.DOfB = DOfB;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", DOfB=" + DOfB +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
