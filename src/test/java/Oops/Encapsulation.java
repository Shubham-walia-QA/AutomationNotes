package Oops;

//A Java class which is a fully encapsulated class.
//It has a private data member and getter and setter methods.

public class Encapsulation {

    /**
    Encapsulation :- Like a capsule we keep everything tight inside a small thing so that no one from outside world can see it. Encapsulation is Data wraping/binding
     data and methods in single unit.

    Data hiding :- Hiding data from outside world so that they cannot be used.

    Getter & Setter :- In a class instance variable should be private which we cannot call in other class. To call them we have to use getter and setter. like i have
    a name but if someone want to know it he should ask it.

    * Getters :: methods which are used to get any value. like that private variable value we want to access then we have to call the getter method of that variable.
    * Setters :: These are those methods which are used to assign any value to a variable.

     Mostly these variables doesnot have any value while declaring.

     Example 1

     Question :- Create 3 variables, account number, PIN number and balance amount.  Create a method and write the code to print
    1. Insufficient balance condition,
    2. Invalid credentials
    3. Amount withdrawn
    4. mechanism to update pin

     */

    //private data member
    private String name;

    //getter method for name
    public String getName() {
        return name;
    }

    //setter method for name
    public void setName(String name) {
        this.name = name;
    }
}

// output :: vijay