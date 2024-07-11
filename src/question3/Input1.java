package question3;

import java.util.Scanner;

/**
 * Write a Java programme that takes an integer from the user and throws an exception
 * if it is negative.Demonstrate Exception handling of same program as solution.
 */
public class Input1 {
    public static void main(String[] args) throws ArithmeticException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");

        int number = sc.nextInt();

        if (number < 0)
            throw new ArithmeticException();
    }
}
