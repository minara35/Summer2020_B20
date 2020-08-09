package day26_MultiDimendionalArray;

import java.util.Arrays;

public class MultiD_Practice {
    public static void main(String[] args) {
        /*
        testers{"Lilia", "Odina", "Cristina", "Elkem"}
        Developers{"Ahmet", "Erfan", "Roza", "Sarah"}
        SM{"Nurmamet"}
        PO{"Nadir"}
        BA{"Alex"}
         */
        // ScrumTeam: testers, Developers, SM, PO, BA


        String[]testers = {"Lilia", "Odina", "Cristina", "Elkem"};
       String [] developers = {"Ahmet", "Erfan", "Roza", "Sarah"};
       String[] SM ={"Nurmamet"};
       String[]  PO = {"Nadir"};
       String[] BA ={"Alex"};
       String[] tester2 = {"iren", "aslan", "nazar"};

       String [][] scrumTeam= {testers, developers, SM, PO, BA};

       //                         0         1        2   3  4
// replace Alex -> Adam
        scrumTeam[4][0] = "Adam";
        // replace Roza -> Mika
        scrumTeam[1][2] ="Mika";

// replace  team
        scrumTeam[0]= tester2;
        // replase PO
        scrumTeam [3][0] = "Zeki";
        System.out.println(Arrays.deepToString(scrumTeam));

        /*
        [[iren, aslan, nazar]
        [Ahmet, Erfan, Mika, Sarah]
        [Nurmamet]
        [Zeki]
        [Adam]

         */
        System.out.println("==============================");

        for(String[]each : scrumTeam){

            for(String name :each){// to give single demontional array
                System.out.println(name);
            }

            System.out.println(Arrays.toString(each));
        }
        System.out.println("======================");


        int[][] scores = {{10,20,30}, {60,55,75,105}, {93,48,125,135, 13}};
//                             0         1              2

        // print out the numbers that are divisible by 3 or 5
        for(int[] each1DArray :scores){
            for(int eachElement :each1DArray){
                if(eachElement % 3 ==0 || eachElement % 5 ==0) {
                    System.out.print(eachElement + " "); // 13 will not printed
                }
            }

        }

        System.out.println("============================");

        int [][] a1 = {{1,2}, {3,4,5}};
        int [][] a2 = {{6,7}, {8,9,10}};
        int [][][] arr3D = {{{1,2}, {3,4,5}}, {{6,7}, {8,9,10}}};
        //                    0                      1



    }
}
