package Oops;

public class FinalFinallyFinalize {


    /**
     *
     * ✅ Quick Summary (Interview Point):
     * final → restriction (variable, method, class).
     * finally → exception handling block, always runs.
     * finalize() → cleanup before object destruction by Garbage Collector.

     * 1. final (Keyword / Modifier)
     * Purpose: To restrict changes.
     * Usage:
     * final variable → value cannot be changed (constant).
     * final int x = 10;
     * x = 20; // ❌ compile-time error
     * final method → cannot be overridden in child class.
     * class A {
     *     final void display() { System.out.println("A"); }
     * }
     * class B extends A {
     *     void display() { } // ❌ error: cannot override final method
     * }
     * final class → cannot be inherited.
     * final class Car { }
     * class BMW extends Car { } // ❌ error
     * 2. finally (Block in Exception Handling)
     * Purpose: To ensure code always executes, regardless of whether an exception occurs.
     * Usage:
     * try {
     *     int data = 10 / 0;  // throws exception
     * } catch (ArithmeticException e) {
     *     System.out.println("Exception caught");
     * } finally {
     *     System.out.println("Finally block always executes");
     * }
     * Even if we return inside try/catch, finally still executes (except System.exit).
     * 3. finalize() (Method in Object class)
     * Purpose: Called by the Garbage Collector before destroying an object.
     * Usage:
     * class Test {
     *     @Override
     *     protected void finalize() throws Throwable {
     *         System.out.println("Object is garbage collected");
     *     }
     *     public static void main(String[] args) {
     *         Test t = new Test();
     *         t = null;
     *         System.gc(); // Suggest GC to run
     *     }
     * }
     * Rarely used in real projects (deprecated in Java 9). Instead, we use try-with-resources or close() methods.

     */
    /

}
