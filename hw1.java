import java.util.Scanner;
import java.util.InputMismatchException;

public class hw1{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int number = 0 ;
    boolean done = false ;
    while( !done) {
      try {
        System.out.println("Enter a num" ) ;
        number = keyboard.nextInt() ;
        done = true ;

      } // try 

      catch(InputMismatchException e ) {
        keyboard.nextLine() ;
        System.out.println( "error! not a number" ) ;
        System.out.println( "try again!") ;
      } // 


    } 
  }
}