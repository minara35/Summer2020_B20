package day39_CustomsClass;

public class Offer {
    double salary;
    String location;
    boolean hasPTO;
    boolean isFullTime;
    String jobTitle;
    boolean benefits;


    public void setInfo(double salary, String location, boolean hasPTO, boolean isFullTime, String jobTitle, boolean benefits) {
        this.salary = salary;
        this.location = location;
        this.hasPTO = hasPTO;
        this.isFullTime = isFullTime;
        this.jobTitle = jobTitle;
        this.benefits = benefits;

    }
    public void getInfo(){
        System.out.println("===========================");
        System.out.println("Salary: " + salary);
        System.out.println("Location: " + location);
        System.out.println("Has PTO: " + hasPTO);
        System.out.println("Full time: " + isFullTime);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Benefits: " + benefits);
        System.out.println("===========================");

    }

}