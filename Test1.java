public class Test1 {
  public static void main( String[] args) {
    Thread a = new Thread( new ThreadA() ) ;
    Thread b = new Thread( new ThreadB() ) ;

    a.start();
    b.start();
    System.out.println("main");
  }//





} // 