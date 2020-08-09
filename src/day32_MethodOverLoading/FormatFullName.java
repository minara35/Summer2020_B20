package day32_MethodOverLoading;

import java.util.Scanner;
// format FullName ("cYberTek School") Cybertek School
public class FormatFullName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        String last = scan.nextLine();
      /* first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
       //       Convert first char to upper Case     // convert rest of characters to lower case
        last= last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();
        String fullname = first + " " + last;
        //System.out.println(first);
        //System.out.println(last);
        System.out.println(fullname);

        System.out.println("=========================");
        formatFullName("MiNara", "AbdraKHmanoVa");

       */
String fullname = formatFullName(first, last);
        System.out.println(fullname);

    }
    public static String formatFullName(String first, String last){
        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        //       Convert first char to upper Case     // convert rest of characters to lower case
        last= last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();
        String fullname = first + " " + last;
        return fullname;
    }

}
