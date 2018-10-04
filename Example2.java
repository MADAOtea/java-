

public class Example2 {
  public static void main(String[] args){
    Thread t1 = new MyThread(1);
    Thread t2 = new MyThread(2);
    Thread t3 = new MyThread(3);
    Thread t4 = new MyThread(4);
    Thread t5 = new MyThread(5);



   t1.start();

   t2.start();

   t3.start();

   t4.start();

   t5.start();



  }//




} //  