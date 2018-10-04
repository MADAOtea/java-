import java.io.ObjectOutputStream ;
import java.io.FileOutputStream ;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException; 
import java.io.FileNotFoundException ;
import java.util.* ;


public class Ex_TreeMap {
  public static void main( String[] arge ) {
     TreeMap map = new TreeMap();
     /*
     map.put("A", "SCJP");
     map.put(new Integer(100), new Integer(1000));
     map.put(new Object(), "SCBCD");
     */


     map.put("A", "SCJP");
     map.put("B", new Integer(1000));
     map.put("C", "SCBCD");
     System.out.println(map.toString());

 
  } // 




}// 