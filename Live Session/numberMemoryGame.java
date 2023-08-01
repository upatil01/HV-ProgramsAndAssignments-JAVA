import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;

public class numberMemoryGame {

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                // For Windows, use "cls" command to clear the screen
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // For Unix-like systems (Linux, macOS), use ANSI escape sequence to clear the screen
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws InterruptedException {
       
        Scanner Sc = new Scanner(System.in);
        Random R = new Random();
        System.out.println("Welcome to Number Memory Game");
        int numberLength = 4;

        int Score = 0;

         // Task 1 - creating a random sequence 
        int[] number = new int[numberLength];
        for(int i = 0; i < numberLength; i++){
            number [i] = R.nextInt(10);
            System.out.print("The sequence is " + Arrays.toString(number));
        }
        // allow time -sleep(mili second)
        // sleep(1000);
        Thread.sleep(1000);
        clearScreen();

       
        System.out.println("Please enter the Sequence : ");
        for(int i = 0;i <numberLength; i++){
            int userInput = Sc.nextInt();
            if(userInput == number[i]){
                // System.out.println("Well Done");
                Score++;
            }else{
                System.out.println("Sorry Wrong Answer");

            
            }Sc.close();
           
            // Sc.close();
        }
       
            
    }
}
    
// if (i == numberLength - 1) {
//                 System.out.println("Congratulations! You guessed the entire sequence correctly.");
//                 score++;
//             }


// Game Description: "Number Memory Game"

// Objective: The player needs to memorize a sequence of randomly generated numbers and then enter the numbers in the correct order. The game will gradually increase the sequence length to challenge the player's memory.

// Steps to Implement the Game:

// Generate a random sequence of numbers and store them in an array.
// Display the sequence of numbers to the player for a few seconds to allow them to memorize it.
// Clear the screen to hide the sequence.
// Prompt the player to enter the numbers in the sequence.
// Compare the player's input with the original sequence to check if it's correct.
// Gradually increase the length of the sequence for each round.
// Keep track of the player's score based on the number of correct guesses.

