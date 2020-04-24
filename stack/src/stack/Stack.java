package stack;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Stack {

    public static void main(String[] args) {
        try {
            Stack_test obj = new Stack_test(3);
            
            obj.push(11);
            obj.push(12);
            obj.push(13);
            obj.display();
            System.out.println("Top: "+obj.peek());
            
            obj.pop();
            obj.display();
        }catch(MystackException e){
            System.out.println("Stack is Empty!");
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
