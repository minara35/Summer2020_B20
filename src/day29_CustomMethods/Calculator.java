package day29_CustomMethods;

public class Calculator {
    public static void main(String[] args) {
        calculator(27,'/', 3);

    }

    public  static void calculator(double n1, char operator, double n2 ){

        // +, -, /, *, %, Invalid

        switch(operator){
            case '+':
                System.out.println("addition " + (n1+n2) );
                break;
            case'-':
                System.out.println("subtraction " + (n1-n2));
                break;
            case'*':
                System.out.println("multiplication " + (n1*n2));
                break;
            case'/':
                System.out.println("division " + (n1/n2));
                break;
            case'%':
                System.out.println("remainder" + (n1%n2));
                break;
            default:
                System.out.println("Invalid enter");

        }

    }
}
