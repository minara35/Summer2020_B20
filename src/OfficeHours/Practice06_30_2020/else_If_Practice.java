package OfficeHours.Practice06_30_2020;

public class else_If_Practice {
    public static void main(String[] args) {
        // A, B, C, D, F

        int score = 65;
       char grade = ' ';


        if(score >= 90 && score < 100 ) {
            grade = 'A';
        }else if(score >= 80){
            grade = 'B';
        }else if(score >=70){
            grade = 'C';
        }else if(score >=60){
            grade = 'D';
        }else{
            grade = 'F';
        }
        System.out.println(grade);
    }
}
