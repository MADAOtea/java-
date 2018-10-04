public class ThreadTest {
  
  public static void main( String[] args ){
    System.out.println( "Hello");
    String tName = Thread.currentThread().getName();
    System.out.println( "執行序名稱：" + tName + "," +Thread.activeCount());
// Thread thr = Thread.currentThread() ;
    Thread.currentThread().setName("DEMO");
    System.out.println( "執行序名稱：" + Thread.currentThread().getName() + "," +Thread.activeCount());        
    //Thread.activeCount();
  } // 





} // 