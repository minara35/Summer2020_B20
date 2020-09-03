package Library;

import day50_Inheritance_Overriding.AccessModifiers;
import day50_Inheritance_Overriding.Test;

public class InheritanceTest extends AccessModifiers {
    public static void main(String[] args) {
        System.out.println(InheritanceTest.protectedData); // protected always visible to any child class
        System.out.println(InheritanceTest.publicData); // public is visible outside of package
      //System.out.println(InheritableThreadLocal.defaultData);
    }


}
