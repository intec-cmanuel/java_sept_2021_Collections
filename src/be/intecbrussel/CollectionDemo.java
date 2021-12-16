package be.intecbrussel;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {

        Collection<String> myCollection = new ArrayList<>();
        myCollection.add("Java");
        myCollection.add("Python");
        myCollection.add("Cobol");
        myCollection.add("Go");
        myCollection.add("Python");

        while (myCollection.contains("Python")) {
            myCollection.remove("Python");
        }

        myCollection.clear();

        myCollection.forEach(System.out::println);
    }
}
