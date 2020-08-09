package day25_StringMethods;
import java.util.Arrays;

public class Array_1_100 {
    public static void main(String[] args) {
int[] numbers = new int [1000];
        /*numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

         */
        for(int i= 0; i <= numbers.length-1; i++){
            numbers[i] = i+1;

        }


        System.out.println(Arrays.toString(numbers));

        System.out.println("======================");

        for(int each: numbers){
            if(each % 2 !=0){ // skip odd numbers // if we need to skip even num == 0
                continue;
            }
            System.out.print(each +" ");


        }




    }
}
