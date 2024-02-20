
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RandomNumberGenerator {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        // Ask user for their name
        System.out.print("Hi there, Welcome to the Random Number Generator! May I have your name? ");
        String userName = keyboard.next();

        // Send a personalized message back to user using their inputted name
        System.out.println("Nice to meet you " + userName + "!");

        // Ask for max number to generate number between
        System.out.print("Give me the max number you want your random number to fall under: ");
        int numRange = keyboard.nextInt();
          
        // Output a loading message
        System.out.println("Now generating a number between 0 and " + numRange + "... ");
        
        // Delay output by 3 seconds
        TimeUnit.SECONDS.sleep(3);

        // Generate random number
        Random rand = new Random();
        int randomNum = rand.nextInt(numRange + 1);

        // Tell the user the random number that was generated
        System.out.println(userName + ", your random number is " + randomNum + "!");


        

        

        // Close Scanner to avoid resource leak
        keyboard.close();
    }
}
