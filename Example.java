public class Example {

    public static void main(String[] args) {
        // Your amazing code goes here...
        //println prints a formatted text with \n at the end of it
        System.out.println("We are making a Pez Dispenser.");
        //Made a brand new Pez Dispenser...
        PezDispenser dispenser = new PezDispenser("Yoda");
        System.out.printf("The dispenser character is %s\n",
                       dispenser.getCharacterName());
                       // A common state request...
        if (dispenser.isEmpty()) {
          System.out.println("It is currently empty");
        }
        System.out.println("Loading...");
        dispenser.load();
        if (!dispenser.isEmpty()) {
          System.out.println("It is no longer empty");
        }
        while (dispenser.dispense()) {
       System.out.println("Chomp!");
     }
       if (dispenser.isEmpty()) {
         System.out.println("Ate all the PEZ!");
       }
       dispenser.load(4);
       dispenser.load(2);
         while (dispenser.dispense()) {
        System.out.println("Chomp!");
      }
    }
}
