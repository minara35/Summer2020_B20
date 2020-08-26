package OfficeHours.Practice08_26_2020;

public class Palindrome1 {
    public static void main(String[] args) {
        String name = "level";
        String reverseName = "";


        for(int i = name.length()-1 ; i>=0; i--){
            reverseName += name.charAt(i);
        }
        System.out.println(reverseName);
        System.out.println(reverseName.equalsIgnoreCase(name));
        System.out.println("==============================");


        String word = "Minara";
        String reverseName1 = "";


        for(int i = word.length()-1 ; i>=0; i--){
            reverseName1 += name.charAt(i);
        }
        System.out.println(reverseName1);
        System.out.println(reverseName1.equalsIgnoreCase(word));
    }
}
