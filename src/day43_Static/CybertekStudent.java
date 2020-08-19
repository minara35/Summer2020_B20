package day43_Static;

class A{
    static int a = 200; // if i want to use all objects have  same data
}

public class CybertekStudent {
    // for the adventages of static

    String studentName;
    int age;
    char gender;
    static String schoolName = "Cybertek school";//i want to use all objects have  same data


    public void getInfo(){
        System.out.println("Name " + studentName);
    }

    public static void printSchoolName(){
        System.out.println("School Name: " + schoolName); // instance
    }

}
