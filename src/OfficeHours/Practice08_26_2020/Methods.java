package OfficeHours.Practice08_26_2020;

public class Methods {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i <= arr1.length - 1; i++) {
            System.out.print(arr1[i] + " "); //1 2 3 4 5 6
        }
        System.out.println();


        int[] arr2 = {9, 8, 7, 6, 5, 4};
        for (int each : arr2){
            System.out.print(each + " ");
        }
        System.out.println();
    }
}