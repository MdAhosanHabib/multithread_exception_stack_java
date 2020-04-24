package stack;

import java.util.NoSuchElementException;

public class Stack_test {
    private int[] ar;
    private int top, size, capacity;
    
    public Stack_test(int capacity) throws Exception{
        if(capacity < 1){
            throw new Exception ("Size of the stack can't be smaller than 1");
        }
        this.capacity = capacity;
        ar = new int [capacity];
        size= 0;
        top = -1;
    }
    
    public boolean isFull(){
        if(size==capacity){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isEmpty(){
        if(size==0){
            return true;
        }else{
            return false;
        }
    }
    
    public void display(){
        if(isEmpty()){
            throw new NoSuchElementException("stack is empty");
        }else{
            System.out.print("Stack:\t");
            for(int i=0;i<=top;i++){
                System.out.print(ar[i]+"\t");
            }
            System.out.println();
        }
    }
    
    public void push(int value){
        if(isFull()){
            throw new ArrayIndexOutOfBoundsException("Stack Overfollow!");
        }
        size++;
        top++;
        ar[top]=value;
    }
    
    public void pop() throws MystackException{
        if(isEmpty()){
            throw new MystackException();
        }
        top--;
        size--;
    }
    
    public int size(){
        return size;
    }
    
    public int peek(){
        return ar[top];
    }
}
