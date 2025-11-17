import java.util.*;; 
public class IntegerDataType {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("\nEnter your name: ");
            String name = scan.nextLine();
            System.out.println("Enter your phone number: ");
            int phone = scan.nextInt();

            // Displaying the personal data on screen
            System.out.println("\nYour details: \n");
            System.out.println("Name: "+name+"\nPhone number: "+phone);
        }

    }
    
}
