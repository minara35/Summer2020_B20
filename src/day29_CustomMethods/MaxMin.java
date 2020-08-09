package day29_CustomMethods;

public class MaxMin {
    public static void main(String[] args) {
        int [] numbers= {10,11,12,45};
        maxNum(numbers);
        minNum(numbers);
    }
    public static void maxNum(int[] arr){
        int max = arr[0];
        for(int each : arr){
            if(each > max){
                max =each;
            }
        }
        System.out.println("Max num: " + max);


    }
    public static void minNum(int[] arr) {
        int min = arr[0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        System.out.println("Max num: " + min);
    }
}
