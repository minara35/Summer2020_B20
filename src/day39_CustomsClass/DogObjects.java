package day39_CustomsClass;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        dog1.setDogInfo("Kukla", "Beagle", "medium", 2,"Mix");

        Dog dog2 = new Dog();
        dog2.setDogInfo("Roofus", "Argentinian Dogo", "Large", 1,"White");

        Dog dog3 = new Dog();
        dog3.setDogInfo("Winston", "Scotties Terrier", "Small", 1, "Black");
        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();

        dog1.eat("Kelle Paca");

        dog3.eat("Meat");

        dog2.eat("polo");


        dog1.drink("water");
        dog2.drink("cola");
        dog3.drink("milk");


    }

}
