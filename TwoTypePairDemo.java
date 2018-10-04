import java.io.ObjectOutputStream ;
import java.io.FileOutputStream ;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException; 
import java.io.FileNotFoundException ;
import java.util.Scanner;

public class TwoTypePairDemo {
  public static void main( String[] arge ) {
      TwoTypePair<String, Integer> rating = new TwoTypePair("The car", 8 );
      Scanner key = new Scanner(System.in);
      System.out.println("Our current rating dor" + rating.getFirst());
      System.out.println("is " + rating.getSecond()); 
      System.out.println("How would you rare them");

      int score = key.nextInt();
      rating.SetSecond(score);
 
      System.out.println("Our current rating dor" + rating.getFirst());
      System.out.println("is " + rating.getSecond()); 


  } // 




}// 