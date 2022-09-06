package MultiThreadExtendThread;

//this class creates a thread by extending the Thread class
public class ThreadDemo extends Thread{
    //class variables
    private Thread t;
    private String threadName;

    //class constructor
    public ThreadDemo(String name) {
        threadName = name;
        System.out.println("Thread: " + threadName + ", created.");
    }

    //overriding the run() method of the thread class
    @Override
    public void run() {
        System.out.println("Thread: " + threadName + " Running...");

        //using the try/catch statements to introduce the business logic of the thread
        try{
            //using the for loop to create a process in the run method
            for (int i = 10; i > 0; i--){
                System.out.println(threadName + ", " + i);
                //interrupting the thread with the sleep method
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread: " + threadName + " interrupted!!");
        }

        //message to signal that thread has finished executing
        System.out.println("Thread: " + threadName + " exiting...");
    }

    //introducing the start method where a call to run() is done implicitly by the start method
    public void start(){
        System.out.println("Starting " + threadName);

        if (t == null){
            t = new Thread(this, "Starting ");
            t.start();
        }
    }
}
