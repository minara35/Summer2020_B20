package day48_Inheritance.AnimalTask;

public class AnimalObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        System.out.println(dog1.name);
        System.out.println(dog1.size);

        dog1.bark();
        dog1.sleep();
        dog1.eat();

        System.out.println(dog1.age);


    }
}
