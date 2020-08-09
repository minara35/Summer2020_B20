package day28_recap;

import java.util.Arrays;

public class QuezArray {
    public static void main(String[] args) {
        char[] arr = {'D', 'C', 'B',  'A'};
        Arrays.sort(arr);

        for(char each : arr){ // ABCD
            /*
            if(each == 'D'){
                continue; // will skip D if we will put befor statement
            }
             */

            System.out.println(each); // ABCD
            if(each == 'D'){
                continue; // will not skip D
            }
        }

        System.out.println("===============");

        int wd =0; // 0-1+1+2+2-1 = 3
        String[] days = {"sun", "mon", "wed", "sat"};
        for(int i=0; i < days.length; i++){
            switch(days[i]){
                case "sat":
                case"sun":
                    wd -=1;
                    break;
                case"mon":
                    wd +=1;

                case"wed":
                    wd+=2;


            }
        }

        System.out.println(wd); // 3


        System.out.println("===========");


        int [] arr1 = {1,2,3,4};
        int y = 0;
        do{
            System.out.println(arr1[y]); // 1 2 3 2
            y++; // y: 1 2 3
        }while(y < arr1.length-1);
        // y < 3
    }
}
