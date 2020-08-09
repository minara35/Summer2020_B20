package day29_CustomMethods;

import java.util.function.DoubleToIntFunction;

public class Eligibility {
    /*
    age, citizen, name
     */

    public static void buyAlcohol(boolean id, int age){
        if(id &&  age >=21){
            System.out.println("You are eligible to buy alcohol ");
        }else {
            System.out.println("You are eligible to buy milk");
        }

    }



    public static void main(String[] args) {
        vote("Mika", 22, true, "Biden");
        vote("Daniel", 17, true, "Alan");
        buyAlcohol(true, 17);
    }
    public static void vote(String name, int age, boolean citizen, String presidentName){
    boolean eligibleTovote =    age >=18 && citizen == true;
    if(eligibleTovote){
        System.out.println(name + " is eligible to vote for " + presidentName);
    }else {
        System.out.println(name + " not eligible to vote");
    }




    }
}
