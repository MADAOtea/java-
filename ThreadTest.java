public class ThreadTest {
  
  public static void main( String[] args ){
    System.out.println( "Hello");
    String tName = Thread.currentThread().getName();
    System.out.println( "����ǦW�١G" + tName + "," +Thread.activeCount());
// Thread thr = Thread.currentThread() ;
    Thread.currentThread().setName("DEMO");
    System.out.println( "����ǦW�١G" + Thread.currentThread().getName() + "," +Thread.activeCount());        
    //Thread.activeCount();
  } // 





} // 