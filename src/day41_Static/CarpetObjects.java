package day41_Static;
/*
create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        reugularCarpets
            write a program to store all the persian Carpets into the list of persianCarpets, and store all regular carpets into the list of reugularCarpets
                    use for each loop to print out all the persian carpets
 */

import java.util.ArrayList;

public class CarpetObjects {
    public static void main(String[] args) {
        Carpet[] carpets ={new Carpet(), new Carpet(), new Carpet(),new Carpet(),new Carpet()}  ;
        carpets[0].customOrder(4.5,3.5,7.5, false);
        carpets[1].customOrder(6.5,9.5,8.5, false);
        carpets[2].customOrder(7.5,10.5,6.5, false);
        carpets[3].customOrder(4.5,3.5,7.5, true);
        carpets[4].customOrder(3.5,2.5,6.5, true);

    /*    for(Carpet each:carpets){
            each.getCarpetInfo();
        }

     */

        ArrayList<Carpet>persianCarpets = new ArrayList<>();

        ArrayList<Carpet>regularCarpets = new ArrayList<>();

    /*    for(int i= 0; i<=carpets.length-1; i++ ){
            if(carpets[i].isPersian){
                persianCarpets.add(carpets[i]);
            }else {
                regularCarpets.add(carpets[i]);
            }

        }

     */

        for(Carpet each : carpets){
            if(each.isPersian){
                persianCarpets.add(each);
            }else {
                regularCarpets.add(each);
            }
        }
        System.out.println("Number of persian carpet: " + persianCarpets.size());
        System.out.println("Number of regular carpet: " + regularCarpets.size());

    }
}

