package question3;

import java.util.Scanner;

public class ExceptionHandling
{
    public static void main(String[] args) throws ArithmeticException
    {
        try
        {
            int number;
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the number");
            number = sc.nextInt();
            System.out.println(number);
            if(number < 0)
                throw new ArithmeticException();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Please enter positive number");
        }
    }
}
