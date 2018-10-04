public class Pair<T> {
  private T first ;
  private T second ;

  public Pair() {
    first = null ;
    second = null ;

  } // Pair()

  public Pair( T fItem, T sItem ) {
    first = fItem ;
    second = sItem ;
  } // Pair()

  public void SetFirst( T newfItem) {
    first = newfItem ;

  } // Pair()


  public void SetSecond( T newsItem) {
    second = newsItem ;
  } // Pair()

  public T getFirst() {
    return first  ;

  } // Pair()

  public T getSecond() {
    return second  ;

  } // Pair()




  public String toString() {
    return ( "first" + first.toString() + "\n" + "second:" + second.toString() ) ;
  } // 

  public boolean equals( Object otherObject ) {
    Pair<T> otherPair = new Pair<T>() ;

    if ( otherObject == null ) 
       return false ;
    else if ( getClass( ) != otherObject.getClass( ) )
       return false ;

    else {
      otherPair = (Pair<T>)otherObject ;
      return ( first.equals(otherPair.first ) && second.equals(otherPair.second) );


    } // else


  } // 

} // Pair