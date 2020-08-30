package day48_Inheritance.DeviceTask;

public class DeviceObject {
    public static void main(String[] args) {


        Phone phone1 = new Phone("Iphone", "X10", 999, true, true, "10", "Safari");
        System.out.println(phone1.brand);
        System.out.println(phone1.model);
        System.out.println(phone1.price);

       phone1.call(646-506-7890);
       phone1.text(343-797-1313);
        System.out.println(phone1);

    }
}