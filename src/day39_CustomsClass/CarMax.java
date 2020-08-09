package day39_CustomsClass;

public class CarMax {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.setInfo("Lexus", "RX350", 2019,"White", 14000, 45000);
        car2.setInfo("Lexus", "RX450", 2020,"White", 1000, 50000);
        car3.setInfo("Ford","Escape", 2018, "Black", 25000, 20000 );
        car1.getInfo();
        car2.getInfo();
        car3.getInfo();

        car3.print();
    }





}
