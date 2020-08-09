package day17_StringReview;

public class String_Methods {
    public static void main(String[] args) {

        // charAt()
        String str = "Cybertek"; // to get character  index number #
        //            01234567
        char ch =str.charAt(7);
        System.out.println(ch); // it gives us letter from number 7 -> k

        // +:

        String str2 = "Cybertek";
        str2 = str2 + " School";
        System.out.println(str2);

        // length() ==> int
        String str3 = "Cybertek";
        //
        int l = str3.length(); // 15
        System.out.println(l); // lastIndex: length -1

        char ch2 = str3.charAt(l-2); // str3.length()-1 ==> 15-1 =14
        System.out.println(ch2);// k
        System.out.println("last index: " + (l-1));

        // upperCase & lowerCase
        String str4 = "cybertek";
       str4 = str4.toUpperCase();// "CYBERTEK"

        System.out.println(str4);







    }
}
