package day51_Exceptions.BrowserTask;

public class BrowserObjects {
    public static void main(String[] args) {
        ChromeBrowser chrome = new ChromeBrowser();
        chrome.get("https://www.google.com/");

        chrome.close();

        System.out.println("===================================");


        FireFoxBrowser firefox = new FireFoxBrowser();
        firefox.get("https://www.google.com/");
        firefox.close();

        OperaBrowser opera = new OperaBrowser();
        opera.get("https://www.google.com/");
        opera.close();

    }
}
