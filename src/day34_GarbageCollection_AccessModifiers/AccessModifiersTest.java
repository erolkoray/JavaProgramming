package day34_GarbageCollection_AccessModifiers;

public class AccessModifiersTest {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
       // System.out.println(AccessModifiers.privateData); - private access modifier cannot be used outside of the class it was originally created

        AccessModifiers.method1();
        AccessModifiers.method2();
     //    AccessModifiers.method3(); - private access modifier means it cannot be used anywhere else outside of the class.

    }





}
