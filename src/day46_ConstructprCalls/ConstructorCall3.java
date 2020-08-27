package day46_ConstructprCalls;

import day45_Constructor.Constructor;

public class ConstructorCall3 {
    public ConstructorCall3(){
        System.out.println("X");

    }
    public ConstructorCall3(int a){
        this();
        System.out.println("Y");

    }

    public void method1(){
        // ConstructorCall3(); can not be called by name
        //this() can only be used in Constructor
    }
    public ConstructorCall3(double a){
        this();
       // this(10); // you can not to call 2 times this();

        System.out.println("Y");

    }


}
