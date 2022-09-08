package PracticeThreads;

//this program prints the content of a message by implementing run () method of Runnable interface
public class MessageDisplay implements Runnable{

    private String message;

    //class constructor

    public MessageDisplay(String message) {
        this.message = message;
    }

    //To output content of message using the run class
    @Override
    public void run() {
        while (true){
            System.out.println(message);
        }
    }
}
