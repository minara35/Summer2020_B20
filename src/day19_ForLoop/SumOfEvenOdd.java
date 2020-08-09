package day19_ForLoop;

/*
3. write a program that can calculate the sum of all the even numbers between 0 ~ 100
4. write a program that can calculate the sum of all the odd numbers between 0 ~ 100

 */
public class SumOfEvenOdd {
    public static void main(String[] args) {

        int sumOfEven = 0;

      /*  sum +=2;
        sum += 4

       */
        for(int i = 0; i <= 10000; i ++) {
            if (i % 2 == 0) {
                sumOfEven += i;
            }
        }

                System.out.print(sumOfEven);
        System.out.println();


        System.out.println("==================");

        /* int sumOfOdd = 0;
        for(int i = 1; i <= 99; i += 2){
            sumOfOdd += i;
        }
        System.out.println(sumOfOdd);

         */

        int sumOfOdd = 0;
        for(int i = 0; i <= 100; i++){
            if(i % 2 != 0){
               // sumOfOdd = sumOfOdd +i;
                sumOfOdd += i;

            }
        }
        System.out.println(sumOfOdd);

    }
}
