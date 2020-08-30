package day48_Inheritance.AnimalTask;

public class Cat extends Animal {

    /*
    variables: 4
    methods: 5
     */

    public Cat(String name, String size, int age, char gender, double lb){
        setInfo(name, size, age, gender, lb);
    }

    public  void meow(){
        System.out.println(name + " meowing");
    }
}
