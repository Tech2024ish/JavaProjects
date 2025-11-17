public class Demo {
    void display(Demo demo){
        System.out.println("\nMethod is called with object: " + demo + "\n");
    }
    void show(){
        display(this);
    }
    @Override
    public String toString(){
        return "This is a Demo object";
    }
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
    
}
