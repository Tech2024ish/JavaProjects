import java.util.Scanner;
public class CodeReusability {

    private static int square(int number){
        return number * number;
    }
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("\nEnter the number: ");
            int num = scan.nextInt();
            for (int i=1;i<=num; i++){
                int result = CodeReusability.square(i);
                System.out.println("The square of "+ i +" is: "+result);
            }
            System.out.println("\n");
        }
    }

}
