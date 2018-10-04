public class MyThread extends Thread {
  private String x ;
  
  public MyThread( int x ) {

     this.x = String.valueOf(x);
  } //   




  public void run() {
    System.out.println("Hello I'm " + x);

  } // 



} //