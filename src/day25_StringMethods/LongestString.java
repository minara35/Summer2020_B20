package day25_StringMethods;

public class LongestString {
    public static void main(String[] args) {
        String[] arr = {"Anam", "Nickolas", "Amir", "Nelly" };
        int maxLength = arr[0].length(); //

        for(String each : arr){
            int l  = each.length(); // 4 8 4 8
            if(l > maxLength){
                maxLength = l;// helps us to find max length num
            }

        }
        System.out.println(maxLength); //8
        for (String each: arr){
            if(each.length() == maxLength) {
                System.out.println(each); // how many string length is machin
            }
        }

    }
}
