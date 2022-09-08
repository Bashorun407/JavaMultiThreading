package MoreThreads;

public class DisplayMessage implements Runnable {

    private String message;

    //constructor

    public DisplayMessage(String message) {
        this.message = message;
    }

    //run method

    @Override
    public void run() {
        while (true){
            System.out.println(message);
        }
    }
}
