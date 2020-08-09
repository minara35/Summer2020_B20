package day27_recap;

import java.util.Arrays;

public class ArraysUtility {
    /*
    sort()
    toString()
    equals()
     */
    public static void main(String[] args) {
      String[] names = {"Minara", "Lola","Berik", "Ulan", "Alan"};
      Arrays.sort(names);
        System.out.println(Arrays.toString(names)); // [Alan, Berik, Lola, Minara, Ulan

        int [] nums = {80, 75, 45, 68,98, 110, 43};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("max num: " + nums[nums.length-1]); // 110
        System.out.println("min num: " + nums[0]); // 43
        System.out.println("============================");

        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"a", "b", "c"};
        System.out.println(Arrays.equals(s1, s2)); // true
        String [] s3 = {"c", "a", "b"};
        System.out.println(Arrays.equals(s1, s3));//false

        String[] a1 = {"a", "c", "b"};
        String[] a2 = {"b", "a", "c"};
        Arrays.sort(a1);
        Arrays.sort(a2);

        System.out.println(Arrays.equals(a1, a2)); // true


    }
}
