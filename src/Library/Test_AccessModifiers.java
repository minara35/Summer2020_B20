package Library;
import day47_Encapsulations.AccessModifiers;

import java.lang.reflect.AccessibleObject;

public class Test_AccessModifiers {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicVariable); // public is visible everywhere
        AccessModifiers.publicMethod();
       // System.out.println(AccessModifiers.defaultVariable);
      //  AccessModifiers.defaultMethod();

    }

}
