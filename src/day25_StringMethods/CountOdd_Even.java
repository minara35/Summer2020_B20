package day25_StringMethods;

public class CountOdd_Even {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
        int countEven = 0;
        int countOdd = 0;

        String even ="";
        String odd = "";

        for(int each : nums) {
            /*
            if(each %2 ==0){
                countEven++;
            }else{
                countOdd++;
            }

        }
        System.out.println("Even nums: " +countEven); // 5
        System.out.println("Odd nums: " + countOdd); //6

             */
            if(each %2 ==0){
                countEven++;
                even +=each +" ";
                continue;
                }
            countOdd++;
           odd +=each +" ";

            }

        System.out.println("even num: " + even);
        System.out.println(countEven);
        System.out.println("odd num: " + odd);
        System.out.println(countOdd);

    }
}
