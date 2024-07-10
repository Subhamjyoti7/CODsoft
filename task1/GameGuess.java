import java.util.Random;
import java.util.Scanner;


public class GameGuess{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomnum = new Random();
        boolean playAgainGame = true;
        int totalscore = 0;

        while (playAgainGame) {
            int attempts = 0;
            //  here i'm Set the maximum number of attempts allowed
            int maxAttempts = 10; 
            // user guess a random number between 1 to 100
            int numberToGuess = randomnum.nextInt(100)+1; 
            boolean GuessedCorrectly = false;

         

            System.out.println("you have chosen a number between 1  to 100. Try to guess it correctly!");

            while (attempts < maxAttempts && !GuessedCorrectly) {
                System.out.print("Enter your guess number: ");
                int userGuess = scanner.nextInt();
                attempts++;  
                if(numberToGuess >=100){
                    System.out.println("the number outof range sry!");
                }
                // here providing the feedback on wether the guess is too high or too low
                if (userGuess < numberToGuess) {
                    System.out.println("Too low num!");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high num!");
                } else {
                    System.out.println("Correct! You've guessed the number!");
                    GuessedCorrectly = true;
                    totalscore += (maxAttempts - attempts + 1); 
                }
            }
            // limit of attempts the user has to guess 
            // if not correctly! guess the show the final guess number
            if (!GuessedCorrectly) {
                System.out.println("You've used all your attempts sry!. The number was " + numberToGuess);
            }
            // allowing multiple rounds the user yo play again
            System.out.print("Do you want to play again? (yes/no): ");
            String userResponse = scanner.next();
            playAgainGame = userResponse.equalsIgnoreCase("yes");
        }

        // display the toal score of user 
        System.out.println("Game over! Your final score is: " + totalscore);
        scanner.close();
    }
}

