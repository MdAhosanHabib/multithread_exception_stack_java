package advance;

public class Static {
    String name;
    int run;
    static String country="BD";
    
    public Static(String name, int run){
        this.name=name;
        this.run=run;
    }
    
    public void count(){
        System.out.println(name+" "+run+" "+country);
    }
}
