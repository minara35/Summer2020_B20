package day53_FinalKeyword;

public class BreakTimeException extends RuntimeException {// custom unchecked exception

    public BreakTimeException(){
        super("It's time for a break");
        System.err.println("Time to take 15 minutes break");
    }

    public BreakTimeException(String str){
        super(str);
        System.err.println("Time to take 15 minutes break");
    }


}

class Test{

    public static void main(String[] args) {

        //throw new RuntimeException("This is Runtime exception");
        //   throw new BreaktimeException("You need to give us a break");

        //   System.out.println("Test Completed");

        //   throw new Test();

        throw new BreakTimeException("It's been 45 minutes");



    }
}