package day42_Static;

public class Student {
    String name;
    int age;
    int groupNumber;
    char gender;
    static String schoolName = "CYbertek School";
    static String favoriteTeacher= "Nadir";
    static String batch = "Batch20";
    public void setInfo(String name, int age, int groupNumber, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.groupNumber = groupNumber;
    }


}
