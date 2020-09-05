package day51_Exceptions.BrowserTask;

public class OperaBrowser  extends WebDriver{

    public void get(String url) {
        System.out.println("Opening the  " + url + " in opera");
    }


    public void close() {
        System.out.println("closing the opera browser");

    }
}
