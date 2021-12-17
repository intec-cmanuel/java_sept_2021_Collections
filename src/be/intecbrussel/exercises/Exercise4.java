package be.intecbrussel.exercises;

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        part2();
    }

    private static void part2() {
        SortedSet<String> wordList = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a sentence");

        String word;
        do {
            word = scanner.next();
            wordList.add(word);
        } while (!word.endsWith("."));

        System.out.println(wordList.size());

        String sentence = wordList.stream().reduce("", (acc, e) -> acc + " " + e);
        System.out.println(sentence);
        System.out.println(wordList.first());
        System.out.println(wordList.last());
    }
}
