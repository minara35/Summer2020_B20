package day39_CustomsClass;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
      /*  car1.brand = "toyota";
        car1.model ="Camry";
        car1.color = "Black";
        car1.year = 2020;

       */


car1.setInfo("Toyota", "Camry", 2020, "Black",2000, 25000);

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.color);
        System.out.println(car1.year);
        System.out.println(car1.price);
        System.out.println(car1.mileage);


        System.out.println("=============");

        Car car2 = new Car();
        /* car2.brand = "Mercedes";
        car2.model = "G 550";
        car2.color = "Grey";
        car2.year = 2019;

         */
        car2.setInfo("BMW", "X5", 2019, "Green", 3000, 45000);

        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.color);
        System.out.println(car2.year);
        System.out.println(car2.price);
        System.out.println(car2.mileage);

        System.out.println("===================");

        Car car3 = new Car();
        car3.setInfo("Tesla", "Model 3", 2019, "White", 1000, 53000);
        car3.getInfo();

            Car car4 = new Car();
            car4.setInfo("Jeep", "Wramgler", 1990, "Black", 65000, 3000 );

            car4.getInfo();




    }
}
