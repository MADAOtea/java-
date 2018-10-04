

public class RecursionDemo2  {
  public static void main( String[] arge ) {
     for ( int n = 0 ;  n < 4 ; n ++ ) {
       System.out.println( "3 to power " + n + "is " + power( 3,n )  ) ;

     } // for
 
  } // 

  public static int power ( int x, int n ) {
    if ( n < 0 ) {
      System.out.println("Illegal argument to power");
      System.exit(0);
    } // if 

    if ( n > 0 ) {
      return ( power( x, n-1 )*x  ) ;
   
    } // if


    else {
      return (1) ;
    } // else
  }// 


}// RecursionDemo2