import java.io.ObjectOutputStream ;
import java.io.FileOutputStream ;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException; 
import java.io.FileNotFoundException ;
import java.util.* ;


public class Ex_Queue {
  public static void main( String[] arge ) {
    Queue q = new LinkedList();
    q.offer("First");
    q.offer("Second");
    q.offer("Third");
    Object o;
    System.out.println( q.toString());
    while((o = q.poll()) != null ) {
      String s = (String)o;
      System.out.println( s);
    } // while
    System.out.println(q.toString() );
  } // 




}// 