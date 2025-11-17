public class StaticBlock {
    // Stsic variables
    static int a=20;
    static int b;
    static int max;

    // Static block
    static {
        System.out.println("\nThis is first static block.");
        b = (int) Math.sqrt(a);
    }
    static {
        System.out.println("This is second static block.");
        max = 100;
    }
    static void display(){
        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);
        System.out.println("The Max is: " + max + "\n");
    }
    // This is main method
    public static void main(String[] args) {
        display();
    }
    
}
