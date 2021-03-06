package day41_Static;

import java.text.DecimalFormat;

/*
create a custom class for the Carpet class that should contain the following:

                instance variables:
                        width, length, unitPrice, isPersian (boolean)
                instance methods:
                        customOrder(): sets the carpet' width, length, unitprice, & isParsian
                        calcCost(): should be able to caculate the total cost of the carpet and return it as double
                        getCarpetInfo(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
            total price of carpet= (width*length)*unitprice
            if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice


 */
public class Carpet {
    double width; // instence
    double length;
    double unitPrice;
    boolean isPersian;


    public void customOrder(double width, double length, double unitPrice, boolean isPersian) { // parameters
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;

    }
    public double calcCost(){
        double totalPrice =(width*length)*unitPrice; //200
        if(isPersian){
            totalPrice+=200;
        }
        // return (isPersian) ? totalPrice + 200: totalPrice
        return totalPrice;
    }
    public void getCarpetInfo(){
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("====================================");
        System.out.println("width: " + width);
        System.out.println("length: " + length);
        System.out.println("unit price: " + unitPrice);
        System.out.println("persian carpet: " + isPersian);
        System.out.println("total price:" + df.format(calcCost()));
        System.out.println("====================================");

    }

    public String toString(){
      return "width: " + width + ", length: " + length + ", Persian: " + isPersian;
    }
}
