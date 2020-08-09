package OfficeHours.Practice06_30_2020;

public class If_Practice {
    public static void main(String[] args) {
        int num = 310;
        String result ="";

        if(num % 2 == 0) {
            //System.out.println(num + " is Even number");
            //if (num % 2 != 0) {
            result = num + " is Even number";
        } else {
            //System.out.println(num+ " is Odd number");
            result = num+ " is Odd number";

        }
        System.out.println(result);

        // ternary if statement

        String result2 = (num % 2 == 0)? num + " is Even number" : num+ " is Odd number";
        System.out.println(result2);
    }
}
