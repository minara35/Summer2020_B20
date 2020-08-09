package OfficeHours.Practice07_13_2020;

public class UniquesNumbers {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,3, 1}; // frequency of element 2

        for(int b : arr1) {
            int num = arr1[b]; // 1
            int count = 0;// find frequency of num in the arr1

            for (int each : arr1) { //  for counting frequency  of arr1 num
                if (each == num) {
                    count += 1;
                }
            }
            if (count == 1) {
                System.out.println(num);
            }
        }
        // System.out.println(count); // 1==>3








    }
}
