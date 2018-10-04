import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class TextFileOutputDemo {
  public static void main( String arge[] ) {
    PrintWriter outputStream = null ;
    try {
      outputStream = new PrintWriter( new FileOutputStream( "stuff.txt" ));
          
    } 

    catch( FileNotFoundException e ) {
      System.out.println( "Error opening the file stuff" );
      System.exit(0);   

    } //

      outputStream.println( "the quick brown fox" );
      outputStream.println( "jumped oveer the lazy" ) ;
      outputStream.close() ;
      System.out.println("End" ) ;
 
  } 

}