import java.io.ObjectOutputStream ;
import java.io.FileOutputStream ;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException; 
import java.io.FileNotFoundException ;
import java.util.* ;


public class Ex_HashSet {
  public static void main( String[] arge ) {
     HashSet hs = new HashSet();
     hs.add("SCJP");
     hs.add("SCWCD");
     hs.add("SCBCD");
     hs.add("SCMCD");
     hs.add("SCMCD");
     Iterator it = hs.iterator();
     while( it.hasNext() ) {
       String data = (String)it.next();
       System.out.println(data+", " );



     } // while
     System.out.println();

 
  } // 




}// 