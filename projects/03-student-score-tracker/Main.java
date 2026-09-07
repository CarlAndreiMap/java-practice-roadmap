import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxStudents = 0;
        String[] studentNames = new String[maxStudents];
        int[] studentScores = new int[maxStudents];

        while (true) { // How many students check
            try {
                System.out.print("How many students? ");
                maxStudents = scanner.nextInt();
                scanner.nextLine();
                if (maxStudents <= 0) {
                    System.out.println("Please enter a number greater than 0");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.nextLine();
            }
        }
        // Collect student info and scores
        for (int i = 0; i < maxStudents; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();
            if (studentNames[i].isEmpty()) {
                System.out.println("Please enter a name.");
            }
        }


    }   
   
}
