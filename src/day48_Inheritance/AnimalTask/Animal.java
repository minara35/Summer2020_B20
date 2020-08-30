package day48_Inheritance.AnimalTask;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Animal {
    public int age;
    public char gender;
    public String name;
    public String size;
    public double lb;
    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

public void setInfo(String name, String size, int age, char gender, double lb){
        this.name = name;
        this.gender = gender;
        this.size  = size;
        this.age = age;
        this.lb = lb;

}

public String toString(){
    return "Name: " + name + ", Age: " + age + ", Size: " + size + ", Gender: " + gender + ", Weigh: " + lb;
    }
}
