package MultiThreadExtendThread;

//this class displays how threads operate
public class DisplayMultiThread {

    public static void main(String[] args) {

        //creating thread objects
        ThreadDemo t1 = new ThreadDemo("TDemo-1");
        t1.start();

        ThreadDemo t2 = new ThreadDemo("TDemo-2");
        t2.start();
    }

}
