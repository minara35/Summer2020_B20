package day46_ConstructprCalls;

import day45_Constructor.Constructor;

public class ConstructorCall {

    public ConstructorCall(){
        method1();
        method2();
        method3();

    }
    public static void method1(){
        method2();
       // ConstructorCall(); error
    }

    public static void method2(){
        method1();
    }
    public static void method3() {
       // ConstructorCall(); error

    }

}
