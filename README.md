LEARNING Java

To run a file you must first compile it.
ex: javac Introductions.java
This is telling the Java complier to convert or compile the code in the file into a executable file

Next, to run my program
ex: java Introductions
Note that after every save, you will have to compile the file again.

Step by step example of refactoring and using do while loops

1.
console.readLine("Do you understand do while loops?"  )
String response = "yes"

2.
String response;
boolean heUnderstandsLoops;
do {
  response = console.readLine("Do you understand do while loops?"  );
  heUnderstandsLoops = (response.equalsIgnoreCase("no"));
  if (heUnderstandsLoops) {
    console.printf("Continue Learning");
  }
} while (heUnderstandsLoops);
