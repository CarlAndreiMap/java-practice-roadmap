import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum = 0;
        int endNum = 0;
        // Input & Validation
        while (true) {
            try {
                System.out.print("Enter starting number: ");
                startNum = scanner.nextInt();
                System.out.print("Enter ending number: ");
                endNum = scanner.nextInt();

                if (startNum > endNum) { 
                    System.out.println("Error: start number must be less than or equal to end number. Try again.");
                    continue;
                }
                break;
            } catch (InputMismatchException E) {
                System.out.println("Please enter a whole number.");
                scanner.next();
            }
        }
        
        System.out.println("\nAnalyzing numbers from " + startNum + " to " + endNum + "...\n");
        

    }
}
