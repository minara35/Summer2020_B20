package day24_Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9, -1,-2,-3};
        for(int i =0; i<= arr.length-1; i++){ // i is index number
            System.out.print(arr[i]+ " ");

        }
        System.out.println();

        System.out.println("================");

        for(int each : arr){// each represents the elements  in collection
            System.out.print(each +" "); // Data Type MUST match with Array's dataType

        }


        System.out.println("====================");
        String[] name = {"Minara", "Ali", "Bella", "Lana"};
        for(int i=0; i<= name.length-1; i++){
            System.out.print(name[i] + " ");
        }

        System.out.println();
        System.out.println("=============");
        for(String each : name){
            System.out.print(each +" ");

        }
    }
}
