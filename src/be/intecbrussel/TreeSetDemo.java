package be.intecbrussel;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(3);
        set.add(7);
        set.add(6);

        System.out.println(set.higher(8));

    }
}
