
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String greet = "Hi ";
        System.out.println("What's you name?");
        // User named input will be stored here
        String name = scanner.nextLine();

        System.out.println(greet + name);

    }
}
