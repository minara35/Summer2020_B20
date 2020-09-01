package day49_Inheritance.ScrumTeamTask;
/*
create a subclass of Employee called called Developer
                    Attributes:
                        ame, age, gender, Salary, ID, jobTitle
                    Actions:
                        setInfo(), coding(),  fixBug(), toString()
 */

public class Developer extends Employee {
    public Developer(String name, int age, char gender, int ID, double salary, String jobTitle){
        setInfo(name, age, gender, ID, salary, jobTitle);
    }

    public void coding(){
        System.out.println(name + " is coding");
    }

    public void fixBug(){
        System.out.println(name + "is fixing Bug");
    }


}
