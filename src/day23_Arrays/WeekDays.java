package day23_Arrays;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        String[] days = new String[7];
        days[0]= "Monday";
        days[6] = "Sunday";
        days[1] ="Tuesday";
        days[3] = "Thursday";
        days[4]= "Friday";
        days[2] ="Wednesday";
        days[5] ="Saturday";
        for(int i=0; i <=days.length-1; i++){
            System.out.println(days[i]);
        }
        System.out.println("==============");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1~7");
        int n = scan.nextInt();

        System.out.println(days[n-1]);
    }
}
