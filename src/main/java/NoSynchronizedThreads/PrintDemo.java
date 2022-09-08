package NoSynchronizedThreads;

public class PrintDemo {

    //this class prints sequence of numbers from a maximum to a minimum
 public void printCount(){
     try{
         for (int i = 5; i > 0; i--) {
             System.out.println(" Counter..." + i);
         }
     }catch (Exception e)
     {
         System.out.println("Thread was interrupted");
     }
 }
}
