import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        int randomNumber = (int) (Math.random() * 100) + 1;

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to guess the number
        System.out.println("Guess a number between 1 and 100: ");

        // Get the user's guess
        int guess = scanner.nextInt();

        // Check if the guess is correct
        if (guess == randomNumber) {
            System.out.println("Congratulations! You guessed the correct number.");
        } else {
            System.out.println("Sorry, your guess was incorrect. The correct number was " + randomNumber);
        }
    }
}