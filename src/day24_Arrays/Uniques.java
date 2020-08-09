package day24_Arrays;

public class Uniques {
    public static void main(String[] args) {

/*
 write a program that can find the unique characters from a String
        Ex:
            input: aabccd
            output: bd

 */

        String str = "aabcc";
        String uniques = ""; //b
        for(int i = 0 ; i <= str.length() -1 ; i++){
           char ch = str.charAt(i);      // a,    a,     b,   c, c
           int first = str.indexOf(ch);   //a->0, a->0,  b->2 3  3
           int last = str.lastIndexOf(ch);//a->1, a->1,  b->2 4  4
            if(first==last){
                uniques+=ch;
            }

        }
        System.out.println(uniques);// b uniques
    }
}
