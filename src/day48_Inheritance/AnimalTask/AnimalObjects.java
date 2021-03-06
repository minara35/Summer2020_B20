package day48_Inheritance.AnimalTask;

public class AnimalObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Barny", "large", 2, 'M', 14);
        System.out.println(dog1.name);
        System.out.println(dog1.size);

        dog1.bark();
        dog1.sleep();
        dog1.eat();

        System.out.println(dog1.age);
        System.out.println(dog1.gender);
        System.out.println(dog1);


        System.out.println("=============================");

        Cat cat1 = new Cat("Jennifer", "small", 1, 'F', 8);
        System.out.println(cat1.name);
        System.out.println(cat1.size);

        cat1.meow();
        cat1.sleep();
        cat1.eat();

        System.out.println(cat1.age);
        System.out.println(cat1.gender);
        System.out.println(cat1);






    }
}
