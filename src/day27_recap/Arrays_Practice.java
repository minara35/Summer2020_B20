package day27_recap;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Practice {
    public static void main(String[] args) {

        String[] names = {"Ulan", "Uluk", "Shukhrat", "Elvira", "Mirlan","Bolot", "Adilet"};
        // index           0        1       2           3         4         5
        System.out.println(names[1]);
        System.out.println(names[4]);

        System.out.println("=====================");
        for(int i =0; i<= names.length-1; i++){
           // if(names[i].charAt[0] != 'A'){
            if(!names[i].startsWith("A")){
                continue;

            }
            System.out.println(names[i]);
        }
        System.out.println("========================");
        int[] numbers = new int[5];
       numbers[3] = 25;
       numbers[0]= 100;
       numbers[3]=125;
        System.out.println(Arrays.toString(numbers));

        System.out.println("=============================");;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many names do you want to enter");
        String[] students = new String[scan.nextInt()];
        System.out.println("Enter a name");
        scan.nextLine();// take out the enter in Scanner
        for(int i =0; i <=students.length-1; i++){ // i: 0, 1, 2, 3, 4
            students [i] = scan.nextLine();// Minara
            System.out.println("Enter a name");
        /*students [1] = scan.nextLine();//
        System.out.println("Enter a name");
        students [2] = scan.nextLine();//
        System.out.println("Enter a name");
        students [3] = scan.nextLine();//
        System.out.println("Enter a name");
        students [4] = scan.nextLine();//

         */



        }
        System.out.println(Arrays.toString(students));// [mika, nika, lika, alan, ben]



        }
}
