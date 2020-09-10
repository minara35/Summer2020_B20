package day49_Inheritance.ScrumTeamTask;
/*
create a subclass of Person called Employee
                attributes: name, age, gender, Salary, ID, jobTitle
                methods: work, setEmployeeInf0()
 */

public class Employee extends Person {
    /*
    name, age, gender
    get(), setSSN()
         */

    public int ID;
    public double salary;
    public String jobTitle;

    public void setInfo(String name, int age, char gender, int ID, double salary, String jobTitle){
        setInfo(name, age, gender);
        this.ID = ID;
        this.salary =salary;
        this.jobTitle = jobTitle;

    }




    public void work(){
        System.out.println(name + " is working");
}

    public String toString(){
        return "Name is "+name+ ", age is "+age+", gender type: "+gender+", Salary= $"+salary+", Employee ID: "+ID
                +", Job title is: "+jobTitle;
    }

//jkflj

}
