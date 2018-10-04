

class Cookies {

  private static volatile boolean empty = true ;
  private int cookiesNo;
  public synchronized void put( int cNo) {
    while( !empty) {
      try {
        wait();
      } // 
   
      catch(InterruptedException e ) {}


      System.out.println( "主人放了第" + cNo + "塊餅乾" ) ;

      empty = false ;
      notify() ;
    } // while

 
  } // 



  public synchronized void eat( int cNo ) {
    while(empty) {
      try {
        wait() ;
      } // 

      catch( InterruptedException e ) {} 


 
  
    } // whilw



      System.out.println( "狗狗吃了了第" + cNo + "塊餅乾" ) ;

      empty = false ;
      notify() ;
  } // 




} // 




class Eat implements Runnable {
  Cookies cookies ;
  Eat( Cookies cookies ) {
     this.cookies = cookies ;
     

  } // 

  public void run() {
    for( int i = 1 ; i <=10 ; i++ ) {
      cookies.eat(i);

    } //for


  } //

} //


class Put implements Runnable {
  Cookies cookies ;
  Put( Cookies cookies ) {
     this.cookies = cookies ;
     

  } // 

  public void run() {
    for( int i = 1 ; i <=10 ; i++ ) {
      cookies.put(i);

    } //for


  } //

} //


public class Dog_and_Cookies {
  public static void main( String[] args ) {
    Cookies cookies = new Cookies();
    Put put = new Put(cookies);
    Eat eat = new Eat(cookies);
    Thread dog = new Thread(eat);
    Thread master = new Thread(put);
    dog.start();
    master.start();



  } // 



} // 
 