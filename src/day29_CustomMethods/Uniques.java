package day29_CustomMethods;

public class Uniques {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "B", "C"};

       // String a = "A";
        for(String a : arr){ // // gets each of the element
            int count = 0;

            for(String each : arr){ // // gets the frequency of the element
                if(a.equals(each)){ //
                    count++;
                }
            }
            if(count == 1){
                System.out.println(a);
            }
        }

    }
}
