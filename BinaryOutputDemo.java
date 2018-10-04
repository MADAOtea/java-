import java.io.ObjectOutputStream ;
import java.io.FileOutputStream ;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException; 
import java.io.FileNotFoundException ;

public class BinaryOutputDemo {
  public static void main( String[] arge ) {
     try {
       ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream( "numbers.dat" ));

       int i = 0 ;
       for ( i = 0 ; i < 5 ; i++ ) 
          out.writeInt(i);

       System.out.println( "Numbers written to the file" );
       out.close() ;
     }// try

     catch( IOException e ) {
       System.out.println( "Problem with file output" );     
     } // catch   


 
  } // 




}// BinaryOutputDemo