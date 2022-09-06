package MultiThreadImplementRunnable;

public class DisplayMultiThread {
    //this class displays how multi threads operates
    public static void main(String[] args) {
        RunnableDemo RunDem1 = new RunnableDemo("Thread-1");
        RunDem1.start();

        RunnableDemo RunDem2 = new RunnableDemo("Thread2");
        RunDem2.start();
    }
}
