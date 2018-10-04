import java.util.Scanner ;

public class GenericPairDemo{
  public static void main( String args[] ) {
    Pair<String> secretPair = new Pair<String>("Happy", "Day");
    Scanner key = new Scanner(System.in);
    String word1 = key.next() ;
    String word2 = key.next() ;
    
    Pair<String> input = new Pair<String>(word1, word2);

    if ( input.equals(secretPair)) {
      System.out.println("YES");

    } 

    else {
           System.out.println("NO");

    } // else

  } // 




} // 