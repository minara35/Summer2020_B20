package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects {
    public static void main(String[] args) {
        Cat [] cats = {new Cat(), new Cat(),new Cat(),new Cat(),new Cat() };
        cats[0].getCatInfo("Murzik", "British Shorthair", 2, 'M', "black");
        cats[1].getCatInfo("Bella", "Seamis ", 1, 'F', "Brown");
        cats[2].getCatInfo("Luci", "Persian ", 2, 'F', "White");
        cats[3].getCatInfo("Leo", "Scotish Fold", 3, 'M', "Grey");
        cats[4].getCatInfo("Jack", "Siberian", 2, 'M', "Cream");
        ArrayList<Cat>maleCats = new ArrayList<>();
        maleCats.addAll(Arrays.asList(cats)); //
        maleCats.removeIf(p -> p.gender == 'F');


        ArrayList<Cat>femaleCats = new ArrayList<>();
        femaleCats.addAll(Arrays.asList(cats));
        femaleCats.removeAll(maleCats);


/*for(int i = 0; i<=cats.length-1; i++){
    if(cats[i].gender =='M'){
        maleCats.add(cats[i]);

    }else {
        femaleCats.add(cats[i]);
    }
}

 */

        /* for(Cat each : cats){
            if(each.gender =='M'){
                maleCats.add(each);
            }else {
                femaleCats.add(each);
            }
        }

         */

        System.out.println("Male Cats: " + maleCats.size());
        System.out.println("Female Cats: " + femaleCats.size());
        System.out.println(cats[4]);


    }
}
