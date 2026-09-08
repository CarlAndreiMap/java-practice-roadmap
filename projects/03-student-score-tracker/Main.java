import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxStudents = 0;
    
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
        String[] studentNames = new String[maxStudents];
        int[] studentScores = new int[maxStudents];

        // Collect student info and scores
        for (int i = 0; i < maxStudents; i++) {
            while (true) {
                System.out.print("Enter name for student " + (i + 1) + ": ");
                studentNames[i] = scanner.nextLine();
                if (studentNames[i].isEmpty()) {
                    System.out.println("Please enter a name.");
                    continue;
                }
                break;
            }
            while (true) {
                System.out.printf("Enter score for %s: ", studentNames[i]);
                studentScores[i] = scanner.nextInt();
                scanner.nextLine();
                if (studentScores[i] < 0 || studentScores[i] > 100) {
                    System.out.println("Error: score must be between 0 and 100. Try again.");
                    continue;
                }
                break;
            }

        }
        // Find the highest, lowest, and average score of students
        double studentScoresTotal = 0;
        int highestScore = -1;
        int lowestScore = 101;
        String highestScoreStudent = "";
        String lowestScoreStudent = "";
        for (int i = 0; i < studentScores.length; i++) {
        
            if (studentScores[i] >= highestScore) {
                highestScore = studentScores[i];
                highestScoreStudent = studentNames[i];
            }
            
            if (studentScores[i] <= lowestScore) {
                lowestScore = studentScores[i];
                lowestScoreStudent = studentNames[i];
            }
            studentScoresTotal += studentScores[i];

        }
        int totalPassed = 0;
        int totalFailed = 0;
        for (int i = 0; i < studentNames.length; i++) {
            boolean studentPassed = studentPassed(studentScores[i]);
            if (studentPassed) {
                totalPassed++;
            } else {
                totalFailed++;
            }
        }

        double averageStudentScores = studentScoresTotal / studentScores.length;
        // Final report menu
        System.out.println("--- Report Card ---");
        System.out.printf("%-10s %5s%n", "Name", "Score");
        System.out.println("--------------------");
        for (int i = 0; i < studentNames.length; i++) {
            System.out.printf("%-10s %1d%n", studentNames[i], studentScores[i]);
        }
        System.out.println("\nSummary:");
        System.out.printf("%-15s %1.2f%n", "Average score:", averageStudentScores);
        System.out.printf("%-15s %1d (%1s)%n", "Highest score:", highestScore, highestScoreStudent);
        System.out.printf("%-15s %1d (%1s)%n", "Lowest score:", lowestScore, lowestScoreStudent);
        System.out.printf("Passed: %1d%n", totalPassed);
        System.out.printf("Failed: %1d", totalFailed);
    }   
    
   public static Boolean studentPassed(int number) {
        if (number >= 75) {
            return true;
        } else {
            return false;
        }
   }
}
