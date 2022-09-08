package SynchronizedThreads;

public class PrintDemo {
    //this function prints a count-down from a specified maximum to a specified minimum
    public void printCount(){
        try{
            for (int i = 5; i > 0; i--){
                System.out.println(" Count.... " + i);
            }
        } catch (Exception e) {
            System.out.println(" Thread was interrupted. ");
        }
    }
}
