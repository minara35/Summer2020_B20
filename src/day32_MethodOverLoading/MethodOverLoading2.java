package day32_MethodOverLoading;



/*
 1. create a method that can find the addition of two numbers
                        addition2Numbers
    2. create a method that can find the addition of three numbers
                        addition3Numbers
    3. create a method that can find the addition of four numbers
                        addition4Numbers
                        addition

 */
public class MethodOverLoading2 {
    public static void main(String[] args) {
     addition2Numbers(2,3 );
     addition3Numbers(3,5,6);
     addition4Numbers(4,5,6,7);
        System.out.println("===============");

        additionNum(2,45);
        additionNum(34,56,90);
        additionNum(2,5,6,8);



    }
    public static void addition2Numbers(double a, double b){ // name MUST to be different if parameters is SAME
        System.out.println(a+b);
    }

    public static void addition3Numbers(double a, double b, double c){
        System.out.println(a+b+c);
    }
    public static void addition4Numbers(double a, double b, double c, double e) {
        System.out.println(a + b + c + e);
    }
    //===============================

    public static void additionNum(double a, double b){ // parameters MUST to be different if name is SAME
        System.out.println(a+b);
    }
    public static void additionNum(double c, double d, double e){
        System.out.println(c+d+e);
    }
    public static void additionNum(double r, double v, double n, double z){
        System.out.println(r+v+n+z);
    }
}
