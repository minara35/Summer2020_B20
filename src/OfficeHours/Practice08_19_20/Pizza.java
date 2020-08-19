package OfficeHours.Practice08_19_20;
/*
Attributes:
            size, NumOfCheeseTopping, NumOfPepperoniTopping
        Actions:
            set(): sets all info of the pizza
            calcCost(): calculates the price and returns it as double
            toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
            Pizza cost is determined by:
                    Small: $10 + $2 per topping
                    Medium: $12 + $2 per topping
                    Large: $14 + $2 per topping
 */

public class Pizza {
    String size;  // instance variable
    int NumOfCheeseTopping; // instance variable
    int NumOfPepperoniTopping; // instance variable


    public void setPizzaInfo(String size,int NumOfCheeseTopping,int NumOfPepperoniTopping){ // local variable
        this.size = size;
        this.NumOfCheeseTopping = NumOfCheeseTopping;
        this.NumOfPepperoniTopping = NumOfPepperoniTopping;


    }

    public double  calcPrice(){
        int totalNumberOfTopping = NumOfCheeseTopping +NumOfPepperoniTopping;
        double totalPriceOfTopping = totalNumberOfTopping *2;
        double totalPrice = totalPriceOfTopping;


        if(size.equalsIgnoreCase("small")){
            totalPrice +=10;

        }else if(size.equalsIgnoreCase("medium")){
            totalPrice +=12;
        }else{
            totalPrice +=14;
        }
       return totalPrice; // returns to double

    }


    public String toString(){
        return "Pizza size: " + size + "\n Topping cheese: " + NumOfCheeseTopping +  "\n Topping peperoni: " +NumOfPepperoniTopping + "\n Pizza cost: " + calcPrice();
    }

}
