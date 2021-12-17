package be.intecbrussel.exercises;

import java.util.*;

public class LotteryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> userGuesses = new LinkedHashSet<>();
        Set<Integer> correctNumbers = new HashSet<>();

        System.out.println("Give 6 numbers between 1 and 45");
        while(userGuesses.size() < 6) {
            int userGuess = scanner.nextInt();
            if (userGuess >= 1 && userGuess <= 45) {
                userGuesses.add(userGuess);
            }
        }

        Random random = new Random();
        while(correctNumbers.size() < 6) {
            int correctNumber = random.nextInt(45) + 1;
            correctNumbers.add(correctNumber);
        }


        System.out.println("-".repeat(30));
        System.out.println("USER GUESSES: ");
        userGuesses.forEach(guess -> System.out.print(guess + " "));

        System.out.println("\nCORRECT NUMBERS: ");
        correctNumbers.forEach(number -> System.out.print(number + " "));

        correctNumbers.retainAll(userGuesses);

        System.out.println("\nSAME NUMBERS: ");
        correctNumbers.forEach(number -> System.out.print(number + " "));

        System.out.println("\nAmount of correct numbers: " + correctNumbers.size());
    }
}
