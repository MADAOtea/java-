class MyThread extends Thread {
 public void run(){
   try {
     sleep(2000);
   } catch(InterruptedException e){

   }

   System.out.println("I'm t1");
 }
}


public class Sleep1{
  public static void main(String args[]){
    Thread t1 = new MyThread();
    t1.start();
    Thread.yield();
    System.out.println("I'm main thread");
  }
}