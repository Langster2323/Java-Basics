import java.io.Console;
/* importing the console type from java.io.package
Java packages are used to bundle related
functionality and programs.
The combination of input and output
is referred to as IO*/
public class Introductions {
  public static void main(String[] args) {
    Console console = System.console();
    //Introduction program!
    String firstName = console.readLine("What is your name? ");
    /* This method returns a value that we
      then use to set our firstName variable*/
      //thisIsAnExampleOfCamelCasing
      /* When you first create or declare
      a variable, you first use its data type*/
      console.printf("Hello, my name is %s\n", firstName);
      /*I replaced my name with a format specifier %s,
      s stands for string. After the first paramenter
      I inserted a comma, then I insert the firstName
      variable.*/
      console.printf("%s is learning how to write Java\n", firstName);
  }
}
