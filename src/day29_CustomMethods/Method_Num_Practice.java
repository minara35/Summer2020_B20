package day29_CustomMethods;

public class Method_Num_Practice {
    /*
    task:
    1. create a method that can print odd numbers between 1~100
    2. create a method that can print even numbers between 1~100

     */
    public static void main(String[] args) {
        oddNumbers();
        System.out.println();
        System.out.println("hello");
        oddNumbers(); // will append second time
        System.out.println();
        System.out.println("hello");
        evenNumbers();
        System.out.println();
        System.out.println("hello");



    }

    public static void oddNumbers(){
        for(int i =1; i <= 100; i+=2){
            System.out.print(i+ " ");
        }


        }
    public static void evenNumbers(){
        for (int i = 0; i <= 100; i+=2) {
            System.out.print(i + " ");
        }


    }
}
