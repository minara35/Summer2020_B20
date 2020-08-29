package day47_Encapsulations;

public class AccessModifiers {

    // public:
   public static int publicVariable= 100;  // static variable
    public static void publicMethod() { // available everywhere

        System.out.println("public methods");

    }

    //default:

    static int defaultVariable =200; // means that this is default access modifier

    static void defaultMethod(){
        System.out.println("default method");
    }

    // private:

    private static int privateVariable = 300;

    private static void privateMethod(){
        System.out.println("private method");
    }


    public static void main(String[] args) {
        System.out.println(publicVariable); // if we do not have any where STATIC specifier it means it will gives us comp error
        System.out.println(defaultVariable);// if we do not have any where STATIC specifier it means it will gives us comp error
        System.out.println(privateVariable); //if we do not have any where STATIC specifier it means it will gives us  comp error



        publicMethod();
        defaultMethod();
        privateMethod();
    }








}
