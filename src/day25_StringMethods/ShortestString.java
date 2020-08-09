package day25_StringMethods;

public class ShortestString {
    public static void main(String[] args) {
        String[] arr = {"Anam", "Nikolas", "Amir", "Nelly" };
        int minLength = arr[0].length(); // 4

        for(int i=0; i<= arr.length-1; i++){ // find out min length of the String  in arr
            int l  = arr[i].length(); // 4 8 4 8
            if(l < minLength){
                minLength =l;// helps us to find min length num
            }
        }


        System.out.println(minLength);
        for (int i = 0; i<= arr.length-1; i++){
            if(arr[i].length() == minLength){
                System.out.println(arr[i]); // how many string length is maching with arr in min length
            }
        }

    }
}
