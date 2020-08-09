package day26_MultiDimendionalArray;

import java.util.Arrays;

public class Java_phython {
    /*
    write a program that can return the number of appearances of “java” and “python” anywhere in the sentence
            ex:
                input: I love Java, Python is cool
                output: 1 Java 1 Python
                input: Java Java Python Python Python
                output: 2 Java 3 Python

     */
    public static void main(String[] args) {
        String sentence = "I love Java, Python is cool Javascript";
       String[] word =sentence.split(" ");
        System.out.println(Arrays.toString(word));
        int countJava =0;
        int countPython = 0;
        for(String each : word){
            if(each.toLowerCase().contains("java")){
                countJava++;
            }else if(each.toLowerCase().contains("ython")){
                countPython++;
            }
        }
        System.out.println("Java " + countJava);
        System.out.println("Python "+ countPython);

        /*
        str =  Javascript
        each.equals("java") // false
        each.contains("java") // true

         */


    }
}
