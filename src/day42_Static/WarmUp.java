package day42_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp {
    class tester{
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
        public void smokeTesting(){
            System.out.println(name + " smoke testing");

        }
        public void creatingTicket(){
            System.out.println(name + " is creating ticket");
        }
        public String toString(){
            return "Name: " + name + ", Gender: " + gender + ", Job title: " + jobTitle + ", Salary: $" + salary + ", Employee ID: "+ employeeID;
        }

    }
    class developers{
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
    class scrumteam{
        ArrayList<Tester> testers = new ArrayList<>();


        ArrayList<Developer> developers = new ArrayList<>();
        String PO;
        String BA;
        String SM;

        public void setInfo(String PO, String BA, String SM){
            this.PO = PO;
            this.BA = BA;
            this.SM = SM;

        }
        public void addTester(Tester tester){
            testers.add(tester);

        }
        public void addTester(Tester[] testers){
            if(testers.length ==0){ // with this function we can check if array has tester or not
                return;
            }
            this.testers.addAll(Arrays.asList(testers));
        }

        public void removeTester(long employeeID){
            testers.removeIf(p -> p.employeeID == employeeID);
            //                      each employee id == 007

        }
        public void addDeveloper(Developer developer){
            developers.add(developer);

        }
        public void addDeveloper(Developer[] developers){
            if(developers.length ==0){ // with this function we can check if array has tester or not
                return;
            }
            this.developers.addAll(Arrays.asList(developers));
        }
        public void removeDeveloper(long employeeID){
            developers.removeIf(p -> p.employeeID == employeeID);
        }
        public String toString(){
            return "Number of Testers: "+testers.size()+ ", Number of Developers: "+developers.size()+ ", PO name: "+PO+ ", Scrum Master name: "+SM+ ", BA name: "+BA;
        }


    }

}

class BankofAmerica{
    public static void main(String[] args) {
        Tester[] testers = {new Tester(), new Tester(),new Tester()};
        testers[0].setInfo("Mika", 'F', 100029, "QA", 130000);
        testers[1].setInfo("John", 'M', 100024, "QA", 120000);
        testers[2].setInfo("Emily", 'F', 100017, "SDET", 110000);

        Developer[] developers = {new Developer(),new Developer(),new Developer(),new Developer(),new Developer() };
        developers[0].setInfo("waqar", 'M', 2111L, "Dev Lead" , 4500000);
        developers[1].setInfo("roza", 'F', 3222L, "Dev", 550000);
        developers[2].setInfo("burak", 'M', 43333L, "Dev", 650000);
        developers[3].setInfo("Virginia", 'F', 76543, "Dev", 130000);
        developers[4].setInfo("Akbar", 'M', 0005L, "Dev", 120000);
        ScrumTeam team1 = new ScrumTeam();
        team1.setInfo("Hamit", "Sarim", "Husein");
        team1.addTester(testers);
        team1.addDeveloper(developers);
        System.out.println(team1);
        System.out.println("======================");
        for(Tester each : team1.testers){
            System.out.println(each.name + " : $" + each.salary);
        }
        System.out.println("=======================");

        for(Developer each : team1.developers) {
            System.out.println(each.name + " : $" + each.salary);
        }

        System.out.println("========================");

        team1.removeTester(100024);

        team1.removeDeveloper(3222L);
        team1.removeDeveloper(76543);
        System.out.println(team1);

        System.out.println("========================");

        Developer dev1 = new Developer();
        dev1.setInfo("Hamit", 'M', 22345, "DEv Team", 130000);
        team1.addDeveloper(dev1);
        System.out.println(team1);

        ScrumTeam[]  scrumTeams = {team1, new ScrumTeam(), new ScrumTeam()};

    }


}

