package day29_CustomMethods;

public class RemoveDuplicates {

    public static void main(String[] args) {
        removeDup("abdddrrrs"); // // abdrs
    }

    public static void removeDup(String word){
        String nonDup = ""; // abdrs
        //  array             // [a,b,d,d,d,r,r,r,s]

        for(String each :word.split("")){
            if(!nonDup.contains(each)){
                nonDup += each;
            }
        }
        System.out.println(nonDup);// abdrs

        /*for (int i = 0; i <= word.length() - 1; i++) {
            String s = "" + word.charAt(i);
            if (!result.contains(s)) {
                result += s;

            }
        }
        System.out.println(result);// abdrs

         */
    }
}
