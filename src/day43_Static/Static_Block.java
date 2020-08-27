package day43_Static;

public class Static_Block {


    public static void main(String[] args) {
        System.out.println("Main method");
        name = "jane";
        System.out.println(name);

    }
    static {
        System.out.println("Static block"); // always gets executed first anywhere
    }

    static String name = "Mika";
    static{
        name = "jon";

    }




}
