package day23_Arrays;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "ABAB";// A2B2
        String nonDup= ""; //A , B
        String result =""; //A2B2
        for(int i = 0; i <= str.length()-1; i++){ // iterates removing duplicates
            String ch = "" + str.charAt(i); // A,B, A, B
           if(!nonDup.contains(ch)){
               nonDup+= ch;

           }

        }
        System.out.println(nonDup);
        // str= "ABAB" nonDup = "AB"

        for(int j =0; j <=nonDup.length()-1; j++) { // returns the frequency of each ch from String str
            char ch = nonDup.charAt(j); // every single characters
            int count = 0; // frequesncy for
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch) {
                    count++;

                }

            }
            result += "" + ch + count;
        }


            System.out.println(result);



    }











}

