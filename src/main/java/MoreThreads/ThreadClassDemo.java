package MoreThreads;

public class ThreadClassDemo {
    public static void main(String[] args) {

        Runnable hello = new DisplayMessage("Hello");
        Thread thread1 = new Thread(hello);
        thread1.setDaemon(true);
        thread1.setName("Hello");
        System.out.println(" Hello Starting ");
        thread1.start();

        Runnable bye = new DisplayMessage("Goodbye");
        Thread thread2 = new Thread(bye);
        thread2.setDaemon(true);
        thread2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(" Starting Goodbye  ");
        thread2.start();

        System.out.println(" starting Thread3");
        Thread thread3 = new GuessNumber(72);
        thread3.start();
        try{
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!! ");
        }

        System.out.println("Starting Thread4");
        Thread thread4 = new GuessNumber(120);
        thread4.start();
        System.out.println(" main() is ending...");

    }
}
