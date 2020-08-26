package OfficeHours.Practice08_26_2020;


import Library.Util;

public class MethodClass {
    public static void main(String[] args) {
        double[] arr = {23, 5.6, 7, 9.9, 98};
        Practice2.printArray(arr);


        String str = "AABBC";
        String nonDup = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            if(!nonDup.contains("" + str.charAt(i))){
                nonDup += str.charAt(i);
            }

        }
        System.out.println(nonDup);

        String  str2 = "MMJHGGGKHH";

        String nonDup2 = Util.removeDup(str2);
        System.out.println(nonDup2);

    }
}
