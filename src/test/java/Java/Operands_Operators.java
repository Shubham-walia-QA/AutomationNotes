package Java;

public class Operands_Operators {


    public static void main(String[] args) {

        /**
        Types of operators::

 Arithmetic Operators       ||  Unary Operators                 ||  Rational Operator           ||      Conditional/Logical Operator    ||  Assignment Operator
 * : Multiplication         ||  ++ : Increments by 1            ||  == Equal to                 ||      && -> And -> True if both true  ||  += , Add  and assign.
 / : Division               ||  -- : Decrements by 1            ||  != Not Equal to             ||      || -> Or ->True if one is true  ||  -= , Subtract  and assign.
 % : Remainder              ||  !  : Inverts a boolean value    ||  > Greater than              ||      ?! -> Ternary Operator          ||  *= , Multiply and assign.
 + : Addition               ||+= int : increment value by int   ||  < Less than                 ||                                      ||  /= , Divide  and assign.
 – : Subtraction            ||                                  ||  >= Greater than or equal to ||                                      ||  %= , Remainder and assign.
                                                                ||  <= Less than or equal to    ||                                      ||   example, a += 5 replaces a = a + 5.


         */
        int num = 7;

        // Instead of writing num =  num +2, we can write
        num +=2; // will increment the value of num by 2,
        System.out.println(num);
    }
}
