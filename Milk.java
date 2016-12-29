import java.io.Console;

public class Milk {

  public static void main(String[] args) {
    Console console = System.console();


    for (int i = 99; i > 0; i--) {
      console.printf("%d bottles of milk on the wall... %n", i);
    }


  }

}
