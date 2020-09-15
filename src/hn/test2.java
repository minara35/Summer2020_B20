package hn;

import java.util.ArrayList;

public class test2 {

    String size;
    ArrayList<Pillow> pillows = new ArrayList<>();

    public test2(String size, int num) {
        this.size = size;
        for (int i = 0; i < num; i++) {
            this.pillows.add(new Pillow());
        }
    }
    }
    
    class Pillow{
        String material;

        public static void main(String[] args) {
             test2 bed = new test2("king", 4);
            System.out.println(bed.pillows.size());
        }

    }

