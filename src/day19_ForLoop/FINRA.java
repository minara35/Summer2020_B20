package day19_ForLoop;

public class FINRA {

    public static void main(String[] args) {
        for( int i =1; i <=50; i++ ){

            if(i % 3 ==0 && i % 5 ==0){ // if num divisible by 3 & 5both
                System.out.println("FINRA");
            }else if(i % 3 == 0) { // if num is ONLY divisible by 3
                System.out.println("FIN");
            }else if(i % 5 == 0) { // if num is ONLY divisible by 5
                System.out.println("RA");
            }else {
                System.out.print(i + " ");

            }
        }

    }
}
