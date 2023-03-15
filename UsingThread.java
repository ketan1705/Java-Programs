public class UsingThread extends Thread{
public void run(){
    System.out.println("Thread is running");
}
    public static void main(String[] args) {
    UsingThread t1 = new UsingThread();
    t1.start();
    }    
}
