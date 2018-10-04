import java.io.ObjectOutputStream ;
import java.io.FileOutputStream ;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException; 
import java.io.FileNotFoundException ;

public class BinaryInputDemo {
  public static void main( String[] arge ) {
     try {
       ObjectInputStream in = new ObjectInputStream( new FileInputStream( "numbers.dat" ));
       
       int n1 = in.readInt() ; 
       int n2 = in.readInt() ;       

       System.out.println( "Numbers read" );
       System.out.println( n1 );
       System.out.println( n2 );
       in.close() ;
     }// try

     catch( FileNotFoundException e ) {
       System.out.println( "Cannot find file numbers.dat" );
     }//

     catch( IOException e ) {
       System.out.println( "Problem with file input" );     
     } // catch   


 
  } // 




}// BinarynputDemo