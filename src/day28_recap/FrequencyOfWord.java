package day28_recap;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String str = "javajava";
        //            01234567
        //substring (0, 4) ->java
        // substring (1, 5) ->avaj
        // substring (2, 6) ->vaja
        //substring (3, 7) -> ajav
        //substring (4, 8) ->java

        // substring(i, i+4) - it returns to String

        //java

        int count = 0;

        //for(int i =0; i <=str.length()-1; i++){ // i: 0, 1, 2,3,4,5,6,7
        for(int i =0; i <=str.length()-4; i++){ // i: 0, 1, 2,3,4
        String s = str.substring(i, i+4); //
            if(s.equals("java")){
                count++;
            }

        }
        System.out.println(count); // 2 "java"
    }
}
