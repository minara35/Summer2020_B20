package day24_Arrays;

public class UniqueWord {
    public static void main(String[] args) {
        String[] word = {"C#", "C#", "Java", "Python", "Python", "C++"};

        for (int j = 0; j <= word.length - 1; j++){
            String s = word[j];
        int count = 0; // to assign frequency of s
        // 1+1
        for (int i = 0; i <= word.length - 1; i++) {
            String each = word[i]; // "C#", "C#", "Java", "Python", "Python", "C++"
            if (s.equals(each)) {
                count++;
            }


        }

        if (count == 1) {
            System.out.println(s);
        }
    }

    }
}
