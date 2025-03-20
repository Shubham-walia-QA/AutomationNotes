package Loop;

public class Switch {

    // ignore below 4 lines. they are used in methods class
    public int p3;
    private int pvt3;
    int d3;
    protected int pro3;

    public static void main(String[] args) {

        /**
        Note :- declared data type and case value should be same.

        In switch if we enter value as 3 then in output it will print all the values after 3. To stop that we need to
        add break after syso.
        syntax
        break;
         Example 1

        Note :: Before java version 5 switch statement only supports int values and we have to write break to stop executing
        further. but in new version we can also use string and to avoid using break we can use -> instead of : after case.
        Example 2

         Note :: Instead of stroring the value in every case we can add the o/p variable before switch. This will automatically store the true case statement in that variable.
         Example 3

         */

        //========================= Example 1 =========================================

        int day = 3;

        switch (day)
        {
            case 1:
                System.out.println("monday");
            case 2:
                System.out.println("tuesday");
            case 3:
                System.out.println("wednesday");
            case 4:
                System.out.println("thursday");
            case 5:
                System.out.println("friday");
            case 6:
                System.out.println("saturday");
            case 7:
                System.out.println("sunday");
            case 8:
                System.out.println();
            default:
                System.out.println("no matching day");
        }

        //========================= Example 2 =========================================

        String dayOfWeek = "Sunday";
        String result;

        switch (dayOfWeek)
        {
            case "Saturday", "Sunday" -> result =  "10 AM";

            case "Monday" -> result =  " 7AM";

            default -> result =  "8 AM";
        }
        System.out.println(result);

        //========================= Example 3 =========================================

        String dayOfWeek1 = "Sunday";
        String result1;

       result1=  switch (dayOfWeek1)
        {
            case "Saturday", "Sunday" -> "10 AM";

            case "Monday" -> "10 AM";

            default -> "10 AM";
        };
        System.out.println(result1);
    }

}
