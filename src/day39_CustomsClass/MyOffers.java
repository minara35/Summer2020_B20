package day39_CustomsClass;

import day40_CustomClassRecap.BankAccount;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1= new Offer();
        Offer offer2= new Offer();
        Offer offer3= new Offer();
        Offer offer4= new Offer();
        Offer offer5= new Offer();
        Offer offer6= new Offer();
        Offer offer7= new Offer();


        offer1.setInfo(120000,"LA", true, true,"SDET",true);
       // offer1.getInfo();
        offer2.setInfo(100000,"IL", false, true,"QA",true);
        //offer2.getInfo();
        offer3.setInfo(130_000,"VA", true, true,"SDET",true);
        //offer3.getInfo();
        offer4.setInfo(123000,"CA", true, true,"QA",true);
        //offer4.getInfo();
        offer5.setInfo(100000,"CN", false, true,"SDET",true);
        //offer5.getInfo();
        offer6.setInfo(125_000,"PA", true, true,"SDET",true);
        //offer6.getInfo();
        offer7.setInfo(113000,"NJ", true, true,"SDET",true);
        //offer7.getInfo();
        ArrayList<Offer>jobOffers= new ArrayList<>();
        jobOffers.addAll(Arrays.asList(offer1,offer2,offer3,offer4,offer5,offer6,offer7));
        for(Offer each: jobOffers){
            each.getInfo();
        }
        //jobOffers.removeIf(p -> p.salary<120_000)
        //System.out.println("Number of offers: "+jobOffers.size());

String myLocation = "VA";
        // less than 120k or not from  VA areas
       // jobOffers.removeIf(p-> p.salary <120_000 ||!p.location.equals("VA"));
        //System.out.println("Number of offers: "+jobOffers.size());
//
        jobOffers.removeIf(p-> p.hasPTO == false ||p.benefits ==false || !p.isFullTime);
        System.out.println("Number of offers: "+jobOffers.size());


    }
}
