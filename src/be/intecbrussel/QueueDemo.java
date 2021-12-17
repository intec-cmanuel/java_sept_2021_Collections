package be.intecbrussel;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> myQueue = new PriorityQueue<>();
        myQueue.offer("Java");
        myQueue.offer("Python");
        myQueue.offer("Cobol");
        myQueue.add("Go");
        myQueue.add("Python");

        while(myQueue.peek() != null) {
            String element = myQueue.poll();
            System.out.println(element);
        }
    }
}
