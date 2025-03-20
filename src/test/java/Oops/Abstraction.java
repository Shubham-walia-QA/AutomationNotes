package Oops;

    /*
    Abstraction in Java is the process of hiding the implementation details and only showing the essential functionality or features to the user.
    This helps simplify the system by focusing on what an object does rather than how it does it.
    The unnecessary details or complexities are not displayed to the user.

    Abstract Classes and Abstract Methods
    * An abstract class is a class that is declared with an abstract keyword.
    * An abstract method is a method that is declared without implementation and should have abstract keyword.
    * An abstract class may or may not have all abstract methods. Some of them can be concrete methods
    * A abstract method must always be redefined in the subclass, thus making overriding compulsory or making the subclass itself abstract.
    * Any class that contains one or more abstract methods must also be declared with an abstract keyword.
    * There can be no object of an abstract class. That is, an abstract class can not be directly instantiated with the new operator.
    * An abstract class can have parameterized constructors and the default constructor is always present in an abstract class.
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
