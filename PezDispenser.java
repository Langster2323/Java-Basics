//access level modifier
public class PezDispenser {
  // "m" is a common naming prefix used for member variables
  //Changing the access level modifier to private
  private String mCharacterName = "Yoda";

// Added a getter, that can be used to get the character name
  public String getCharacterName() {
    return mCharacterName;
  }
}
