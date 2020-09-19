package day56_Abstraction.AnimalTask;

public class Dog extends Animal implements Playable, Swimmable { // gives error we have to inherated and Override

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");

    }

    @Override
    public void play() {
        System.out.println("Dog is playing ");

    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming");
    }

}
