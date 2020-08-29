package day47_Encapsulations;

import day22_NestedLoop.Credential;

public class Credentials {
    public String name;

    public int age;
    private String passWord;
    private String userName;
    public static String companyName;
    static {
        companyName = "FaceBook";
    }


    public Credentials(String name, int age){
        this.name = name;
        this.age = age;

    }

    public  void setUserName(String userName){
        this.userName = userName;

    }

    public void setPassWord(String passWord){
        this.passWord = passWord;

    }

    public String getUserName(){
        return userName;
    }

    public String getPassWord(){
        return passWord;
    }

}
