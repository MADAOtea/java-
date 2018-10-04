import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileInputStream ;
import java.io.IOException;
import java.util.Scanner;

public class TextFileScannerDemo {
  public static void main( String[] args ) {
        System.out.println( "I read three line" ) ;
       System.out.println( "of text from file morestuff.txt" ) ;
       Scanner input1 = null ;

     try {
        input1 = new Scanner( new FileInputStream( "morestuff.txt")) ;
     
     }
   
     catch( FileNotFoundException e) {
       System.out.println( "file is not find!" ) ;     
       System.out.println( "or could not open" ) ;       
       System.exit(0) ;


      } // 


      int i1 = input1.nextInt();
      int i2 = input1.nextInt();
      int i3 = input1.nextInt();
      input1.nextLine();
      String s1 = input1.nextLine();
       System.out.println( "The three numbers read from the file are" ) ;
       System.out.println( i1 + "," + i2 + "," + i3 + "," ) ;
       System.out.println( "The line read from the file is " ) ;
       System.out.println( s1) ;
       input1.close();              


  } // 


}