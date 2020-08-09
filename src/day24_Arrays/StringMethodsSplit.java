package day24_Arrays;

import java.util.Arrays;

public class StringMethodsSplit {
    public static void main(String[] args) {
        String str = "ABCD";
        char[] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));

        System.out.println("=====================");
        String str1 ="DCBAE";
        String str2 ="ADECB";
       char[] ch1 = str1.toCharArray();// D C E B A
       char [] ch2 = str2.toCharArray(); // A D C B E

        Arrays.sort(ch1);// A B C D E
        Arrays.sort(ch2);// A B C D E
        boolean r1 = Arrays.equals(ch1, ch2);
        System.out.println(r1);

        System.out.println("======================");

        String sentence = "I love Programming Language";
        //language Programming  love I

       String[] words = sentence.split(" ");// {I Love , Programming, Language}
        System.out.println(Arrays.toString(words));
        for(int i = words.length-1; i >=0;i--){
            System.out.print(words[i] + " "); // Language Programming love I
        }


        System.out.println("==================");

        String s = "Java";
        String[] arr =s.split("");
        System.out.println(Arrays.toString(arr));

        char [] c= s.toCharArray(); // every single elements are char
        System.out.println(Arrays.toString(c)); // [J, A, V, A]
    }
}
