package day51_Exceptions.PetsTask;

public class House {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Wesky", "Haski", 'M', 2, "white", 2000);
        System.out.println(dog1.name);
        System.out.println(dog1);

        Cat cat1 = new Cat("marshmallow","Siberian", 'F',1,"ragdoll");
        System.out.println(cat1);

        Tiger tiger1 = new Tiger("Zara","Caspian",'M',12,"Brown");
        System.out.println(tiger1);
        tiger1.eat();
        tiger1.drink();
    }
}
