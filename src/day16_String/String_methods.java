package day16_String;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class String_methods {
    public static void main(String[] args) {

        // replace method
        String email = "cybertek@gmail.com";
        email = email.replace("gmail", "yahoo");// cybertek@yahoo.com
        System.out.println(email);




        String word = "java";
        word = word.replace("a", "e"); // jeve
        System.out.println(word);



        String sentence = "i like to learn Java, Java is cool, Java is fun";
        sentence= sentence.replace("a, Java", "a, C#");
        sentence = sentence.replace("Java ", "Python ");


        System.out.println(sentence);


        String s1 = "I like to stay in Cybertek is nice place";
        s1 = s1.replace("Cybertek", "MIT"); // returns to new String
        s1 = s1.replace ("MIT", "Cybertek");

        System.out.println(s1);


        String s2= "I like to leaRn Java , we aRe enjoying Java";
        s2 = s2.replace("R", "r"); // s2 reference to new object
        System.out.println(s2);

        // replaceFirst

        String s3 = "I like to drink tea and tea";
        s3 = s3.replaceFirst("tea", "cola");
        System.out.println(s3);

        String s4 = "I like to Watch Game of thrones, and Walking dead";
        s4 = s4.replace(", and Walking dead" , "");
        System.out.println(s4);



        // indexOf

        String s5 = "I like to stay in Cybertek, we are learning Java";
        int r1  =s5.indexOf("r");
        int r2 = s5.indexOf("re"); // "ar" + 1
        int r3 = s5.indexOf("rn");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        // lastIndexOf ()

        String s6 = "Java is a programming language, and Java is fun";
       int I1 = s6.indexOf(" J") + 1;
        int I2= s6.lastIndexOf("J");
        System.out.println(I1);
        System.out.println(I2);





    }
}
