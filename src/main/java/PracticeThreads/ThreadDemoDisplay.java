package PracticeThreads;

//this class demonstrates how threads operates
public class ThreadDemoDisplay {

    public static void main(String[] args) {

        //starting the first thread by assigning a MessageDisplay object to a Runnable variable type
        Runnable hello = new MessageDisplay("Hello....How are you today?");
        Thread thread1 = new Thread(hello);
        thread1.setName("Hello");
        thread1.setDaemon(true);
        System.out.println("Thread1 starting...");
        thread1.start();

        //starting a second thread similar to the first thread and interrupting its operation
        Runnable bye = new MessageDisplay("GoodBye...we will see at another day");
        Thread thread2 = new Thread(bye);
        thread2.setName("Goodbye");
        thread2.setDaemon(true);
        thread2.setPriority(2);
        System.out.println("Thread2 starting...");
        thread2.start();

        //starting a third thread created by a class that extends the Thread class
        Thread thread3 = new GuessANumber(60);
        thread3.setName("Thread3");
        System.out.println("thread3 starting...");
        thread3.start();
        try{
            thread3.join(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread3 interrupted!!!");
        }

        //starting a fourth thread created from a class that extends the Thread class
        Thread thread4 = new GuessANumber(500);
        thread4.setName("Thread4");
        System.out.println("Thread4 starting...");
        thread4.start();
    }
}
