package day24_Arrays;

public class UniqueWords2 {
    public static void main(String[] args) {
        String[] word = {"C#", "C#", "Java", "Python", "Python", "C++"};
        for (String each : word){ // "each" is element
            String s = each;
        int count = 0;
        for (String b : word) {// b represents each elements in the array
            if (s.equals(b)) {
                count++;
            }

        }
        if (count == 1) {
            System.out.println(s); // Java , C++ uniques
        }
    }

    }
}
