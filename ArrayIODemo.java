import java.io.ObjectOutputStream ;
import java.io.FileOutputStream ;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException; 
import java.io.FileNotFoundException ;

public class ArrayIODemo {
  public static void main( String[] arge ) {
    SomeClass[] a = new SomeClass[2];
    a[0]  = new SomeClass( 1, 'A' ) ;
    a[1]  = new SomeClass( 2, 'B' ) ;
    
    try {
      ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream( "arrayfile" ));
      outputStream.writeObject(a);
      outputStream.close() ;

    } // 

    catch( IOException e ) {
      System.out.println( "Error write" ) ;
      System.exit(0);
    } //    

    System.out.println( "Array write ito file " ) ;
    System.out.println( "Now let's reopen the file " ) ;
    SomeClass[] b = null ;
   
    try {
      ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream( "arrayfile" ));
      b = ( SomeClass[])inputStream.readObject();
      inputStream.close() ;

    } // 

 


    catch( FileNotFoundException e ) {
      System.out.println( "Cannot ffind file" ) ;     
      System.exit(0); 
    } //    

    catch( ClassNotFoundException e ) {
      System.out.println( "Problem whit file input" ) ; 
      System.exit(0);     
    } // 

    catch( IOException e ) {
      System.out.println( "Problem with file input" ) ;
      System.exit(0);
  

    } //       
     System.out.println( "The following array element were read" ) ;
     int i ;
     for ( i = 0 ; i < b.length ; i++ ) {
       System.out.println( b[i] ) ;

     } // for  


     System.out.println( "End" ) ;
      
  } // 




}// ArrayIODemp