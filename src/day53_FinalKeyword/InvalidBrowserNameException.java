package day53_FinalKeyword;

public class InvalidBrowserNameException extends RuntimeException{
    public InvalidBrowserNameException(){
        super("Invalid Browser name");
    }
    public InvalidBrowserNameException(String str){
        super(str);
        System.err.println("are you kidding");
    }
}

class Test2{
    public static void main(String[] args) {
        String name = "cybertek";
        switch (name.toLowerCase()){
            case "chrome":
                System.out.println("Chrome browser is selected");
                break;
            case "firefox":
                System.out.println("Firefox browser is selected");
                break;
            case "opera":
                System.out.println("Opera browser is selected");
                break;
            default:
                throw new InvalidBrowserNameException("please enter a valid browser name");

        }


    }
}