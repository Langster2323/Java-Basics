public class Example {

    public static void main(String[] args) {
        // Your amazing code goes here...
        //println prints a formatted text with \n at the end of it
        System.out.println("We are making a Pez Dispenser.");
        //Made a brand new Pez Dispenser...
        PezDispenser dispenser = new PezDispenser();
        System.out.printf("The dispenser character is %s\n",
        dispenser.mCharacterName());
    }
}
