import java.io.ObjectOutputStream ;
import java.io.FileOutputStream ;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException; 
import java.io.FileNotFoundException ;
import java.util.Scanner;



public class  GenericPairDemo2  {
  public static void main( String[] arge ) {
    Pair<Integer> secret = new Pair<Integer>(40,48);
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter two numbers");
    int n1 = keyboard.nextInt();
    int n2 = keyboard.nextInt();
    Pair<Integer> input = new Pair<Integer>(n1,n2);

    if ( input.equals(secret) ) {
      System.out.println("you guessed the secret numbers");
      
    } // if

    else {
      System.out.println("error");
      System.out.println("you guessed ");
      System.out.println(input); 
      System.out.println("secret are ");
      System.out.println(secret);    

    } // else
 
  } // 




}// 