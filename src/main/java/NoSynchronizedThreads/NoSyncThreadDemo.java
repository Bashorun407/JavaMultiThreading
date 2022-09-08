package NoSynchronizedThreads;

public class NoSyncThreadDemo extends Thread{

    private Thread t;
    private String threadName;
    private PrintDemo PD;

    //constructor
    public NoSyncThreadDemo(String name, PrintDemo pd){
        this.threadName = name;
        this.PD = pd;
    }

    //implementing the run method of the Thread class
    @Override
    public void run() {
        //calling the print function
        PD.printCount();
        System.out.println(" Thread: " + threadName + " exiting " );
    }

    //declaring a start method for this class
    public void  start(){
        System.out.println(" Thread: " + threadName + " starting...");
        if (t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
