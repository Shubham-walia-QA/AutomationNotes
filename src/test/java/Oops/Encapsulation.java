package Oops;

//A Java class which is a fully encapsulated class.
//It has a private data member and getter and setter methods.

public class Encapsulation {

    /**
     *
     * 1. What is encapsulation in Java?
     * Encapsulation is the process of wrapping data (variables) and methods (functions) into a single unit (class) and hiding implementation details from the outside world.
     * 2. How is encapsulation implemented in Java?
     * By making class variables private.
     * Providing public getters/setters or methods to control access.
     * 3. What are the advantages of encapsulation?
     * Data security (restricted access).
     * Better control over data modification.
     * Code flexibility & maintainability.
     * Improves reusability.
     * 4. What is the difference between encapsulation and abstraction?
     * Encapsulation → Hides data using access modifiers.
     * Abstraction → Hides implementation details using abstract classes/interfaces.
     * 5. Can you give a real-world example of encapsulation?
     * Bank Account class → balance is private, updated only via deposit()/withdraw().
     * RestAssured → POJO classes for request/response with private fields + getters/setters.
     * 6. Why do we make class variables private?
     * To restrict direct access and ensure controlled modification using methods (security + validation).
     * 7. Is encapsulation only about private variables?
     * No. It’s about controlling access, usually with private fields, but can also use protected/default with controlled methods.
     * 8. Can we achieve encapsulation without getters and setters?
     * Yes, partially. Encapsulation can also be achieved using methods that operate on data (e.g., deposit()/withdraw() instead of getters/setters).
     * 9. How does encapsulation improve security?
     * It hides sensitive data and allows validation before modification. Example: preventing negative balance updates in a BankAccount.
     * 10. How is encapsulation used in frameworks like Selenium?
     * In Page Object Model (POM):
     * Web elements → declared private.
     * Public methods → login(), clickSubmit() provide access.
     * This hides locator details and exposes only meaningful actions.
     *
    Encapsulation :- Like a capsule we keep everything tight inside a small thing so that no one from outside world can see it. Encapsulation is
     about binding data and methods together into a single unit (class) and controlling access to that data using access modifiers (private, public, etc.

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