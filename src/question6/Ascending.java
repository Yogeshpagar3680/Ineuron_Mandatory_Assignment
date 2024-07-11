package question6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ascending {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(20);
        al.add(60);
        al.add(10);
        al.add(15);
        al.add(30);
        al.add(22);
        al.add(50);
        al.add(45);

        System.out.println("Before Sorting");
        System.out.println(al);

        List l = al.stream().sorted().collect(Collectors.toList());

        System.out.println("After Sorting");
        System.out.println(l);
    }
}
