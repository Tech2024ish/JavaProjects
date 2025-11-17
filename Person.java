import java.util.Scanner;

public class Person {
public static class Student{
    String name;
    long phone;
    Student(){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("\nEnter the name: ");
            name = scan.nextLine();
            System.out.println("Enter phone: ");
            phone = scan.nextLong();
        }
    }    
    void getName(){
        System.out.println("Your nSme is: "+name);
    }
    void getPhone(){
        System.out.println("Your phone number is: "+phone);
    }
}
 public static void main(String[] args) {
    Student st = new Student();
    st.getName();
    st.getPhone(); 
 }
}
