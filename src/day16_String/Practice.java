package day16_String;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        // equalsIgnoreCase()
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you employeed: ");
        String answer = scan.next();
        if (answer.equalsIgnoreCase("yes")){
            System.out.println("Employeesd");
        }else {
            System.out.println("Not employeed");
        }
    }
}
