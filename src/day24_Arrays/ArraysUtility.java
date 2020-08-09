package day24_Arrays;
import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int [] arr ={1,2,3};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        String s1 = Arrays.toString(arr);
        System.out.println(s1);

        String[] names = {"minara", "mukhtar", "denny"};

        System.out.println(Arrays.toString(names)); // converts arrays value to String

        System.out.println("=======================");

        int[] nums ={5,4,6,5,4,3,10};
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums); //[3,4,4,5,6,10]
        System.out.println(Arrays.toString(nums));

        System.out.println("Max num " +nums[nums.length-1]);
        System.out.println("min num " + nums[0]);


        String students[] ={"Minara", "Ali", "Talant", "Said"};
        Arrays.sort(students); // Ali, Minara, Said, Talant // sort the array in the ascending order  from A~Z
        System.out.println(Arrays.toString(students));
        System.out.println("================================");


        int[] arr1 = {1,2,3};
        int[] arr2 ={1,2,3};
        boolean r1 = Arrays.equals(arr1, arr2);
        System.out.println(r1);

        int[] arr3 = {2,1,3};
        int[] arr4 = {1,2,3};
        Arrays.sort(arr3); // 1,2,3
        Arrays.sort(arr4);//  1,2,3

        boolean r2 = Arrays.equals(arr3, arr4); // returns to boolean
        System.out.println(r2);


        int[] arr5 = {1,1,2,3};
        int[] arr6 = {1,2,3};


        boolean r3 = Arrays.equals(arr5, arr6);
        System.out.println(r3); // false

    }
}
