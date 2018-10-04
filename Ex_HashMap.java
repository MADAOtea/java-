import java.io.ObjectOutputStream ;
import java.io.FileOutputStream ;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException; 
import java.io.FileNotFoundException ;
import java.util.* ;


public class Ex_HashMap {
  public static void main( String[] arge ) {
     HashMap map = new HashMap();
     map.put("A", "SCJP");
     map.put(new Integer(100), new Integer(1000));
     map.put(new Object(), "SCBCD");
     map.put(null, null);
     System.out.println(map.toString());
     System.out.println("key = A:" + map.get("A"));
     System.out.println("key = B:" + map.get("B"));
     System.out.println("key = B:" + map.get(100));
 
  } // 




}// 