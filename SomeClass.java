import java.io.Serializable ;

public class SomeClass implements Serializable {
  private int number ;
  private char letter ;

  public SomeClass() {
    number = 0 ;
    letter = 'A' ;
  } //

  public SomeClass( int theNumber, char theLetter ) {
    number = theNumber ;
    letter = theLetter ;
    

  } // 


  public String toString() {
    return " number = " + number + " Letter = " + letter ; 
  } // 


} // SomeClass