package day19_ForLoop;

/*
1. write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
    2. write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5

 */

public class Odd_Even {
    public static void main(String[] args) {
        //

        for(int i = 1; i <= 99; i += 2) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print(i + " ");

            }
        }
            System.out.println();

            for(int i = 0; i <= 100; i++) {
                if (i % 2 != 0) { // precondition MUST be Odd number
                    if (i % 5 == 0 && i % 3 == 0) {
                        System.out.print(i + " ");
                    }
                }
            }


            for(int i = 0 ; i <= 100; i++){
                if(i % 5 == 0 && i % 3 == 0){

                    System.out.print(i + " ");

                }

            }
             System.out.println();


           /* for(int i = 0; i <= 100; i++) {
                if (i % 2 == 0) {// precondition Must be even number
                    if (i % 5 == 0 && i % 3 == 0) { // Must be divisible 3&5

                        System.out.print(i + " ");
                    }
                }
            }

        System.out.println();

            */
        }
    }

