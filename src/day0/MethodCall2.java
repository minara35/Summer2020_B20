package day0;
import Library.CustomMethodMaxMin;

public class MethodCall2 {
    public static void main(String[] args) {
        int[] num = {300, 200, 400, 60, 700, 1000};
        CustomMethodMaxMin.maxNum(num); //1000
        CustomMethodMaxMin.minNum(num); //60
    }

}
