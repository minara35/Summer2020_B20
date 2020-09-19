package day56_Abstraction.AnimalTask;

public class Cat  extends Animal implements Playable{

    @Override // implemented
    public void eat() {
        System.out.println("Cat is eating ");

    }

    @Override// implemented
    public void sleep() {
        System.out.println("Cat is sleeping");

    }


    @Override// implemented
    public void play() {
        System.out.println("Cat is playing ");

    }
}
