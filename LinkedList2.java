public class LinkedList2  {
   private class Node1 {
   
   private String item ;
   private Node1 link ;

   public Node1(){
      link = null ;
      item = null ;

   } // 


   public Node1( String nItem, Node1 linkValue ){
      item = nItem ;
      link = linkValue ;

   } // 

private class LinkedList1 {
  private Node1 head ;
  
  public LinkedList1() {

    head = null ;
  } // 


  public void  addToStart( String itemName, int itemCount ) {

    head = new Node1( itemName, itemCount, head ) ;

  } // 

  public boolean deleteHeadNode() {
    if ( head != null ) {
      head = head.link();
      return true ;

    } // if

    else 
      return false ;
  } // 

  public int size() {
    int count = 0 ;
    Node1 position = head ;

    while ( position != null ) {
      count++;
      position = position.link();

    } // while

    return count ;
  } // 


  public boolean contains( String item ) {
    return(find(item) != null ) ;


  } // 

  
  private Node1 find( String target ) {
    Node1 position = head ;
    String itemAtPosition;

    while ( position != null ) {
      itemAtPosition = position.getItem();
      if ( itemAtPosition.equals(target) ) 
         return position ;
      position = position.link();


    } // while


     return null ;



  } //


  public void outputLink() {
    Node1 position = head ;
    while( position != null ) {
      System.out.println( position.item() + " " + position.getCount() );

      position = position..ink();

   } // while


  } //  

   

  public boolean isEmpty() {
    return ( head == null ) ;

  }//

  public void clear() {
    head = null;

  } // 
}




} // 