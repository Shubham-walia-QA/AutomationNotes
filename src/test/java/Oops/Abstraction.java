package Oops;

    /*

    “Abstraction in Java is an OOP concept where we hide the implementation details and only show the essential features. In simple terms, the user knows what
    a method does but not how it’s done.

    In Java, abstraction is mainly achieved in two ways:
        1. Abstract classes, declared with the abstract keyword. They can have abstract methods without a body as well as concrete methods with implementation.
        2. Interfaces, which before Java 8 could only have abstract methods, but since Java 8 they can also have default and static methods.

    An abstract class can have constructors (which can be called in the child class using the Super keyword) and instance variables, while interfaces cannot. Also, a class can
    extend only one abstract class  (using extends keyword) but implement multiple interfaces (using implements keyword), giving flexibility with multiple inheritance. 100%
    abstraction could be achieved before Java 8, now partial too) → can have abstract, default, and static methods.

    A key rule is: if a class has even one abstract method, it must be declared abstract. and if we inherit an abstract class then all the abstract methods should
    be declared in the child class using @Overridden keyword above method name.

    And while you cannot directly instantiate an abstract class, you can create references to it and point them to subclass objects — which enables polymorphism.
    For real-world examples: In Selenium, we use ITestListener where TestNG calls our implementations behind the scenes, and in JDBC, we just call getConnection()
    without worrying about the underlying database. Similarly, an ATM hides all the banking logic — we just see simple options like withdraw or check balance.
    So, abstraction focuses on what an object does rather than how it does it, making systems easier to design, extend, and maintain.”

    Abstract Classes and Abstract Methods
    * An abstract method must always be redefined in the subclass, thus making @Overriding compulsory or making the subclass itself abstract.
    * There can be no object of an abstract class. That is, an abstract class can not be directly instantiated with the new operator.
    * It can have constructors and that constructor can be called in the child class by using the super keyword. The reason of having constructor
    is to initialize the variables declared in the abstract class.

    Difference between abstract class and interface?
        Inheritance: Abstract class → extends, Interface → implements.
        Methods: Abstract class → abstract + concrete methods; Interface → only abstract before Java 8, can have default + static after Java 8.
        Variables: Abstract class → instance variables; Interface → only public static final.
        Constructors: Abstract class → allowed; Interface → not allowed.
        Multiple Inheritance: One abstract class, multiple interfaces.
        Abstraction: Abstract class → partial; Interface → full (before Java 8).

     Not imp (can be ignored)

    abstract class Vehicle {
    String brand;
    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor called"); }}

        class Car extends Vehicle {
    Car(String brand) {
        super(brand); // calls abstract class constructor }}

    * Class that is declared with an abstract keyword.
    * Method that is declared without implementation and should have abstract keyword.
    * An abstract class may or may not have all abstract methods. Some of them can be concrete methods
    * If a class contains one or more abstract methods than that must be declared with an abstract keyword.
     */

    // Java program to illustrate the
    // concept of Abstraction
abstract class Abstraction {

        String color;

        // these are abstract methods
        abstract double area();
        public abstract String toString();

        // abstract class can have the constructor
        public Abstraction(String color)
        {
            System.out.println("Shape constructor called");
            this.color = color;
        }

        // this is a concrete method
        public String getColor() {
            return color;
        }
    }

    class Circle extends Abstraction {
        double radius;

        public Circle(String color, double radius)
        {
            // calling Shape constructor
            super(color);
            System.out.println("Circle constructor called");
            this.radius = radius;
        }

        @Override double area()
        {
            return Math.PI * Math.pow(radius, 2);
        }

        @Override public String toString()
        {
            return "Circle color is " + super.getColor()
                    + "and area is : " + area();
        }
    }
    class Rectangle extends Abstraction {

        double length;
        double width;

        public Rectangle(String color, double length,
                         double width)
        {
            // calling Shape constructor
            super(color);
            System.out.println("Rectangle constructor called");
            this.length = length;
            this.width = width;
        }

        @Override double area()
        {
            return length * width;
        }

        @Override public String toString()
        {
            return "Rectangle color is " + super.getColor()
                    + "and area is : " + area();
        }
    }
     class Testi {
        public static void main(String[] args)
        {
            Abstraction s1 = new Circle("Red", 2.2);
            Abstraction s2 = new Rectangle("Yellow", 2, 4);

            System.out.println(s1.toString());
            System.out.println(s2.toString());
        }
    }
