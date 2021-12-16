package be.intecbrussel;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("C#");
        list.add("Python");

        list.forEach(System.out::println);


    }
}
