import java.util.Scanner;

public class StaticInJava {

    static int num;
    String name;
    String email;
    long phone;
    int salary;

    void getValues(Scanner scan){
        System.out.println("Enter personal name: ");
        name = scan.nextLine();
        System.out.println("Enter email address: ");
        email = scan.nextLine();
        System.out.println("Enter phone number: ");
        phone = scan.nextLong();
        System.out.println("Enter Salary: ");
        salary = scan.nextInt();
        scan.nextLine();
    }

    void display(){
        System.out.println("Name: "+ name );
        System.out.println("Email: "+ email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("\nEnter number of people: ");
            num = input.nextInt();
            input.nextLine();
            
            // Create the instance of class
            StaticInJava[] obj = new StaticInJava[num];

            // Prompt user to enter each person's data
            for(int i=0; i<num; i++){
                System.out.println("\nEnter details for person "+ + (i + 1)+ ": ");
                obj[i] = new StaticInJava();
                obj[i].getValues(input);
            }

            // Displating each person's details
            System.out.println("**************************************************");
            for(int i=0; i<num; i++){
                System.out.println("\nDetails for person " + (i + 1)+ ": ");
                obj[i].display();
            }
        }
    }
}