
public class StringCompare{
    static void StringComp(){
        
        // Creating Strings by using String() constructor
        String first = new String("Java Programming");
        String second = new String("Python Programming");
        String third = new String("Java Programming");

        // Compare first and second strings without considering the cases
        System.out.println("\nAre the first and second strings the same? "+ first.equalsIgnoreCase(second));
        
        // Compare first and third strings
        System.out.println("Are the first and third strings the same? "+ first.equals(third));
        System.out.println("\n");
    }
    public static void main(String[] args) {
        StringComp();
    }
}