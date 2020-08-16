package day42_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

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
