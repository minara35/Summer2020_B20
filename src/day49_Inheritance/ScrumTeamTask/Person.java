package day49_Inheritance.ScrumTeamTask;
/*
 create a class called Person
                attributes:  name, age, gender
                methods: eat, walk, sleep, setPersonInfo
        create a subclass of Person called Employee
                attributes: name, age, gender, Salary, ID, jobTitle
                methods: work, setEmployeeInfo
        create a subclass of Employee called Testers
                    Attributes:
                        ame, age, gender, Salary, ID, jobTitle
                    Actions:
                        setInfo(), smokeTesting(),  creatingTicket(), toString()
        create a subclass of Employee called called Developer
                    Attributes:
                        ame, age, gender, Salary, ID, jobTitle
                    Actions:
                        setInfo(), coding(),  fixBug(), toString()
        create a class called ScrumTeam
                    Attributes:
                            ArrayList<Tester> testers = new ArrayList<>(),
                            ArrayList<Developer> testers = new ArrayList<>(),
                    Actions:
                            addTester(Tester tester): adds the given tester to the testers arraylist
                            addTesters(Tester[] testers): adds the given testers to the testers arraylist
                            addDeveloper(Developer developer): adds the given developer to the developers arraylist
                            addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
                            removeTester(long employeeID): removes the given tester from the testers arraylist
                            removeDeveloper(long employeeID): removes the developer from the developers arraylist

        create a class called AppleInc:
                    1. create an array of Testers and store the testers info in your group
                    2. create an array of developers store the developers info in your group
                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */
public class Person {

    public String name;
    public int age;
    public char gender;
    private long ssn; // we don't want this to be inherited to the sub classes

    public long getSsn() { // to read ssn only
        return ssn;
    }

    public void setSsn(long ssn){ // set ssn only
        this.ssn = ssn;
    }



    public void setInfo(String name, int age, char gender) { // ONLY sets name, gender, age
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    private void eat(){ // we don't want this to be inherited to the sub classes
        System.out.println(name + " is eating");
    }
    private void walk(){// we don't want this to be inherited to the sub classes
        System.out.println(name + " is walking");
    }
    public void sleep(){ //we don't want this to be inherited to the sub classes
        System.out.println(name + " is sleeping");
    }
}
