// This is how to import Multiset class from myJavaDev
import myJavaDev.Multiset;
public class TestClass{
    public static void main(String[] args) {
        Multiset<String> m = new Multiset<>();

        // Add elements
        m.add("Apple");
        m.add("Banana");
        m.add("Apple");
        m.add("Orange");
        m.add("Apple");

        // Display contents
        m.display();

        // Check size
        System.out.println("Total elements (including duplicates): " + m.size());

        // Count a specific element
        System.out.println("Count of Apple: " + m.count("Apple"));

        // Remove one occurrence
        m.remove("Apple");
        System.out.println("\nAfter removing one Apple:");
        m.display();

        // Delete all occurrences of Banana
        m.deleteAll("Banana");
        System.out.println("\nAfter deleting all Bananas:");
        m.display();

        // Check if element exists
        System.out.println("Contains Orange? " + m.contains("Orange"));
    }
}
