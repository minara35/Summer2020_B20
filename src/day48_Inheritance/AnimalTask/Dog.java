package day48_Inheritance.AnimalTask;

public class Dog extends Animal {
    //     sub(child)      super(parent)
    /*
    variables: 4 name age size gender
    methods: 4  including this bark method

     */

    public void bark(){
        System.out.println(name + " is barking");

    }

    public Dog(String name, String size, int age, char gender, double lb){
       setInfo(name, size, age, gender, lb);
    }


}
