package OfficeHours.Practice08_26_2020;

public class Palindrome2 {


    public static void main(String[] args) {
        String name = "Level";
        System.out.println(name.equalsIgnoreCase(revers(name)));


        System.out.println(isPalindrome("minara"));

        boolean result = isPalindrome("Mukhtar");
        System.out.println(result);
    }


    public static String revers(String name){
        String reverseName1 = "";

        for(int i = name.length()-1; i>=0; i--){
            reverseName1 += name.charAt(i);
        }
        return reverseName1;

    }

    public static boolean isPalindrome(String str ){
        return str.equalsIgnoreCase(revers(str));
    }

}
