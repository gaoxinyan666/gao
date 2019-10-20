public class Example02{
  public static void main(String[] args){
    MyThread myThread=new MyThread();
    myThread.start();
    
       System.out.println("MyThread");
   
  }
}
class Mythread extends Thread{
    public void run(){
      
        System.out.println("MyThreadºÃ≥–Thread¿‡");
    
    }
}