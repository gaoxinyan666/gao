public class Example05{
   public static void main(String[] args){
      Taxi t=new Taxi();
      new Thread(t,"出租车1").start();
      new Thread(t,"出租车2").start();
      new Thread(t,"出租车3").start();
      new Thread(t,"出租车4").start();
      new Thread(t,"出租车5").start();
   }
}
class Taxi implements Runnable{
   private int passengers=100;
   public void run(){
      while (true) {
         if (passengers>0){
            Thread th=Thread.currentThread();
            String th_name=th.getName();
            System.out.println(th_name+"第"+passengers--+"客人上车");    
         }
      }
   }
} 