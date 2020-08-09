package day19_ForLoop;

public class OddEven2 {
    public static void main(String[] args) {

        // equal num
        for(int i = 0; i <= 50; i++){
            if(i % 2 != 0){ // if the number is odd, then skip
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();


        // odd num
        for(int i = 1; i <= 50; i++){
            if(i % 2 == 0){ // if the number is even, then skip
                continue;
            }
            System.out.print(i + " ");
        }




    }
}
