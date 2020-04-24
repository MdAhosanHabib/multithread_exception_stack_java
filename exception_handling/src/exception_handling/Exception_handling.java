package exception_handling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exception_handling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        File f = new File("test.txt");
        String input="file not here";
        try {
            Scanner sc = new Scanner(f);
            input=sc.nextLine();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found: "+ex);
        }
        System.out.println(input);
        
        
        System.out.println("Enter a number: ");
        int x=s.nextInt();
        if(x>10){
            try {
                throw new MyException("x can't greater than 10");
            } catch (MyException ex) {
                ex.printStackTrace();
            }
        }
        
        A obj = new A();
        try {
            obj.print1();
        } catch (Exception ex) {
            Logger.getLogger(Exception_handling.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.print2();
    }
}

class MyException extends Exception{
    public MyException(String m){
        super(m);
    }
}

class A{
    public void print1() throws Exception{
        
    }
    public void print2() throws RuntimeException{
        
    }
}