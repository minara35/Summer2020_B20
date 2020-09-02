package day49_Inheritance.ScrumTeamTask;

import java.util.Arrays;

/*
 create a class called AppleInc:
                    1. create an array of Testers and store the testers info in your group
                    2. create an array of developers store the developers info in your group
                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */
public class AppleInc {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Mike", 30,'M',182749,124000,"SDET");
        Tester tester2= new Tester("Luisa",25,'F', 123456,135000,"iQA");
        Tester tester3 = new Tester("Milovan",33,'M',87481,123000,"SDET");
        Tester[] testers = {tester1,tester2, tester3};

        Developer developer1 = new Developer("Alan", 35, 'M', 74890, 140000,"Dev");
        Developer developer2 = new Developer("Yadigarjan", 40,'M', 497091, 120000,"SDET");
        Developer developer3= new Developer("Fatime",30,'F', 345234,130000,"softwareEngineer");
        Developer[] developers ={developer1,developer2,developer3};


        ScrumTeam scrum1 = new ScrumTeam(testers, developers);


        System.out.println(scrum1);

        scrum1.removeTester(497091);

       
        Tester[] testers2 = {
                new Tester("Milos",32,'M',150000, 77769,"SDET"),
                new Tester("Mehary", 35, 'M', 1300000, 123456, "SDET")
        };

        Developer[] developers2 = {
                new Developer("Uncle Ban",99,'M', 456876,135000,"softwareEngineer"),
                new Developer("Ramazan Sevindik", 30, 'M', 150000, 123456, "DEV LEAD")
        };


        ScrumTeam scrum2 = new ScrumTeam(testers2, developers2);

        System.out.println(scrum2);

        scrum2.removeDeveloper(456876);


        ScrumTeam[] allScrumTeam = {scrum1, scrum2};

        System.out.println("Testers:");
        for(ScrumTeam eachScrum : allScrumTeam){
            for(Tester eachTester : eachScrum.testers ){
                System.out.println(eachTester.name+ " " + eachTester.salary);
            }
        }

        System.out.println("=================================================");

        System.out.println("Developers: ");
        for(ScrumTeam eachScrum : allScrumTeam){
            for(Developer eachDeveloper : eachScrum.developers ){
                System.out.println(eachDeveloper.name+ " " + eachDeveloper.salary);
            }
        }




    }
}
