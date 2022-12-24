package Utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {
    public static void main(String[] args) {

     //     System.out.println(ProtectedAccessModifier.name1); // default is not visible outside the original package
            System.out.println(ProtectedAccessModifier.name2);// protected isvisible outside the original package if it extends to the original package (visible in subclass only)

        AccessModifiers_Test4.method2(); // in subclasses protected can be called form the parent class
     //   AccessModifiers_Test4.method1(); // in subclasses default cannot be called from parent class

    }
}
