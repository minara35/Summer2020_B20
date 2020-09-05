package day51_Exceptions.BrowserTask;

public class ChromeBrowser extends WebDriver{
    /*
    get(url), close()
     */

    public void get(String url){
        System.out.println("Opening the " + url + "in the chrome browser");
    }

    public void close(){
        System.out.println("closing the chrome browser");

    }

}
