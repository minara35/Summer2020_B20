package day23_Arrays;

public class Shopping {
    public static void main(String[] args) {
        String[] shoppintList = new String[7];

        shoppintList[0]= "Toilet paper";
        shoppintList[1]= "Sanitizer";
        shoppintList[4] = "eggs";
        shoppintList[6] = "potato";
        shoppintList[2]= "tomato";
        shoppintList[3] = "bread";
        shoppintList[5] = " milk";
        for(int i=0; i<=shoppintList.length-1; i++){
            System.out.println(shoppintList[i]);
        }
    }
}
