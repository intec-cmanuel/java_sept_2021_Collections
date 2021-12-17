package be.intecbrussel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        List<String> myCollection = new ArrayList<>();
        myCollection.add("Java");
        myCollection.add("Python");
        myCollection.add("Cobol");
        myCollection.add(1, "Go");
        myCollection.add("Python");

//        System.out.println(myCollection.get(2)); // myArray[2]

        myCollection.set(2, "Javascript");

        myCollection.remove(0);

        Comparator<String> comp = Comparator.comparing(String::length).thenComparing(String::indexOf);
        myCollection.sort(Comparator.comparing(String::length).thenComparing(String::indexOf));

        myCollection.forEach(System.out::println);

        List<String> myList = List.of("Java", "Python", "Pascal"); // read only list
//        myList.add("Jean");
    }
}
