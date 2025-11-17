public class ConstructorOverload {
    String language;

    public ConstructorOverload() {
        language = "Java";
    }

    public ConstructorOverload(String language) {
        this.language = language;
    }
    public void getName(){
        System.out.println("Programming languagae: "+ this.language);
    }
    public static void main(String[] args) {
        // calling first constructor
        ConstructorOverload obj1 = new ConstructorOverload();
        // calling second contructor
        ConstructorOverload obj2 = new ConstructorOverload("Python\n");
        System.out.println("\n");
        obj1.getName();
        obj2.getName();
    }
    
}
