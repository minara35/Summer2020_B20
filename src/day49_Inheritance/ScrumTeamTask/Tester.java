package day49_Inheritance.ScrumTeamTask;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/*
create a subclass of Employee called Testers
                    Attributes:
                        ame, age, gender, Salary, ID, jobTitle

                        Actions:
                        setInfo(), smokeTesting(),  creatingTicket(), toString()
 */
public class Tester extends Employee {

    public Tester(String name, int age, char gender, int ID, double salary, String jobTitle){
        setInfo(name, age, gender, ID, salary, jobTitle);
    }

    public void smokeTesting(){
        System.out.println(name + " is smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name + "is creating ticket");
    }






}
