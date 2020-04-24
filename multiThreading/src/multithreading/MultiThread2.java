package multithreading;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiThread2 extends Ab implements Runnable{
    @Override
    public void run(){
        System.out.println("Inside the sub thread: "+Thread.currentThread().getName());
        for(int i=0;i<10;i++){
            System.out.println("3");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(MultiThread2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

class Ab{
//    Thread t = new Thread(new Runnable(){
//        @Override
//        public void run(){
//            System.out.println("ahosan");
//        }
//    }); //for annonimous class
}