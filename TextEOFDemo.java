import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.IOException ;
import java.io.BufferedReader;
import java.io.FileReader;

public class TextEOFDemo {
  public static void main( String arge[] ) {
    
  
    

    try {
      BufferedReader inputStream = new BufferedReader(new FileReader( "original.txt") );
      PrintWriter outputStream = new PrintWriter( new FileOutputStream( "numbered.txt" ) ) ;
    
      int count = 0 ;
      String  line = inputStream.readLine() ;
      while( line != null ) {
        count++ ;
        outputStream.println( count +" " + line) ;
        line = inputStream.readLine() ;

      }
      inputStream.close() ;           
      outputStream.close() ;    
} 

    catch( FileNotFoundException e ) {
      System.out.println( "Error opening" );   


    } //
     
    catch ( IOException e ) {
           System.out.println( "Error reading" );     

    } //   
  } 

}