package OfficeHours.Practice07_13_2020;

public class Unique {
    public static void main(String[] args) {

        String str = "ABABCJKMNBCVH";
        String result = ""; // C


        //str = "ABCABC
      for(int j = 0; j<=str.length()-1; j++) {
          char ch = str.charAt(j);// A
          int count = 0; // 1+1 // frequency of char
          for (int i = 0; i <= str.length() - 1; i++) { // helps to us to calculate
              char each = str.charAt(i);
              //System.out.println(each);// ABABC
              if (each == ch) {
                  count += 1;
              }
          }
          if (count == 1) { //unique
              result += ch;
          }
      }
        System.out.println(result); //JKMNVH




    }
}
