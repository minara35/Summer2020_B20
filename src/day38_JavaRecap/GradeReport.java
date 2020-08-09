package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(100, 90, 85, 75, 55, 45, 73, 73, 35, 47, 60, 87, 77, 47, 37, 57,93, 83,43,53 ));
      //  System.out.println(list.toString());//[100, 90, 85, 75, 55, 45, 73, 73, 35, 47, 60, 87, 77, 47, 37, 57, 93, 83, 43, 53]
        System.out.println(list); //[100, 90, 85, 75, 55, 45, 73, 73, 35, 47, 60, 87, 77, 47, 37, 57, 93, 83, 43, 53]

        ArrayList<Integer> gradeA = new ArrayList<>(); //90~100
        gradeA.addAll(list); // first store all the grades
        gradeA.removeIf(each -> each < 90); // second remove the grades that are not A
        System.out.println("Grade A" + gradeA);
        // only retain the grades of A


        ArrayList<Integer> gradeB= new ArrayList<>(); // 80~89
        gradeB.addAll(list); // first store all the grades
        gradeB.removeIf(p -> p < 80 || p > 89); // second remove the grades that are not B (F,D,C,A)
        System.out.println("Grade B" + gradeB);
        // only retain the grades of B

        ArrayList<Integer> gradeC= new ArrayList<>();
        gradeC.addAll(list); // first store all the grades
        gradeC.removeIf(p -> p < 70 || p > 79); // second remove the grades that are not C (F,D,B,A)
        System.out.println("Grade C" + gradeC);
        // only retain the grades of B

        ArrayList<Integer> gradeD= new ArrayList<>();
        gradeD.addAll(list); // first store all the grade
        gradeD.removeIf(p -> p < 60 || p > 69); // second remove the grades that are not D (F,B,C,A)
        System.out.println("Grade D" + gradeD);
        // only retain the grades of D
        ArrayList<Integer> gradeF= new ArrayList<>();
        gradeF.addAll(list); // first store all the grades
        /* gradeF.removeAll(gradeA);
        gradeF.removeAll(gradeB);
        gradeF.removeAll(gradeC);
        gradeF.removeAll(gradeD);

         */

        gradeF.removeIf(p -> p > 59); // second remove the grades that are not F (B,D,C,A)
        System.out.println("Grade F" + gradeF);
        // only retain the grades of F

        System.out.println("=====================");
        System.out.println(gradeA.size() + " sut=dents made A");
        System.out.println(gradeB.size() + " sut=dents made B");
        System.out.println(gradeC.size() + " sut=dents made C");
        System.out.println(gradeD.size() + " sut=dents made D");
        System.out.println(gradeF.size() + " sut=dents made F");




    }

}
