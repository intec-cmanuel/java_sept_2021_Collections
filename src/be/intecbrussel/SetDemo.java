package be.intecbrussel;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Hello");
        set.add("Today");
        set.add("is");
        set.add("potato");
        set.add("a");
        set.add("good");
        set.add("day");
        set.add("Hello");

        set.forEach(word -> System.out.println(word.hashCode() + " - " + word));
        System.out.println("Today".hashCode());
    }
}
