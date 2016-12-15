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

  /* Decramenting... This is a function that
 every time we dispense, the caller will know
 that we dispensed some.*/
 public boolean dispense() {
   /* This boolean value is saying
   if there's nothing to dispense
   then return false.*/
   boolean wasDispensed = false;
   if (!isEmpty()) {
     mPezCount--;
     wasDispensed = true;
   }
   return wasDispensed;
 }

// This is a Helper method...
public boolean isEmpty() {
  // This does the equality check and returns it
  return mPezCount == 0;
}

/* When we want a method to
    return nothing use the keyword
    void. WHen called it should set
    mPezCount to the calue of the
    constant we declared earlier.*/
  public void load() {
    /* Any new changes to the new load method
    below. The old one will get the same
    changes and there's no repeated code anymore. */
    load(MAX_PEZ);
  }
/* These are different methods
because they have different
method signatures. */
  public void load(int pezAmount) {
    mPezCount += pezAmount;
  }

  public String getCharacterName() {
    return mCharacterName;
  }
}
