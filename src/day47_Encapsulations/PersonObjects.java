package day47_Encapsulations;

import java.time.LocalDate;

public class PersonObjects {
    public static void main(String[] args) {
        Person obj = new Person("Alan", 23, 'M', LocalDate.of(1997, 02,17));

        obj.setAddress("NY");
        obj.setID(8750);
        obj.setSsn(8578207);

        System.out.println("Address: "+obj.getAddress());
        System.out.println("ID: "+ obj.getID());
        System.out.println("SSN: "+obj.getSsn());










    }
}
