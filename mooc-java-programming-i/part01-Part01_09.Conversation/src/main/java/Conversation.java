
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] userInput = new String[2];
        // The input of the user will be stored here
        System.out.println("Greetings! How are you doing?");
        userInput[0] = scanner.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        userInput[1] = scanner.nextLine();
        System.out.println("Thanks for sharing!");
    }
}
