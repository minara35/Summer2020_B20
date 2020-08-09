package day29_CustomMethods;

public class ReversString {

    public static void main(String[] args) {
        revers("Minara");// araniM

        revers("Cybertek");// ketrebyC
    }

    public static void revers(String word){
        String result = "";
        for(int i =word.length()-1; i>=0; i--){
            result += word.charAt(i);
        }
        System.out.println(result);

    }
}
