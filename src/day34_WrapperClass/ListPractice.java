package day34_WrapperClass;
import java.util.ArrayList;

public class ListPractice {
    public static void main(String[] args) {
ArrayList<Integer> oddList = new ArrayList<>();
ArrayList<Integer> evenList = new ArrayList<>();

for(int i=0; i<=100; i++){
    if(i%2==0){
        evenList.add(i);
    }else{
        oddList.add(i);
    }

}
        System.out.println(oddList);//[1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37
        System.out.println();
        System.out.println(evenList);//[0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40,

        System.out.println("======================");

        ArrayList<String> groceryList =new ArrayList<>();
        groceryList.add("Milk");
        groceryList.add("Eggs");
        groceryList.add("Potato");
        groceryList.add("Apple");
        groceryList.add("Ice Cream");

        for(int i = groceryList.size()-1; i>=0; i--){
            System.out.print(groceryList.get(i) + " ");
        }
        System.out.println();

for(String each:groceryList){
    System.out.print(each + " ");
}


    }
}
