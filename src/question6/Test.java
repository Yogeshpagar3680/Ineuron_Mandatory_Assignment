package question6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a Java program that uses stream api to perform operations on a large data set,
 * such as sorting or filtering the data.
 */
public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(0);
        l.add(2);
        l.add(5);
        l.add(3);
        l.add(12);
        l.add(50);
        System.out.print("LIST :: ");
        System.out.println(l);

        List<Integer> l1 = l.stream().filter(i-> i%2 == 0).collect(Collectors.toList());
        System.out.print("AFTER APPLYING FILTER :: ");
        System.out.println(l1);
    }
}
