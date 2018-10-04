import java.io.ObjectOutputStream ;
import java.io.FileOutputStream ;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException; 
import java.io.FileNotFoundException ;
import java.util.* ;


public class Ex_TreeSet {
  public static void main( String[] arge ) {
     TreeSet ts = new TreeSet();
     ts.add("SCJP");
     ts.add("SCWCD");
     ts.add("SCBCD");
     ts.add("SCMCD");
     ts.add("SCMCD");

     Iterator it = ts.iterator();
     while( it.hasNext() ) {
       String data = (String)it.next();
       System.out.println(data+", " );



     } // while
     System.out.println();

 
  } // 




}// 