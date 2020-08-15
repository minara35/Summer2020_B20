package day41_Static;
class TesterObject{
    public static void main(String[] args) {
        Tester [] testers = {new Tester(),new Tester(),new Tester(),new Tester(),new Tester() };
        testers[0].setInfo("Aliya", 150000, "Female", 20);
        testers[1].setInfo("Den", 130000, "male", 30);
        testers[2].setInfo("Alan", 120000, "male", 23);
        testers[3].setInfo("Zack", 135000, "male", 28);
        testers[4].setInfo("Emily", 142000, "Female", 34);
        for(Tester each : testers){
            System.out.println(each);
        }

    }

}
public class Tester {
    String name;
    double salary;
    String gender;
    int age;

    public void setInfo(String name, double salary, String gender, int age){
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }

    public String toString(){
        return "Name: "+name+", Gender: "+gender+", Age: "+age+", Salary: "+salary;
    }
}
