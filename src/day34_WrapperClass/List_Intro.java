package day34_WrapperClass;
import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {
        ArrayList<Integer> scores =new ArrayList<>(); // same dataType
        scores.add(95); // compalier takes by int autoboxing index 0

        scores.add(100);// autoboxing index 1
        scores.add(85); // index 2
        scores.add(75); // index 3
        scores.add(1, 65); // if we want to assign first index to 65
       // scores.add(7, 35); // we can't add elements if there missing index
        System.out.println(scores); //[95, 65, 100, 85, 75]


        System.out.println(scores.get(2));

        System.out.println(scores.size()); //5












    }

}
