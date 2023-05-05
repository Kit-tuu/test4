import java.util.*;
import java.lang.*;

public class Calculator
{
    public static void main(String [] args)
    {
        System.out.println("Operation to be done : Add / Subtract/ Divide");
        Scanner s = new Scanner(System.in);
        String operation = s.next();
        if(operation.equalsIgnoreCase("Add"))
        {
            System.out.println("Enter 2 numbers:");
            int n1 = s.nextInt();
            int n2 = s.nextInt();
            System.out.println("Sum = "+ (n1+n2));
        }

        else if(operation.equalsIgnoreCase("Subtract"))
        {
            System.out.println("Enter 2 numbers:");
            int n1 = s.nextInt();
            int n2 = s.nextInt();
            System.out.println("Difference = "+ (n1-n2));
        }

        else if(operation.equalsIgnoreCase("Divide"))
        {
            System.out.println("Enter 2 numbers:");
            int n1 = s.nextInt();
            int n2 = s.nextInt();
            System.out.println("Result = "+ (n1/n2));
        }

        else
        {
            System.out.println("Invalid choice");
        }
    }

}
