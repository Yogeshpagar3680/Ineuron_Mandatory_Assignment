package question10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Write a Java program that reads a set of integers from the user and stores them in a
 * List. The program should then find the second largest and second smallest elements
 * in the List
 */
public class Alien {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 10 numbers");

        for(int i=1; i<=10; i++)
        {
            int number = sc.nextInt();
            list.add(number);
        }

        System.out.println("LIST :: " + list);
        int maxValue = Collections.max(list);
        list.remove(list.indexOf(maxValue));

        int secondLargestValue = Collections.max(list);
        System.out.println("Second largest value is :: " + secondLargestValue);

        int minValue = Collections.min(list);
        list.remove(list.indexOf(minValue));

        int secondSmallestValue = Collections.min(list);
        System.out.println("Second smallest value is :: " + secondSmallestValue);
    }
}

