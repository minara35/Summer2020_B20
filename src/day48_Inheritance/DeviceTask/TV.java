package day48_Inheritance.DeviceTask;
/*
2. create a sub class of Device called TV:
                    attributes: brand, model, price, MadeIn, hasBattery, hasMemory, screenSize, RemoteControl
                    methods: watch, setInfo, toString
                    add a constructor that can set the fileds
 */
public class TV extends Device {
    public boolean hasRemoteControl;

    public TV(String brand, String model, double price, boolean hasBattery, boolean hasMemory, String screenSize,boolean hasRemoteControl){
        setInfo(brand, model, price, hasBattery, hasMemory, screenSize);
        this.hasRemoteControl = hasRemoteControl;
    }


    public void watch(){
        System.out.println("Watching " + brand +" " + model);
    }


}
