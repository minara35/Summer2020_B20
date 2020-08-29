package day47_Encapsulations;

public class Test {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicVariable); // public is accessible everywhere
        AccessModifiers.publicMethod();

        System.out.println(AccessModifiers.defaultVariable); // default variable in a same package visible
        AccessModifiers.defaultMethod();


       // System.out.println(AccessModifiers.privateVariable); // private not visible outside of package it vivsble only inside if class
        //AccessModifiers.privateMethod();

       Encapsulation obj1 = new Encapsulation();
        //System.out.println(obj1.ssn); - will not work
        System.out.println(obj1.getSsn());

        //
        obj1.setSsn(4536676);
        System.out.println(obj1.getSsn());
    }

}
