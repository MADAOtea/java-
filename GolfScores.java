import java.io.ObjectOutputStream ;
import java.io.FileOutputStream ;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException; 
import java.io.FileNotFoundException ;
import java.util.ArrayList ;
import java.util.Scanner ;




public class GolfScores  {
  public static void main( String[] arge ) {
    ArrayList<Double> score = new ArrayList<Double>();
    System.out.println( "The program read golf scroes and shows" );

    System.out.println( "how much each diffirence from the average " );

    System.out.println( "Enter golf scores: " );
    fillArrayList(score);
    showDifference(score);

 
  } // main()

  
  public static void fillArrayList( ArrayList<Double> a ) {
        System.out.println( "Enter a lsit of nonnegative nunber " );
        System.out.println( "Mark the end of the list with a negative number  " );
        Scanner key = new Scanner(System.in);
     
        double next ;
        int index = 0 ;
        next = key.nextDouble() ;
    
        while( next >= 0 ){
           a.add(next);
           next = key.nextDouble() ;
        } // while

  
  } //   fillArrayList


  public static double computeAverage(ArrayList<Double> a ) {
    double total = 0 ;
    for ( Double element : a ) 
       total = total + element ;

    int numberOfScores = a.size() ;
    if ( numberOfScores > 0 ) {
     
      return ( total / numberOfScores ) ;

    } // if 

    else {
      System.out.println( "Error : Trying to average 0 numbers " );
      System.out.println( "computeAverage return 0 " );
      return 0 ;
    } // else

  } // computeAverage


  public static void showDifference( ArrayList<Double> a ) {
    double average = computeAverage(a);
    System.out.println( "Average of the  " + a.size() + "scores = " + average  );
      System.out.println( "The score are  :"  );
     
     for ( Double element: a ) {
       System.out.println( element + "differs from average by " + (element - average ) );

     } // for 
  } // showDifference

}// 