public class LinkedLsitDemo {
  public static void main( String[] args ) {
    LinkedList1 list = new LinkedList1() ;
    list.addToStart("apple", 1 ) ;
    list.addToStart("bananas", 2 ) ;   
    list.addToStart("cat", 3 ) ;  

    System.out.println( "List has " + list.size() +" nodes " ) ;
    list.outputLink() ;

    if ( list.contains( "cat")) {

      System.out.println( "cat is in list " ) ;

    } // if

    else {


      System.out.println( "cat is not in list  " ) ;
    } // else

    list.deleteHeadNode();

    
    if ( list.contains( "cat")) {

      System.out.println( "cat is in list " ) ;

    } // if

    else {


      System.out.println( "cat is not in list  " ) ;
    } // else

    while( list.deleteHeadNode()) 
       ;

    System.out.println( "Start of list" ) ;
    list.outputLink();

    System.out.println( "Endt of list" ) ;    
 

  } // 






} //