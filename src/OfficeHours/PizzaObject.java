package OfficeHours;

import OfficeHours.Practice08_19_20.Pizza;

import java.util.ArrayList;

public class PizzaObject {
    public static void main(String[] args) {

        ArrayList<Pizza>pizzaForBatch20 = new ArrayList<>();
        for(int i =0; i<400; i++){

        Pizza myPizza = new Pizza();
        myPizza.setPizzaInfo("Large", 4, 2);
        pizzaForBatch20.add(myPizza);
        }
        System.out.println("Total number of pizza: " + pizzaForBatch20.size());
        double totalPrice =0;
        for(Pizza each : pizzaForBatch20){
          totalPrice +=  each.calcPrice();
        }
        System.out.println("total price " + totalPrice);


        System.out.println("=================================================================");

        Pizza pizza1 = new Pizza();
        pizza1.setPizzaInfo("Large", 3, 4);

        Pizza pizza2 = new Pizza();
        pizza2.setPizzaInfo("Medium", 3, 2);

        System.out.println("Nadir' Pizza: $"+pizza1.calcPrice());

        System.out.println();

        System.out.println("Saim' Pizza: $"+pizza2.calcPrice());









    }
}
