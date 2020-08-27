package hn;



public class Test {
    static int a;
    int b;

    public static void main(String[] args) {
        Test ob1 = new Test();
        ob1.b = 10;
        ob1.a = 20;
        Test ob2 = new Test();
        ob2.b = 30;
        ob2.a = 40;
        System.out.println(ob1.a + ob1.b);
        System.out.println(ob2.a + ob2.b);
    }



}
