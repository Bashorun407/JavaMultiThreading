package MultiThreadImplementRunnable;

public class RunnableDemo implements Runnable{

    //this class creates thread by implementing the Runnable interface
    private Thread t;
    private String threadName;

    //class constructor
    public RunnableDemo(String threadName) {
        this.threadName = threadName;

        System.out.println("Thread: " + threadName + " created");
    }

    //implemting the Runnable class
    @Override
    public void run() {
        System.out.println("Running " + threadName);

        try{
            for(int i = 5; i > 0; i--)
            {
                System.out.println("Thread: " + threadName + ", " + i);
                //letting the thread to sleep for some seconds (micro seconds)
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread: " + threadName + ", interrupted!!");
        }
        //message that the thread is exiting
        System.out.println("Thread: " + threadName + ", is exiting");
    }

    //implementing the start method
    public void start(){
        System.out.println("Starting " + threadName);

        //start thread if it is not currently running
        if (t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
