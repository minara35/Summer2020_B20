package day31_Recap;

public class Methods_Practice2 {
    /*
    1. create a method that can reverse a string
2. identify if a string is palindrome

     */
    public static void main(String[] args) {
        String name = "madam";
        revers(name); // madam
      //  System.out.println(name.equals(revers(name);));

        String rev = revers2(name);

        System.out.println(revers2(name)); // madam

        System.out.println(name.equalsIgnoreCase(rev)); // true
    }


    public static void revers(String str){
        String expectedResult = "";
        for(int i =str.length()-1; i>= 0; i--){
            expectedResult += str.charAt(i);
        }
        System.out.println(expectedResult); // madam
    }

    public static String revers2(String str) {
        String expectedResult = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            expectedResult += str.charAt(i);
        }
        return expectedResult;
    }

}
