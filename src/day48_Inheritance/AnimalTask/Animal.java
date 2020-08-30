package day48_Inheritance.AnimalTask;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Animal {
    public int age;
    public char gender;
    public String name;
    public String size;
    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void eat(){
        System.out.println(name + " is eating");
    }


}
