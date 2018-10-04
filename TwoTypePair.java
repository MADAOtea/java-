public class TwoTypePair<T1,T2> {
  private T1 first ;
  private T2 second ;

  public TwoTypePair() {
    first = null ;
    second = null ;

  } // Pair()

  public TwoTypePair( T1 fItem, T2 sItem ) {
    first = fItem ;
    second = sItem ;
  } // Pair()

  public void SetFirst( T1 newfItem) {
    first = newfItem ;

  } // Pair()


  public void SetSecond( T2 newsItem) {
    second = newsItem ;
  } // Pair()

  public T1 getFirst() {
    return first  ;

  } // Pair()

  public T2 getSecond() {
    return second  ;

  } // Pair()




  public String toString() {
    return ( "first" + first.toString() + "\n" + "second:" + second.toString() ) ;
  } // 

  public boolean equals( Object otherObject ) {
    TwoTypePair<T1,T2> otherPair = new TwoTypePair<T1,T2>() ;

    if ( otherObject == null ) 
       return false ;
    else if ( getClass( ) != otherObject.getClass( ) )
       return false ;

    else {
      otherPair = (TwoTypePair<T1,T2>)otherObject ;
      return ( first.equals(otherPair.first ) && second.equals(otherPair.second) );


    } // else


  } // 

} // Pair