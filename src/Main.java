import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        int choice = input.nextInt();
        Random rand = new Random();
        int guesses = 0;
        int hiddenNum = rand.nextInt(100);
        while (choice != hiddenNum) {
            if (choice < hiddenNum) {
                System.out.println("The number is bigger");
                choice = input.nextInt();
            }
            else if (choice > hiddenNum) {
                System.out.println("The number is smaller");
                choice = input.nextInt();
            }
            else if (choice == hiddenNum) {
                break;
            }
            guesses++;
        }
        input.close();
        System.out.println("You guessed it in " + guesses + " attempts!");
    }
}