package day48_Inheritance.DeviceTask;
/*
create a sub class of Device called Laptop:
                    attributes: brand, model, price, MadeIn, hasBattery, hasMemory, screenSize, hasCPU, hasMouse, hasKeyBoard, OS
                    methods: coding, watching, setInfo, toString
                    add a constructor that can set the fileds
 */

public class LapTop extends Device {
    public static boolean hasCPU;
    public static boolean hasMouse;
    public static boolean hasKeyBoard;
    public String OS;


    public LapTop(String brand, String model, double price, boolean hasBattery, boolean hasMemory, String screenSize, String OS){
        setInfo(brand, model, price, hasBattery, hasMemory, screenSize);
        this.OS = OS;

    }

    public void coding(String language){
        System.out.println("coding " + language + " in " + brand + " " + model);
    }







}