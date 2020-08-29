package day47_Encapsulations;

public class Test {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicVariable); // public is accessible everywhere
        AccessModifiers.publicMethod();

        System.out.println(AccessModifiers.defaultVariable); // default variable in a same package visible
        AccessModifiers.defaultMethod();


       // System.out.println(AccessModifiers.privateVariable); // private not visible outside of package it vivsble only inside if class
        //AccessModifiers.privateMethod();
    }

}
