package SynchronizedThreads;

public class SyncThreadDemo extends Thread {

    //this class is a synchronised class
    private Thread t;
    private String threadName;
    private PrintDemo PD;

    //Class constructor
    public SyncThreadDemo (String name, PrintDemo pd){
        this.threadName = name;
        this.PD = pd;
    }

    //implementing the run() method of the Thread class

    @Override
    public void run() {

        //Introducing the synchronized method to SYNCRONIZE THE PRINT OPERATION
        synchronized (PD){
            PD.printCount();
        }
        System.out.println("thread: " + threadName + " exiting...");
    }

    //declaring a start method where all operations begin
    public  void start(){
        System.out.println(" thread: " + threadName + " starting...");
        //checking that the t variable is not assigned to any value yet
        if (t == null){
            t = new Thread(this, threadName);
            //t calls start() method which implicitly calls run() method of the Thread class
            t.start();
        }
    }
}
