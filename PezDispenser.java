//access level modifier
public class PezDispenser {
  //This is a constant...
  //Final means, no one can change the objects state
  public static final int MAX_PEZ = 12;
  // "m" is a common naming prefix used for member variables
  //changing the access level modifier to private
  // A declared variable but not initialized
  private String mCharacterName;

  //How to create a constructor...
  public PezDispenser(String characterName) {
    mCharacterName = characterName;
  }

  public String getCharacterName() {
    return mCharacterName;
  }
}
