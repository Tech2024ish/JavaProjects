import java.util.Scanner;

public class AreaOfRectangle {
    // Creating method
    public static int area(int length, int width){
        int area = length * width;
        return area;
    }
    // This is main function where program starts
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Prompt user to enter data from the keyboard
            System.out.println("\nEnter the lenght of rectangle: ");
            int length = input.nextInt();
            System.out.println("Enter the wudth of rectangle: ");
            int width = input.nextInt();

            // Displaying the data in the screen
            System.out.println("The area of rectangle is: "+AreaOfRectangle.area(length, width));
        }

    }
    
}
