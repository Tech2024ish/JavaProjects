
public class StringConcatination{
    // This is first string
    static void conc(){
        String first = "Java";
        System.out.println("\nFirst string: " + first);

        // Second string
        String second = "Programming";
        System.out.println("Second string: " + second);

        // Join two strings
        System.out.println("Joined string: " + first.concat(second));
        System.out.println("Second joined string: "+first+second);
    }
    public static void main(String[] args) {
        StringConcatination.conc();
    }
}