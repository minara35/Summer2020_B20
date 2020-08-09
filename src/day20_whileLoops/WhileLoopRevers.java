package day20_whileLoops;

public class WhileLoopRevers {
    public static void main(String[] args) {
        int num = 10;
        while(num < 15){
            System.out.println("Cybertek"); // 1, 2,3,4,5
            num++;
        }
        System.out.println(num); // 15


        System.out.println("==========");

        String str = "Cybertek School";
        String result = "";
        int index = str.length()-1;


        while(index >=0){
            result += str.charAt(index);

            index--;


        }
        System.out.println(result);

    }
}
