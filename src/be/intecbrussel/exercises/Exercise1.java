package be.intecbrussel.exercises;

import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        part2();
    }

    private static void part2() {
        List<String> wordList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a sentence");

        String word;
        do {
            word = scanner.next();
            wordList.add(word);
        } while (!word.endsWith("."));

        Collections.reverse(wordList);

        System.out.println(wordList.size());

        String sentence = wordList.stream().reduce("", (acc, e) -> acc + " " + e);
        System.out.println(sentence);
    }

    private static void part1() {
        List<Integer> numberList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give 5 numbers");
        for (int i = 0; i < 5; i++){
            int userinput = scanner.nextInt();
            numberList.add(userinput);
        }

        numberList.forEach(System.out::println);

        int sum = numberList.stream()
                .mapToInt(number -> number)
                .sum();

        System.out.println(sum);

        OptionalDouble optionalDouble = numberList.stream()
                .mapToInt(number -> number)
                .average();

        if (optionalDouble.isPresent()) {
            System.out.println(optionalDouble.getAsDouble());
        }
    }
}
