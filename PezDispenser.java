//access level modifier
public class PezDispenser {
  //This is a constant...
  //Final means, no one can change the objects state
  /* Static is a class level variable, allowing us
  to access state and behavior of information of class of
  itself without creating a instance of a class. I'm using
  this method inorder to reference the constant
  MAX_PEZ. */
  public static final int MAX_PEZ = 12;
  // "m" is a common naming prefix used for member variables
  //changing the access level modifier to private
  // A declared variable but not initialized
  private String mCharacterName;
  /* Storying the number of pez we jave
  in our dispenser. Left it declared but
  uninitialized, it'll be initialized
  in the constructor. */
  private int mPezCount;

  //How to create a constructor...
  public PezDispenser(String characterName) {
    mCharacterName = characterName;
    /* When it's initialized
      it'll come up empty, just like buying a
      dispenser at the store.*/
    mPezCount = 0;
  }
/* When we want a method to
    return nothing use the keyword
    void*/
  public void load() {
    mPezCount = MAX_PEZ;
  }

  public String getCharacterName() {
    return mCharacterName;
  }
}
