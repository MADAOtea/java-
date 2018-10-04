import java.util.Scanner ;
import java.util.InputMismatchException ;


public class DivisionDemoFirst{
  public static void main(String[] args){
    try {
      Scanner keyboard = new Scanner(System.in);
    
      System.out.println("numerator:" );
      int numerator = keyboard.nextInt();
      System.out.println("deno:" );
      int deno = keyboard.nextInt();


      if ( deno == 0 ) {
        throw new DivisionByZeroException();
      } // if    

      double quotient = numerator / (double)deno ;
      System.out.println(numerator + "/" + deno + "=" + quotient ) ;
        
    }

      catch ( DivisionByZeroException e ) {
        System.out.println(e.getMessage() );
        Secondchance();           
 
      } // catch

     
  }


  public static void Secondchance() {
    
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Try again" );
    System.out.println("numerator:" );
    int numerator = keyboard.nextInt();
    System.out.println("deno:" );
    int deno = keyboard.nextInt();

    if ( deno == 0 ) {
      System.out.println("I can't do division by zero" ) ;
      System.out.println("Aborting program");
      System.exit(0);      
    } // if    
 
    double quotient = numerator / deno ;
    System.out.println(numerator + "/" + deno + "=" + quotient ) ;
            
  } // 
}