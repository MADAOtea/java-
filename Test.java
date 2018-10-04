public class Test {
  public static void main( String[] args) {
    Thread a = new Thread( new RunnableA() ) ;
    Thread b = new Thread( new RunnableB() ) ;

    a.start();
    b.start();
    System.out.println("main");
  }//





} // 