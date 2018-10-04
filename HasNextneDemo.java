import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.Scanner;

public class HasNextneDemo {
  public static void main( String arge[] ) {
    Scanner inputStream = null ;
    PrintWriter outputStream = null ;
    

    try {
      inputStream = new Scanner( new FileInputStream( "original.txt")) ;
      outputStream = new PrintWriter( new FileOutputStream( "numbered.txt" ));
          
    } 

    catch( FileNotFoundException e ) {
      System.out.println( "Error opening the file stuff" );
      System.exit(0);   

    } //
     
    String line = null ;
    int count = 0 ;
    
    while( inputStream.hasNextLine() ) {
      line = inputStream.nextLine() ;
      count++ ;
      outputStream.println( count + "  " + line) ; 

   

    } 

    outputStream.close() ;
    inputStream.close() ;
 
  } 

}