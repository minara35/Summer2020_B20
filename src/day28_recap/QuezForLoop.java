package day28_recap;

public class QuezForLoop {
    public static void main(String[] args) {



        int i = 0;
        int j = 7;
        //          6
        for(i = 0; i<j-6; i+=2){ // i: 0, ,2,4,6 if statement false will not executed
            System.out.println(i + " "); // 0, 2, 4

        }

        for(int k = 0; k<=4; ){
            k++; // k: 1, 2 3 4 5
            System.out.println(k+" "); //1 2 3 4 5  it started from 1 because statement executed top to button
            // k++; // 0, 1, 2,3,4
        }

        int z = 5; // 5+5, 5+4, 5+3 5+2 5+1
        for(int r =5; r>0; r--){ // r:5, 4,3,2,1
            z+=r;

        }
        System.out.println( z + " ");

    }
}