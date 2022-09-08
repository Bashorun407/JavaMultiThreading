package PracticeThreads;

//this class attempts to guess a number by running the run method of the Thread class
public class GuessANumber extends Thread {

    private int number;

    //class constructor
    public GuessANumber(int number) {
        this.number = number;
    }

    //implementing the run() method of the Thread class

    @Override
    public void run() {
        int count = 0; //counts number of attempts to guess a number
        int guess = 0; //variable containing each guess

        //using the try/catch statement to check exceptions
        do {
            guess = (int)(Math.random() + 1);
            System.out.println(this.getName() + " guess: " + guess);
            count++;
        } while (guess != number);

        System.out.println("**Correct!! " + this.getName() + " guessed: " + guess + " in " + count + " counts.");
    }
}
