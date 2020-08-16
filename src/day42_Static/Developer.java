package day42_Static;


public class Developer {
    String name;
    long employeeID;
    String jobTitle;
    double salary;
    char gender;

    public void setInfo(String name, char gender, long employeeID, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.employeeID= employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;


    }
    public void fixBug(){
        System.out.println(name + " is fixing bug");

    }
    public void coding(){
        System.out.println(name + "  is coding");
    }
    public String toString(){
        return "Name: " + name + ", Gender: " + gender + ", Job title: " + jobTitle + ", Salary: $" + salary + ", Employee ID: "+ employeeID;
    }
}
