package day23_Arrays;

public class MaxMinNumber {
    public static void main(String[] args) {
        int[] arr = {5,5,4,6,4,1};
        int max = arr[0];//5
        int min = arr[0]; // 55
        for(int i =1; i<= arr.length-1; i++){
            if(arr[i] > max){ // compares the arrays' elemants and assign the maximum number to variable max
                max= arr[i];
            }
            if(arr[i]< min){
                min = arr[i];
            }
        }
        System.out.println("max number is " + max);
        System.out.println("min number is " + min);
    }
}
