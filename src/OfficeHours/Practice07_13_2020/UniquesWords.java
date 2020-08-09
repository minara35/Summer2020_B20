package OfficeHours.Practice07_13_2020;

public class UniquesWords {
    public static void main(String[] args) {
        String[] words = {"C#", "C#", "Phython","Phython","Java", "C++"};


        for(String b : words) {
           // String s = b; // C# every single elements from words
            int count = 0;

            for (String a : words) {
                if (a.equals(b)) {
                    count++;
                }

            }

            if (count == 1) { // if we need find frequency twice we need to change ==2
                System.out.println(b);
            }
        }
        //System.out.println(count);


    }
}

