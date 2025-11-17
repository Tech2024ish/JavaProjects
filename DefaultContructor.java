public class DefaultContructor {
    String name;
    int age;
    boolean isOk;
    public static void main(String[] args) {
        DefaultContructor default1 = new DefaultContructor();
        System.out.println("\nThe following are default values set by default contructor: ");
        System.out.println("Name: "+default1.name  +"\nAge: "+ default1.age + "\nDecision: "+ default1.isOk +"\n");
    }
}
