package Java;

public class Variable {





     /*
     Declaration : Creating a variable without assigning any value to it.
     Initialization : Creating a variable with value or adding value to the created variable.

     1. Instance Variables :: Instance variables are non-static variables and are declared in a class outside any method, constructor, or block.
     *
     * As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.
     * Unlike local variables, we may use access specifiers for instance variables. If we do not specify any access specifier, then the default access specifier will
        be used.
     * Initialization of an instance variable is not mandatory. Its default value is dependent on the data type of variable. For String it is null, for float it is
        0.0f, for int it is 0, for Wrapper classes like Integer it is null, etc.
     * Scope of instance variables are throughout the class except the static contexts.
     * Instance variables can be accessed only by creating objects.
     * We initialize instance variables using constructors while creating an object. We can also use instance blocks to initialize the instance variables.
     */

    // Declared Instance Variable
    public String geek;
    public int i;
    public Variable()
    {
    // Default Constructor
    // initializing Instance Variable
    this.geek = "Shubham Jain";
    }

     /* 2. Static Variables/Class Variable :: These variables are declared similarly to instance variables. The difference is that static variables are declared using the
     static keyword within a class outside any method, constructor, or block.

     * Unlike instance variables, we can only have one copy of a static variable per class, irrespective of how many objects we create.
     * Static variables are created at the start of program execution and destroyed automatically when execution ends.
     * Initialization of a static variable is not mandatory. Its default value is dependent on the data type of variable. For String it is null, for float it is 0.0f,
     for int it is 0, for Wrapper classes like Integer it is null, etc.
     * If we access a static variable like an instance variable (through an object), the compiler will show a warning message, which won’t halt the program. The compiler will
     replace the object name with the class name automatically.
     * If we access a static variable without the class name, the compiler will automatically append the class name. But for accessing the static variable of a
     different class,we must mention the class name as 2 different classes might have a static variable with the same name.
     * Static variables cannot be declared locally inside an instance method.
     * Static blocks can be used to initialize static variables.
     */

    // Declared static variable
    public static String geeky = "Shubham Jain";

    /* 1. Local Variables :: A variable defined within a block or method or constructor is called a local variable.
     *
     * The Local variable is created at the time of declaration and destroyed after exiting from the block or when the call returns from the function.
     * The scope of these variables exists only within the block in which the variables are declared, i.e., we can access these variables only within that block.
     * Initialization of the local variable is mandatory before using it in the defined scope.
     */

    public static void main(String[] args)
    {
        // Declared a Local Variable
        int var = 10;

        // This variable is local to this main method only
        System.out.println("Local Variable: " + var);

        // Object Creation
        Variable name = new Variable();

        // Displaying O/P
        System.out.println("Geek name is: " + name.geek);
        System.out.println("Default value for int is "+ name.i);

        // geeky variable can be accessed without object
        // creation Displaying O/P GFG.geek --> using the
        // static variable
        System.out.println("Geek Name is : " + geeky);
    }


    /*Final :-  This is used while declaring variable, and we can not reassign any value to that variable.
            Example 1;
    */

    //===============================Example 1=====================================
    final int abc =  2;

    public void meth1()
    {
        // abc =  3;
        // because of final keyword the above code is giving error.
    }
}
