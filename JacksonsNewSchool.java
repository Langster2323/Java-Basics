import java.io.Console;

public class JacksonsNewSchool {

  public static void main(String[] args) {
    Console console = System.console();
    String[] jacksons = {"Michael", "Jackie", "Tito",
                         "Jermaine", "Marlon", "Randy"};
    for (String jackson : jacksons) {
      console.printf("%s Jackson %n", jackson);
    }

  }
}
