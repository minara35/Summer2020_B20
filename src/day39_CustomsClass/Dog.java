package day39_CustomsClass;
/*
instance variables
name ,breed , size age color
instance methods
setDogINfo , getDogInfo, eat, drink, sleep

 */

public class Dog {
String name;
    String breed;
    String size;
    int age;
    String color;
    public void setDogInfo(String dogName, String dogBreed, String dogSize, int dogAge, String dogColor){

        name = dogName;
     breed = dogBreed;
     size = dogSize;
     age = dogAge;
     color = dogColor;

     // sets the info of the dog


    }
    public void getDogInfo(){
        System.out.println("Name: " + name + ", Breed: " + breed +", Size: " + size + ", Color: " + color + ", Age: " + age + " years old");
    }
    // prints the dog info
    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public void sleep(){
        System.out.println(name + " is sleeping");

    }

}
