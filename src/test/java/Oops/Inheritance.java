package Oops;

public class Inheritance {

    /*
    It is the mechanism in Java by which one class is allowed to inherit the features(fields and methods) of another class. In Java, Inheritance means creating new
    classes based on existing ones. A class that inherits from another class can reuse the methods and fields of that class.

    Super Class/Parent Class/Base Class: The class whose features are inherited is known as a superclass.
    Sub Class/Child Class: The class that inherits the other class is known as a subclass.

    class SubClass extends SuperClass

    Single Inheritance :: inherits the properties and behavior of a single-parent class.
    - class Two extends One

    Multilevel Inheritance ::
    - class One
    - class Two extends One
    - class Three extends Two

    Hierarchical Inheritance
    - class One
    - class Two extends One
    - class Three extends One

    Multiple Inheritance :In Multiple inheritances, one class can have more than one superclass and inherit features from all parent classes. Please note that Java does not
    support multiple inheritances with classes. In Java, we can achieve multiple inheritances only through Interfaces.
    - interface One
    - interface Two
    - interface Three extends One, Two

    Hybrid Inheritance : Java doesn’t support multiple inheritances with classes, hybrid inheritance involving multiple inheritance is also not possible with classes.

    In sub-classes we can inherit members as is, replace them, hide them, or supplement them with new members:
    1. The inherited fields can be used directly, just like any other fields.
    2. We can declare new fields in the subclass that are not in the superclass.
    3. The inherited methods can be used directly as they are.
    4. We can write a new instance method in the subclass that has the same signature as the one in the superclass, thus overriding it (as in the example above, toString() method is overridden).
    5. We can write a new static method in the subclass that has the same signature as the one in the superclass, thus hiding it.
    6. We can declare new methods in the subclass that are not in the superclass.
    7. We can write a subclass constructor that invokes the constructor of the superclass, either implicitly or by using the keyword super.

    */
}
