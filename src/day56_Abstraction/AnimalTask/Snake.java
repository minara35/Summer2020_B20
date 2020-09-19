package day56_Abstraction.AnimalTask;

public class Snake extends Animal implements Swimmable, Crawl{
    @Override
    public void eat() {
        System.out.println("Snake is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Snake is sleeping");

    }

    @Override
    public void crawl() {
        System.out.println("Snake is crawling");

    }

    @Override
    public void swim() {
        System.out.println("Snake is swimming");

    }
}
