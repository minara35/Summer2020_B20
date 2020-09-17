package day55_Abstarctioin.ShapesTask;

import java.io.IOException;

public class Triengle {
    static int a = 40;

    public static void main(String[] args) {
        a = 100;
        try{
            a =200;
        }catch (Exception e){

        }finally {
            a =400;
        }
        System.out.println(a);
    }
    static {
        a = 500;
    }



}
