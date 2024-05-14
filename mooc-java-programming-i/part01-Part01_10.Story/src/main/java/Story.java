
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        String[] userInput = new String[2];
        String[] storiesJourney = new String[]{
            "I will tell you a story, but I need some information first.", 
            "What is the main character called?",
            "What is their job?",
            "Here is the story:",
            "Once upon a time there was Ada, who was a Data scientist.",
            "On the way to work, Ada reflected on life.",
            "Perhaps Ada will not be a Data scientist forever."
        };
        System.out.println(storiesJourney[0]);
        System.out.println(storiesJourney[1]);
        userInput[0] = scanner.nextLine();
        System.out.println(storiesJourney[2]);
        userInput[1] = scanner.nextLine();

        System.out.println(storiesJourney[3]);

        String newStory = storiesJourney[4].replaceFirst("Ada", userInput[0]);
        newStory = newStory.replaceFirst("Data scientist", userInput[1]);
        System.out.println(newStory);

        String newStory1 = storiesJourney[5].replaceFirst("Ada", userInput[0]);
        System.out.println(newStory1);

        String newStory2 = storiesJourney[6].replaceFirst("Ada", userInput[0]);
        newStory2 = newStory2.replaceFirst("Data scientist", userInput[1]);
        System.out.println(newStory2);
    }
}
