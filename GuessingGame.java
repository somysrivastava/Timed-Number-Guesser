package Game;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class GuessingGame {
    private static int timeLimit = 30; // Default time limit in seconds
    private static boolean timeUp = false;
    private static int maxNumber = 100; // Default maximum number

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            timeUp = false;
            setDifficulty(scanner);

            int randomNumber = (int) (Math.random() * maxNumber) + 1; // Generate a random number
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    timeUp = true;
                }
            }, timeLimit * 1000);

            System.out.println("Guess a number between 1 and " + maxNumber + ". You have " + timeLimit + " seconds.");
            int attempts = 0;

            while (!timeUp) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    timer.cancel();
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("The number is higher. Try again.");
                } else {
                    System.out.println("The number is lower. Try again.");
                }
            }

            if (timeUp) {
                System.out.println("Time's up! You didn't guess the number in time. The correct number was " + randomNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }
        System.out.println("Thank you for playing!");
    }

    private static void setDifficulty(Scanner scanner) {
        System.out.println("Select difficulty level: ");
        System.out.println("1. Easy (1-50, 60 seconds)");
        System.out.println("2. Medium (1-100, 30 seconds)");
        System.out.println("3. Hard (1-200, 15 seconds)");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                maxNumber = 50;
                timeLimit = 60;
                break;
            case 2:
                maxNumber = 100;
                timeLimit = 30;
                break;
            case 3:
                maxNumber = 200;
                timeLimit = 15;
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Medium.");
                maxNumber = 100;
                timeLimit = 30;
                break;
        }
    }
}
