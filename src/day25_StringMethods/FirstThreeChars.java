package day25_StringMethods;

public class FirstThreeChars {
    public static void main(String[] args) {
        String[] words = {"Apple", "Banana", "Strawberry", "Java", "Python"};
       for(int i =0; i<= words.length-1; i++){
           System.out.println(words[i].substring(0, 2 + 1));
       }

        System.out.println("============");
        for(String each: words) {
            System.out.println(each.substring(0, 2 + 1));

        }



    }
}
