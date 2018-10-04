

public class UnorderedPair<T> extends Pair<T> {
  public UnorderedPair(){
     SetFirst(null);
     SetSecond(null);
  } // UnorderedPair()

  public UnorderedPair( T first, T second ){
     SetFirst(first);
     SetSecond(second);
  } // UnorderedPair()


  public boolean equals( Object otherObject) {
    if ( otherObject == null ) {
      return false ;
    } // if

    else if ( getClass() != otherObject.getClass()) 
       return false ;
    else {
      UnorderedPair<T> other = (UnorderedPair<T>)otherObject;
      return (getFirst().equals(other.getFirst())&& getSecond().equals(other.getSecond())) ||
             (getFirst().equals(other.getSecond())&& getSecond().equals(other.getFirst())) ;


    } // else


  } // 

}// 