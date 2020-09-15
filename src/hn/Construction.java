package hn;

import day45_Constructor.Constructor;

public class Construction {

    public Construction() {
        System.out.println("No argument");
    }

    public Construction(int a) {
        System.out.println("int argument");
    }

    public Construction(String a) {
        System.out.println("String argument");
    }

    public Construction(int a, int b) {
        System.out.println("two int arguments");
    }

    public static void main(String[] args) {

        Construction obj1 = new Construction(10, 20);

    }
}