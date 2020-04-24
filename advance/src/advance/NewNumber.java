package advance;

public class NewNumber {
    
    public void addNumber(double a, double b){
        double r = a+b;
        System.out.println("Result is: "+r);
    }
    
    public static NewNumber classMethod(){
        NewNumber obj = new NewNumber();
        return obj;
    }
}
