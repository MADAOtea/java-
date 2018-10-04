import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TextFileInputDemo {
  public static void main( String[] args ) {
     try {
       BufferedReader inputStream = new BufferedReader(new FileReader( "morestuff2.txt" )) ;
       String line = inputStream.readLine() ;
       System.out.println( "first line from the file is" ) ;     
       System.out.println( line ) ;
       line = inputStream.readLine() ;
       System.out.println( "second line from the file is" ) ;     
       System.out.println( line ) ;     
       inputStream.close();

     
     }
   
     catch( FileNotFoundException e) {
       System.out.println( "file is not find!" ) ;     
       System.out.println( "or could not open" ) ;       


      } // 


      catch( IOException e) {
               System.out.println( "Error" ) ; 
      }   

  } // 


}