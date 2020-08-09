package day39_CustomsClass;

public class Car {

        /*
        Attributes:
        model, brand, year, color mileage, VIN
         */
        String model;
        String brand ;
        int year;
        String color;
        double mileage;
       double price;
       // 6 atributes

        public void setInfo(String carBrand, String carModel, int carYear, String carColor, double carMileage, double carPrice) { // one action
                brand = carBrand;
                model = carModel;
                year= carYear;
                color = carColor;
                mileage = carMileage;
                price = carPrice;


/*
car1: Toyota
car2: BMW
 */

        }
        public void getInfo(){
            System.out.println(year + " " + brand + " " + model + ", " + color+ ", " + mileage+ ", $" + price);

        }



         public void print(){
        System.out.println(brand + " " + model + " is started");
    }

}
