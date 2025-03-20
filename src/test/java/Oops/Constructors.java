package Oops;
// Java Program to demonstrate
// Constructor


// Driver Class
public class Constructors {

    /*

    * Constructors must have the same name as the class within which it is defined it is not necessary for the method in Java.
    * Constructors do not return any type while method(s) have the return type or void if does not return any value.
    * Constructors are called only once at the time of Object creation while method(s) can be called any number of times.
    * Constructor is a block of codes similar to the method.It is called when an instance of the class is created.
    * Every time an object is created using the new() keyword, at least one constructor is called.
    * A constructor in Java can not be abstract, final, static, or Synchronized.
    * Access modifiers can be used in constructor declaration to control its access i.e which other class can call the constructor.
    * Note :: constructor can be declared private. A private constructor is used in restricting object creation.
    * Just like methods, we can overload constructors for creating objects in different ways. The compiler differentiates constructors on the
    basis of the number of parameters, types of parameters, and order of the parameters.

    *There are three types of constructors:
    - Default Constructor : No parameters
    - Parameterized Constructor : It has parameters
    - Copy Constructor : Same constructor passed with another object. like in overloading calling same thing with multiple objects.

    Constructor chaining is the process of calling one constructor from another constructor with respect to current object.

    Constructor chaining can be done in two ways:
    1. Within same class: It can be done using this() keyword for constructors in the same class.
    2. From base class: by using super() keyword to call the constructor from the base class.

    Rules of constructor chaining :
    1. The this() expression should always be the first line of the constructor.
    2. There should be at-least be one constructor without the this() keyword (constructor 3 in above example).
    3. Constructor chaining can be achieved in any order.

    Super() :: Used if one class extends another class then from one class we want to call constructor of another class

     */

    String name;
    int id;

    // Default Constructor
    Constructors()
    {
        super();
        this();
        System.out.println("Constructor Called");
    }

    // Parameterized Constructor
    Constructors(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    // Copy Constructor
    Constructors(Constructors obj2)
    {
        this.name = obj2.name;
        this.id = obj2.id;
    }



    // main function
    public static void main(String[] args)
    {
        Constructors geek = new Constructors();

        // This would invoke the parameterized constructor.
        System.out.println("First Object");
        Constructors geek1 = new Constructors("Avinash", 68);
        System.out.println("GeekName :" + geek1.name
                + " and GeekId :" + geek1.id);

        System.out.println();

        // This would invoke the copy constructor.
        Constructors geek2 = new Constructors(geek1);
        System.out.println(
                "Copy Constructor used Second Object");
        System.out.println("GeekName :" + geek2.name
                + " and GeekId :" + geek2.id);
    }

}
