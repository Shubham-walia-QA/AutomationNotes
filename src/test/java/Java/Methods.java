package Java;

import Loop.Switch;

public class Methods {

        /*
        Methods :: Methods are blocks of statement which are used to do a specific task.

        Sytnax ::

        <Access_Modifier/Access_Specifier> <Keyword> <Return_Type> <Methods_Name>(Parameter_Name, Parameter_Name){
        }

        Example 1

        Access modifier :- Specify access level of java component. Types ::
        1. Public -> Accessible anywhere.
        2. Private -> Accessible only in that class
        3. Default ->
        4. Protected ->Accessible only in that package but using inheritance can be accessed in other class.

        Class can be public/default.
        Public class :- Accessible anywhere in the project.
        Default class :- Accessible only in the package.

        Assignment ::
        Create class > Create variables  of 4 access modifer
        1. Try to call them inside same class method.
        Example 4
        2. Try to call them inside different class but same package.
        Example 5
        3. Try to call them inside different class and different package.
        Example 6

        Variable    || Within Same Class || Outside class but in same pkg || Outside pkg without inheritance || Outside pkg with inheritance ||
        Public      ||  Y                || Y                             ||    Y                            || Y                            ||
        Protected   ||  Y                || Y                             ||    N                            || Y                            ||
        Default     ||  Y                || Y                             ||    N                            || N                            ||
        Private     ||  Y                || N                             ||    N                            || N                            ||

        *** Keyword ***
        1. Non-Static :: Non-Static methods can be directly called inside another non-static method without creating the object of that method. if we donot use
        static keyword while our method declaration then the method becomes non-static.
         Example 2

        2. Static :: Static methods can be directly called inside another static or non-static  method without creating the object of that method. The method with
        static keyword while declaration is called static method.
        We can call non-static method inside static method like 'main' by creating the object of that method.
         Example 3

        Note:- Same logic applies for static/non-static components like variable.



         */

    int z;
    static int x;

    public int p;
    private int pvt;
    int d;
    protected int pro;

    //========================= Example 1 =========================================
    public int sum(int x, int y) {
        z = x + y;
        return z;
    }

    //========================= Example 2 =========================================
    public void go() {
        System.out.println("go method");



    }

    public void go2(){
        go();
        go3();  // Static method without object
        System.out.println("go2 method");

    }

    //========================= Example 3 =========================================
    public static void go3(){
        System.out.println("static method");
    }

    public static void main(String[] args) {
        Methods obj = new Methods();
        obj.sum(10, 2);
        obj.go2();
        go3();
        int x1 = x;
        int x2 = obj.z; //   without object it will give error because z is a non-static variable

        // calling the variables of naming class

    }

    public void accessModifer()
    {
        //========================= Example 4 =========================================
        p=2;
        pvt = 3;
        d = 4;
        pro = 5;
        System.out.println("public:: " + p + " private:: " + pvt +  " default :: " + d + " protected:: " + pro);

        //========================= Example 5 =========================================
        // calling variables of same package different class
        Naming obj2 = new Naming();
        obj2.p2 = 12;
        // obj2.pvt2 = 13;      Error
        obj2.d2 = 14;
        obj2.pro2 = 15;
        System.out.println("public:: " + obj2.p2 + " default :: " + obj2.d2 + " protected:: " + obj2.pro2);

        //========================= Example 6 =========================================
        // calling variable of different package class
        Switch obj3 = new Switch();
        obj3.p3 = 32;
        // obj3.pvt3 = 33;      Error
        // obj3.d3 = 34;        Error
        // obj3.pro3 = 35;      Error
        System.out.println("public:: " + obj2.p2);
    }
}