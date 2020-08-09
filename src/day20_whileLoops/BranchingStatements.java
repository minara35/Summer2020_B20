package day20_whileLoops;

public class BranchingStatements {
    public static void main(String[] args) {

        char ch ='A';
        while(ch <='E'){
            if(ch =='C'){
                ch++;
                continue; // skips everything even the iterator
            }
            System.out.println(ch);
            ch++;
        }

        boolean a = true;
        while(a){
            System.out.println("Test started");
            // break;
            System.exit(0);
        }
        System.out.println("done");

    }

}
