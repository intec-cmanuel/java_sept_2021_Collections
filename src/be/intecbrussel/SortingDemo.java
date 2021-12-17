package be.intecbrussel;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortingDemo {
    public static void main(String[] args) {
        Set<Box> boxes = new TreeSet<>(new HeightBoxComparator());
        boxes.add(new Box(100,100,100));
        boxes.add(new Box(50, 150, 200));
        boxes.add(new Box(150,20,100));


        boxes.forEach(System.out::println);
    }
}
