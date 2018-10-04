import java.io.ObjectOutputStream ;
import java.io.FileOutputStream ;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException; 
import java.io.FileNotFoundException ;
import java.io.PrintStream ;


public class RedirectionDemo {
  public static void main( String[] arge ) {
    PrintStream errStream = null;
    try {

      errStream = new PrintStream( new FileOutputStream( "errmessages.txt" )) ;


    } // try

    catch ( FileNotFoundException e ) {
      System.out.println( "error opening file" ) ;
      System.exit(0);
  
    } //    


    System.setErr(errStream ) ;

    System.err.println("Hello From System.err" ) ;
    System.out.println("Hello From System..out" ) ;
    System.err.println("Hello again from System.err" ) ; 
  } // 




}// ArrayIODemp