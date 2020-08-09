package Library;

import java.util.Arrays;

public class Util {

    public static String removeDup(String word) {
        // what it does
        String nonDup = ""; // abdrs
        //  array             // [a,b,d,d,d,r,r,r,s]

        for (String each : word.split("")) {
            if (!nonDup.contains(each)) {
                nonDup += each;
            }
        }
        return nonDup;
        // removes the duplicates and returns the value string

        /*for (int i = 0; i <= word.length() - 1; i++) {
            String s = "" + word.charAt(i);
            if (!result.contains(s)) {
                result += s;

            }
        }
        System.out.println(result);// abdrs

         */
    }

    public static String frequencyOfChars(String str){
        String expectedResult = "";
        String nonDup = Util.removeDup(str);
        for(char each: nonDup.toCharArray()){

            int count1 = Util.frequency(str, each); // 2
            expectedResult+= "" +each + count1;

        }
        return expectedResult;
//returns the frequency of every single characters from a string
    }


    public static String revers(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);
        }
        return result;
        // reverse the string and return the value
    }

    public static int maxNum(int[] arr) {
        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;

// find and returns the max number from in array
    }

    public static Integer maxNum(Integer[] arr) {
        Integer max = arr[0];
        for (Integer each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;

// find and returns the max number from in array
    }

    public static double maxNum(double[] arr) {
        double max = arr[0];
        for (double each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;

// find and returns the max number from in array
    }

    public static Double maxNum(Double[] arr) {
        Double max = arr[0];
        for (Double each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;

// find and returns the max number from in array
    }


    public static int minNum(int[] arr) {
        int min = arr[0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
        // find and returns the min number from in array
    }

    public static Integer minNum(Integer [] arr) {
        Integer min = arr[0];
        for (Integer each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
        // find and returns the min number from in array
    }

    public static double minNum(double[] arr) {
        double min = arr[0];
        for (double each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
        // find and returns the min number from in array
    }

    public static Double minNum( Double[] arr) {
        Double min = arr[0];
        for ( Double each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
        // find and returns the min number from in array
    }




    /*
    1. method that can find the frequency of characters
    2. method that can find unique characters from a string
    3. method that can combine 2 arrays
     */


    public static int frequency(String str, char ch) { //finds the frequency of char from String str
        int count = 0;
        for (char each : str.toCharArray()) {// represents each char
            if (each == ch) {
                count++;

            }
        }
        return count;
        //  finds the frequency of char from string str and returns it as int

    }


    public static String uniques(String str) { // finds  uniques
        String uniques = ""; // bd

        for (char each : str.toCharArray()) {
            int count = frequency(str, each); // frequency of every character
            if (count == 1) {
                uniques += each;
            }
        }
        return uniques;
        // retunrs the uniiques from the string
    }

    public static int[] combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        for(int each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(int each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
        // combines two array and returns it
    }

    public static String[] combine2Arrays(String[] arr1, String[] arr2){
        String[] arr3 = new String [arr1.length + arr2.length];

        int i = 0;
        for(String each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(String each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
        // combines two array and returns it
    }
    // combines two  String array and returns it

    public static double[] combine2Arrays(double[] arr1, double[] arr2){
        double[] arr3 = new  double [arr1.length + arr2.length];

        int i = 0;
        for( double each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for( double each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
        // combines two array and returns it
    }
    // combines two   array and returns it

    public static char [] combine2Arrays(char[] arr1, char[] arr2){
        char[] arr3 = new  char [arr1.length + arr2.length];

        int i = 0;
        for( char each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for( char each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
        // combines two array and returns it
    }
    // combines two   array and returns it

    public static Integer [] combine2Arrays(Integer[] arr1, Integer[] arr2){
        Integer[] arr3 = new  Integer [arr1.length + arr2.length];

        int i = 0;
        for( Integer each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for( Integer each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
        // combines two array and returns it
    }
    // combines two   array and returns it

    public static Double[] combine2Arrays(Double[] arr1, Double[] arr2){
        Double[] arr3 = new  Double [arr1.length + arr2.length];

        int i = 0;
        for( Double each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for( Double each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
        // combines two array and returns it
    }
    // combines two   array and returns it

    public static Character[] combine2Arrays(Character[] arr1, Character[] arr2){
        Character[] arr3 = new  Character[arr1.length + arr2.length];

        int i = 0;
        for( Character each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for( Character each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
        // combines two array and returns it
    }


    public static String formatFullName(String first, String last){
        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        //       Convert first char to upper Case     // convert rest of characters to lower case
        last= last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();
        String fullname = first + " " + last;
        return fullname;
        // formats the full name
    }

    public static double calculator(double n1, char operator, double n2){

        double result  =(operator =='*')? n1*n2 : (operator =='/')? n1/n2 :(operator=='+')? n1+n2
                :(operator =='-')? n1-n2 : (operator =='%')? n1%n2 : 0;
        return result;
    }

    public static int[] addElement(int[] arr, int num){
        int[] arr2 = new int[arr.length+1];
        arr2[arr2.length-1]=num;  // to assign into last index as 4
        // 1,2,3, 0

        // System.out.println(Arrays.toString(arr2)); // 0,0,0,0
        int i =0;
        for(int each : arr){
            arr2[i]= each;
            i++;

        }
        return arr2;

        //inserts the element to the array


    }

    public static double[] addElement(double[] arr, double num){
        double[] arr2 = new double[arr.length+1];
        arr2[arr2.length-1]=num;  // to assign into last index as 4
        // 1,2,3, 0

        // System.out.println(Arrays.toString(arr2)); // 0,0,0,0
        int i =0;
        for(double each : arr){
            arr2[i]= each;
            i++;

        }
        return arr2;

        //inserts the element to the array


    }


    public static int[] sortDesc(int[]arr){
        Arrays.sort(arr); // 1,2,3,4,6

        int[] arr2 = new int[arr.length];
        System.out.println(Arrays.toString(arr2)); //[0, 0, 0, 0, 0]
        int k= arr.length-1;
        for(int i=0; i<=arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;

        }
        return arr2 ;

    }
    // sort  int array in descending order

    public static double[] sortDesc(double[] arr){
        double [] arr2 = new double[arr.length];
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr2)); //[0, 0, 0, 0, 0]
        int k= arr.length-1;
        for(int i=0; i<=arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;

        }
        return arr2 ;

    }
    // sort double array in descending order

    public static char[] sortDesc(char[] arr) {
        char[] arr2 = new char[arr.length];
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr2)); //[0, 0, 0, 0, 0]
        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;

        }
        return arr2;
    }
    // sort char array in descending order

    public static String[] sortDesc(String[] arr) {
        String[] arr2 = new String[arr.length];
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr2)); //[0, 0, 0, 0, 0]
        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;

        }
        return arr2;
    }
    // sort String array in descending order

    public static Integer[] sortDesc(Integer[]arr) {
        Arrays.sort(arr); // 1,2,3,4,6

        Integer[] arr2 = new Integer[arr.length];
        System.out.println(Arrays.toString(arr2)); //[0, 0, 0, 0, 0]
        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;

        }
        return arr2;
    }
    //sorts Integer array in descending order



    public static Double[] sortDesc(Double[]arr) {
        Arrays.sort(arr); // 1,2,3,4,6

        Double[] arr2 = new Double[arr.length];
        System.out.println(Arrays.toString(arr2)); //[0, 0, 0, 0, 0]
        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;

        }
        return arr2;
    }
    //sorts Double array in descending order

    public static Character[] sortDesc(Character[]arr) {
        Arrays.sort(arr); // 1,2,3,4,6

        Character[] arr2 = new Character[arr.length];
        System.out.println(Arrays.toString(arr2)); //[0, 0, 0, 0, 0]
        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;

        }
        return arr2;
    }
    //sorts Character array in descending order















}
