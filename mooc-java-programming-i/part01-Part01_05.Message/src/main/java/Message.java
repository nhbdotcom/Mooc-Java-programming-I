
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        //Read the string written by the user, and assign it
        // to a program memory "String message" = (string that was given as input)"
        String message = scanner.nextLine();
        
        //Printing the message written by the user
        System.out.println(message);

    }
}
