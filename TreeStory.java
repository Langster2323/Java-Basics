import java.io.Console;

public class TreeStory {

    public static void main(String[] args) {
        Console console = System.console();
      //__Name__ is a __adjective__ __noun__. They are always __adverb__ __verb__.
      if (age < 13) {
        console.printf("Sorry you must be at least 13 to use this program\n");
        System.exit(0);
      }
      String name = console.readLine("Enter a name:  ");
      String adjective = console.readLine("Enter an adjective:  ");
      String noun = console.readLine("Enter a noun:  ");
      String adverb = console.readLine("Enter an adjective:  ");
      String verb = console.readLine("Enter a verb ending in -ing:  ");
      console.printf("Your TreeStory:\n----------------\n");
      console.printf("%s is a %s %s. ", name, adjective, noun);
      console.printf("Thay are always %s %s.\n", adverb, verb);
    }

}
