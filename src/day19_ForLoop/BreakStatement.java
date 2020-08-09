package day19_ForLoop;

public class BreakStatement {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            System.out.println("hello");
            break;


        }

        for(char ch = 'A'; ch <= 'H'; ch++) {
            if (ch == 'C') {
                break;
            }

            System.out.print(ch + " "); //  A B

        }
            System.out.println();


            for (int i = 10; i <= 50; i +=10) { // i: 10, 20, 30, 40, 50
                if (i == 30) {
                    break; // 30
                }
                System.out.print(i + " "); // 10, 20

            }

                System.out.println();

            for(int x = 1000; x >= 100; x -=100) { // 1000, 900. 800, 700, 600 .... 100.
                if (x == 500) {
                    break;  // exits the loop
                }

                System.out.println(x + " "); // 1000, 900, 800, 700, 600.
            }










    }
}
