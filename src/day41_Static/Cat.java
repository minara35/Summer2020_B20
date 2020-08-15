package day41_Static;

public class Cat {
    String name;
    int age;
    String color;
    char gender;
    String breed;
    public void getCatInfo(String name, String breed, int age, char gender, String color){
        this.name = name;
        this.age = age;
        this.color = color;
        this.gender = gender;
        this.breed = breed;

    }
    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public void sleep(){
        System.out.println(name + " is sleeping");

    }
    public  String toString(){
        return "Name: " + name + ", breed: " + breed + ", age: "+ age + ", gender: " + gender + ", color: " + color;
    }




}

