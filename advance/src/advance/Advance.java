package advance;
import java.util.Scanner;

public class Advance {

    public static void main(String[] args) {
        NewNumber obj = new NewNumber();
        Scanner in = new Scanner(System.in);
        
//        System.out.print("Enter a number: ");
//        double x=in.nextDouble();
//        System.out.print("Enter a number: ");
//        double y=in.nextDouble();
//        
//        obj.addNumber(x,y);
//        NewNumber.classMethod().addNumber(x, y);
        
//        ConstructorEX conObj = new ConstructorEX(10,20);
        
        Static stobj=new Static("sakib",12);
        stobj.count();
        Static stobj1=new Static("rakib",13);
        stobj1.count();
        
        Object objz[]={1,23,"as","asdf",12};
        ArrayClass obja=new ArrayClass();
        obja.myArray(objz);
        
        Object newo[]=obja.recieve();
        for(Object i:newo){
            System.out.println(i);
        }
        
        
    }
    
}
