package SynchronizedThreads;

import MultiThreadExtendThread.ThreadDemo;

public class ThreadTest {
    //this class demonstrates how synchronized thread behaves
    public static void main(String[] args) {

        //creating an object of the PrintDemo class
        PrintDemo pd = new PrintDemo();

        //creating objects of the SyncThreadDemo class
        SyncThreadDemo std1 = new SyncThreadDemo(" SyncThread-1", pd);
        SyncThreadDemo std2 = new SyncThreadDemo(" SyncThread-2", pd);

        //starting the two threads
        std1.start();
        std2.start();

        //interrupting the two threads
        try {
            std1.join();
            std2.join();
        } catch (InterruptedException e) {
            System.out.println(" thread interrupted!!");
        }

    }
}
