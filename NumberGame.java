import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rdm=new Random();
        boolean playAgain = true;
        int totalScore = 0;

        while (playAgain) {
            int numberToGuess=rdm.nextInt(100)+1;
            int numberOfAttempts=0;
            int maxAttempts=10;
            boolean hasGuessedCorrectly=false;

            System.out.println("A random number has been genarated.Can you guess it ?");
            System.out.println("You will have "+maxAttempts+ " attempts to guess this number." );

            while (numberOfAttempts<=maxAttempts && !hasGuessedCorrectly) {
                System.out.print("Enter your guess--->");
                int userGuess = sc.nextInt();
                numberOfAttempts++;

                if (userGuess==numberToGuess) {
                    System.out.println("Congratulations ! You have guessed the correct one.");
                    hasGuessedCorrectly=true;
                    totalScore=10-numberOfAttempts+1;
                    System.out.println("Your Total Score is: "+totalScore);
                    //System.out.println("Thank You for playing ! Enjoy your day.");
                }
                else if (userGuess<numberToGuess) {
                    System.out.println("Your guess is too low.Try again!");
                }
                else
                {
                    System.out.println("Your guess is too high.Try again!");
                }
            }
            if (!hasGuessedCorrectly) {
                System.out.println("Sorry ! You have exhausted all the attempts.The correct number was "+numberToGuess);
            }
            System.out.print("Do You want to play again ? (yes/no) :");
            String userResponse= sc.next();

            playAgain = userResponse.equalsIgnoreCase("yes");
        }
        System.out.println("Game Over ! Thank You for playing.");
        //System.out.println("Your Total Score is "+totalScore);
        sc.close();
    }
}
