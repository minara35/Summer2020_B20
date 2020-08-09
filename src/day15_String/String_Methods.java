package day15_String;

public class String_Methods {
    public static void main(String[] args) {
        String name = "Cybertek School is a great place";
       //              01234567
    // charAt(index);
        char c1 = name.charAt(0);//'C'
        char c2 = name.charAt(5); // 't'
        System.out.println(c1);
        System.out.println(c2);

        // length() ==> int
        int l = name.length();// 15 characters
        System.out.println(l);

        //last Index number = length of  String - 1
        int lastIndexNumber = name.length() - 1;
        System.out.println(lastIndexNumber);


        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);

        // concat(Str): concatenation
        String schoolName = "Cybertek";
        schoolName = schoolName.concat("School"); // "Cybertek School"
        System.out.println(schoolName);


        String r1 =  "Cybertek" +123 +'A' +true;
        System.out.println(r1);



        //toLowerCase()
        String name1 = "CYBERTEK SCHOOL";
        name1 = name1.toLowerCase(); //"cybertek school"
        System.out.println(name1);


        // toUpperCase()
        String name2 = "minara";
        name2 = name2.toUpperCase();
        System.out.println(name2);

        // (CAN WE HAVE MORE REPLIT).toLowerCase;


        // trim()
        String p = "      Cybertek      School     ";
        p = p.trim(); // "Cybertek   School"
        System.out.println(p);


        // substring()























    }
}
