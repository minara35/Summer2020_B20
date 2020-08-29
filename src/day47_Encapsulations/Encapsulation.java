package day47_Encapsulations;

public class Encapsulation {
    private long ssn = 7598757;
    private String userName;


    public long getSsn(){ //  to read only
        return ssn;
    }
public void setSsn(long ssn){

        this.ssn = ssn;
}

}
