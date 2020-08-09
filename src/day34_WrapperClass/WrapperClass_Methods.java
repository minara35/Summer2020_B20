package day34_WrapperClass;

public class WrapperClass_Methods {
    public static void main(String[] args) {
        String str = "123";
        int a = Integer.parseInt(str); // kicking
        System.out.println(str +1); //1231

        System.out.println(a +1 ); //124
        Double d1 =Double.parseDouble("7.5"); // Autoboxing

        System.out.println(d1-1); // 6.5


String s1 ="TRUE";
boolean b1 = Boolean.parseBoolean(s1);
        System.out.println(!b1); //false no casesencetive in parse method

        System.out.println("=========================");


        String s2 = "10000.5";
        double d3 =Double.valueOf(s2); // unboxing
        System.out.println(d3-1); // 9999.5


String s3 = "FalSe";
boolean r2 = Boolean.valueOf(s3); // unboxing
        System.out.println(r2);// false






    }
}
