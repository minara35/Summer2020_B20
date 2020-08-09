package day32_MethodOverLoading;
import Library.Util;

import java.util.Arrays;

public class MethidsCalls {
    public static void main(String[] args) {
        String firstName = "eLKem";
        String lastName = "eMet";
        String fullName =Util.formatFullName(firstName,lastName);
        System.out.println(fullName); //  Elkem Emet

        String uniques = Util.uniques(fullName);
        System.out.println(uniques); //lk t

        String revers = Util.revers(fullName);
        System.out.println(revers); //temE meklE

        System.out.println("===============");

        int[] a ={200,400,500,200,1000,30,40,78};
        int n = 2500;
       a =  Util.addElement(a,n);

        System.out.println(Arrays.toString(a)); // [200, 400, 500, 200, 1000, 30, 40, 78, 2500]












    }

}
