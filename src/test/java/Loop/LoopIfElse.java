package Loop;

public class LoopIfElse {

    /*
    if Statements :: Execute the if block if the condition is true otherwise will move outside the if block.
    if-else loop :: Execute the statement if the condition is true otherwise else part will be executed.

    Syntax ::

    if(true)
    {}
    else if(true)
    {}
    else if(true)
    {}
    else
    {}

    Example 1

    Note :- We can remove { } if there is a single line inside the loop

    Ternary operator :: can b used instead of if else statement having 2 conditions
        condition ? if true : if false
        condition1 ? condition2 ? if condition2 true : if condition2 false : if Condition1 false

        Example :: {
        int n = 5;
        String s;

        instead of writing
        if (n%2==0)
        {
            s = "even";
        }
        else
        {
            s = "odd";
        }

        we can create a ternary operator

        s = (n%2==0) ? "even" : "odd"

        }

     */

    //========================= Example 1 =========================================
    static int num = 0;

    public static void main(String[] args) {

    if(num > 10)

        System.out.println("Number is greater then 10");

    else if (num == 10)

        System.out.println("Number is equal to 10");

    else

        System.out.println("Number is less then 10");

    }
}
