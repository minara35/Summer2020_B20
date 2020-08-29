package day47_Encapsulations;

public class Constructor {
    public Constructor(int a){

        System.out.println("int arg");

    }
    public Constructor(double a){
        this(10); // int arg
        System.out.println("double arg"); // double arg


    }
    public  Constructor(String a){
        System.out.println("String arg");
    }
    public static void main(String[] args) {
      //  new Constructor();

        new Constructor(10);
        new Constructor(10.0);

    }






}
