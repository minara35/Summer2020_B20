package day14_Recap;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double score = scan.nextDouble();
        // closes the scanner and we will not use afterword
        scan.close();
        String result = "";
        if (score>= 0 && score<=100) {
            if (score >= 90) {
                result = "Excellent";
            } else if (score >= 80) {
                result = "Great";

            } else if (score >= 70) {

                result = "Good";
            } else if (score >= 60) {
                result = "Pass";
            } else {
                result = "Failed";
            }
        }else {
            result = "Invalid entry";
        }
        System.out.println(result);

    }
}
