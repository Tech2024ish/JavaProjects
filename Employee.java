import java.util.Scanner;

public class Employee {
    public static class EmployeeOne{
        String name;
        String email;

        // This is a constructor
        EmployeeOne() {
            try (Scanner scan = new Scanner(System.in)) {
                // Prompt user to enter his/her name
                System.out.println("\nEnter your name: ");
                name = scan.nextLine();
                
                // Prompt user to enter email address
                System.out.println("Enter email address: ");
                email = scan.nextLine();
            }
        }
        void  login(){
            System.out.println("\nThank you "+ name+ "! You loged in succeccfull\n");
        }
        void display(){
            System.out.println("Name: "+name+"\nEmail address: "+ email);
        }
        
    }
    public static void main(String[] args) {
        EmployeeOne emp = new EmployeeOne();
        emp.login();

        try (Scanner inp = new Scanner(System.in)) {
            System.out.println("You wnat to see your information: ");
            String info = inp.nextLine();

            // Check condition
            if(info.equals("yes")){
                System.out.println("\nYour informaton:");
                emp.display();
                System.out.println("\n");
            }
        }
        
    }
}
