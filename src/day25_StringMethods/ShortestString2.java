package day25_StringMethods;

public class ShortestString2 {
    public static void main(String[] args) {
        String[] arr = {"Aname", "Nikolas", "Amir", "Nelly", "Alanhhuuj9" };
        int minLength = arr[0].length(); // 4

        for(String each: arr){ // find out min length of the String  in arr
            int l  = each.length(); // 4 8 4 8
            if(l < minLength){
                minLength =l;// helps us to find min length num
            }
        }


        System.out.println(minLength);
        for (String each: arr){
            if(each.length() == minLength){
                System.out.println(each); // how many string length is maching with arr in min length
            }
        }

    }
}
