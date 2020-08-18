package day42_Static;

public class BankOfAmerica {
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
