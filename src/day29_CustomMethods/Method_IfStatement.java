package day29_CustomMethods;
/*
 check eligibility to vote
    5. check eligibility to buy alcohol
    6. calculate the garde of the student based on the score
    7. create a method that can reverse any String

 */

public class Method_IfStatement {
    public static interface Method_IfStatement_ {
        public static void main(String[] args) {
            eligibleToBuyAlcohol(22, true);

        }

        public static void eligibleToBuyAlcohol(int age, boolean id){
            if(age < 21){ // to fix bug that age can't be negative
                System.out.println("Not eligible To Buy Alcohol");
            }else  if (age >= 21 && id){

                System.out.println("eligible to buy alcohol");
            }

        }






    }
}
