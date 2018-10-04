import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.Scanner;

public class HasNexIntDemo2 {
  public static void main( String arge[] ) {
    Scanner inputStream = null ;
  
    

    try {
      inputStream = new Scanner( new FileInputStream( "data.txt")) ;
    
          
    } 

    catch( FileNotFoundException e ) {
      System.out.println( "File data was not found" );
      System.out.println( "or could not be open" ); 
      System.exit(0);   

    } //
     
    int next, sum = 0 ;
    
    while( inputStream.hasNext() ) {
      if ( inputStream.hasNextInt() ) {


         next = inputStream.nextInt() ;
         sum = sum + next ;
      } // if
      
      else {
        inputStream.next() ;
      } // else
   

    } 
        
    inputStream.close() ;
      System.out.println( "The sum is " + sum  );     
  } 

}