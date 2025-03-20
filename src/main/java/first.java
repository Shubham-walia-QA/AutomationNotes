import java.util.Scanner;

public class first {


    public static void main(String[] args) {
        int c = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first numbers a :: ");
        int a = sc.nextInt();

        System.out.println("Enter first numbers b :: ");
        int b = sc.nextInt();

        System.out.println("Tell the opertation name sub, mul, div or add :: ");
        String op = sc.next();

        if (op.equalsIgnoreCase("sub")) {
            c = a - b;
        } else if (op.equalsIgnoreCase("add")) {
            c = a + b;
        } else if (op.equalsIgnoreCase("mul")) {
            c = a * b;
        } else if (op.equalsIgnoreCase("div")) {
            c = a / b;
        } else {
            System.out.println("Incorrect operation name");
            return; //  Exit the program
        }
        System.out.println("Result ::" + c);
    }
}
