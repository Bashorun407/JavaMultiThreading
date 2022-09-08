package NoSynchronizedThreads;

public class ThreadTest {
    //This class demonstrates how unsynchronized threads behave
    //creating an object of PrintDemo
    public static void main(String[] args) {

        PrintDemo pd = new PrintDemo();

        //creating objects of ThreadDemo class
        NoSyncThreadDemo t1 = new NoSyncThreadDemo(" Thread-1 ", pd);
        NoSyncThreadDemo t2 = new NoSyncThreadDemo(" Thread-2", pd);

        //starting each thread
        t1.start();
        t2.start();

        //interrupting the operations of each thread
        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(" Interrupted!!! ");
        }
    }
}
