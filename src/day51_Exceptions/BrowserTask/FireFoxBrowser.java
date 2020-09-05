package day51_Exceptions.BrowserTask;

public class FireFoxBrowser extends WebDriver {

    public void get(String url) {
        System.out.println("Opening the  " + url + " in firefox");
    }

    public void close() {
        System.out.println("closing the firefox browser");
    }
}
