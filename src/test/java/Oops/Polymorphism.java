package Oops;

// Java Program to Demonstrate
// Method Overloading and Overriding

// Parent Class

public class Polymorphism {

    /*
    Polymorphism : - Same name + Multiple forms
                       actions + behaviour

    Types of Polymorphism::
    1. Compile time/ early binding/static binding/overloading. :: is the concept of Polymorphism where more than one method share the same name with different
    signature(Parameters) in a class. The return type of these methods can or cannot be same.
    2. Runtime / late binding/dynamic binding/over-riding. ::  is the concept of Polymorphism where method in the child class has the same name, return-type and parameters
    as in parent class. The child class provides the implementation in the method already written. The child class method body is executed.

    In case of overloading all methods should not be in same class.

     */
    // Method Declared
    public void func(){
        System.out.println("Parent Method func");
    }

    // Method Overloading
    public void func(int a){
        System.out.println("Parent Method func " + a);
    }
}
    // Child Class
    class Child extends Polymorphism {

        // Method Overriding
        public void func(int a){
            System.out.println("Child Method " + a);
        }
    }

//     Maein Method
     class Maein {
        public static void main(String args[]){
            Polymorphism obj1 = new Polymorphism();
            obj1.func();
            obj1.func(5);

            // Here child have 2 func methods one of parent and one of child. but it will execute only the child body.
            Child obj2 = new Child();
            obj2.func(4);
        }

}
