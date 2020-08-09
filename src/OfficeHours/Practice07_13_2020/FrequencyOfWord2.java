package OfficeHours.Practice07_13_2020;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String str = "JavaJavajavaJAVA".toLowerCase();
        //str = str.toLowerCase();//"JavaJavajavaJAVA"
       int count = 0;//str // JavajavaJAVA"
        while(str.contains("java")){ // true true true false
            count++; // increases the count by 1
           str = str.replaceFirst("java", "");

        }
        System.out.println(count); // 4



    }
}
