package Library;

public class CustomMethods {
    public static void removeDup(String word) {
        String nonDup = ""; // abdrs
        //  array             // [a,b,d,d,d,r,r,r,s]

        for (String each : word.split("")) {
            if (!nonDup.contains(each)) {
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


    public static void revers(String word){
        String result = "";
        for(int i =word.length()-1; i>=0; i--){
            result += word.charAt(i);
        }
        System.out.println(result);

    }
}