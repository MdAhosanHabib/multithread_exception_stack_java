package multithreading;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiThreading {

    public static void main(String[] args){
        
        A obj = new A();
        obj.setDaemon(true); //if main thread end, sub thread not workig
        obj.start();
        
        try {
            obj.join();  //this thread end first
        } catch (InterruptedException ex) {
            Logger.getLogger(MultiThreading.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        MultiThread2 thrd1=new MultiThread2();
        Thread td=new Thread(thrd1,"myThread");
        td.start();
        System.out.println("Inside the main thread: "+Thread.currentThread().getName());
        
        for(int i=0;i<10;i++){
            System.out.println("1");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {                 
                Logger.getLogger(MultiThreading.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

class A extends Thread{
    
    @Override
    public void run(){
        System.out.println("Inside the sub thread: "+Thread.currentThread().getName());
        for(int i=0;i<10;i++){
            System.out.println("2");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(MultiThreading.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}