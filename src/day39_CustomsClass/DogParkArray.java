package day39_CustomsClass;

public class DogParkArray {
    public static void main(String[] args) {
        // dogPark

      Dog dog1 = new Dog(); // single array
      Dog[] dogPark = {new Dog(), new Dog(), new Dog(),new Dog(),new Dog()}; // we can store multiple objects
        dogPark[0].setDogInfo("Kukla", "Chihua chihua", "small", 1, "white");
        dogPark[1].setDogInfo("Karaoglan", "German Sheper", "Medium", 3, "Brown");
        dogPark[2].setDogInfo("Champ", "Retriver", "Small",5, "Black");
        dogPark[3].setDogInfo("Akbas", "Anatolian Sheppard", "Large", 2,  "White");
        dogPark[4].setDogInfo("Grizzly", "BoxerPitt", "large", 1, "white");

        for(int i =0; i <= dogPark.length-1; i++){
            dogPark[i].getDogInfo(); // we are calling from each objects
        }


        System.out.println("===========================================================================");
        for(Dog eachDog : dogPark){
            eachDog.getDogInfo();

        }
        System.out.println("=============================================================================");


        String food = "treats";

        for(Dog each : dogPark){
            each.eat(food);

        }


        System.out.println("===============================================================================");
        String drink ="milk";
        for(Dog each : dogPark){
            each.drink(drink);
        }


        System.out.println("================================================================================");

        // sleep

        for(Dog each : dogPark) {
            each.sleep();
        }


    }
}
