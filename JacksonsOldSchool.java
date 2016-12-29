import java.io.Console;

public class JacksonsOldSchool {

  public static void main(String[] args) {
    Console console = System.console();
    String[] jacksons = {"Michael", "Jackie", "Tito",
                         "Jermaine", "Marlon", "Randy"};

    console.printf("The Jackson 5 are: %n");
    for (int i = 0; i < jacksons.length; i++) {
      String jackson = jacksons[i];
      console.printf("%s Jackson %n", jackson);
    }

  }
}
