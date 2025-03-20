package Loop;

public class BreakConitnue {

     /*
    Break :- The Break Statement in Java is a control flow statement used to terminate loops and switch cases.
    As soon as the break statement is encountered from within a loop, the loop iterations stop there, and control returns from the loop immediately to the first statement after the loop.
    Syntax:- break;

    Continue :- The continue statement is used inside the loops such as for, while, and do-while to skip the current iteration and move directly to the next iteration of
    the loop.
    Syntax:- continue;
     */

    //=============================== Break =====================================

    public static void main (String[] args) {

        //assigning n as integer value
        int n = 1;

        //passing n to switch
        // it will check n and display output accordingly
        switch(n) {

            case 1:
                System.out.println("GFG");
                break;
            case 2:
                System.out.println("Second Case");
                break;
            default:
                System.out.println("default case");
        }


        //=============================== Continue =====================================
        // For loop for iteration
        for (int i = 0; i <=5; i++)
        {
            // Check condition for continue
            // skip the execution of loop when i==3
            if (i == 3)
                continue;

            System.out.print(i + " ");
        }
    }
}
