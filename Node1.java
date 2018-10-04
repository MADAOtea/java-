public class Node1 {
   
   private String item ;
   private int count ;
   private Node1 link ;

   public Node1(){
      link = null ;
      item = null ;
      count = 0 ;

   } // 


   public Node1( String nItem, int nCount, Node1 linkValue ){
      setData(nItem, nCount);
      link = linkValue ;

   } // 


   public void setData( String nItem, int nCount ) {
      item = nItem ;
      count = nCount ;

   } // 

   public void setLink( Node1 newValue ) {
     link = newValue ;


   } // 


   public String getItem() {
      return item ;

   } // 


   public int getCount() {
      return count ;

   } // 

   public Node1 getLink() {
       return link ;

   } // 


} // 