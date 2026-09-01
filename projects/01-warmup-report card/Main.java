import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // subject input validation
        int subjectCount = getValidatedInt(scanner, "Enter the number of subjects: ", 1, Integer.MAX_VALUE);

        double total = 0;
        int highestScore = -1;
        String highestSubject = "";
        int lowestScore = 101;
        String lowestSubject = "";
        String subjectName = "";
        String report = "";
        String grade = "";

        for (int i = 0; i < subjectCount; i++) {    

            while (true) {
                try {
                    System.out.print("Enter subject name: ");
                    subjectName = scanner.nextLine();
                    if (subjectName.isEmpty()) {
                        System.out.println("Please enter a subject.");
                        continue;
                    }
                    break;
                } catch (InputMismatchException a) {
                    System.out.println("Invalid input. Please enter a valid subject.");
                    scanner.nextLine();
                }
                
            }    
            int subjectScore = getValidatedInt(scanner, "Enter subject score: ", 0, 100);
            total = total + subjectScore;
            if (subjectScore > highestScore) {
                highestSubject = subjectName;
                highestScore = subjectScore;
            } 
            if (subjectScore < lowestScore) {
                lowestScore = subjectScore;
                lowestSubject = subjectName;    
            }
            grade = scoreToGrade(subjectScore);
            report += String.format("%-10s %6d %6s%n", subjectName, subjectScore, grade);
        }
        
        double averageGrade = total / subjectCount;
        String overallLetterGrade = scoreToGrade(averageGrade);
        
        System.out.println("-------------- Report Card --------------");
        System.out.println("-----------------------------------------");
        System.out.printf("%-10s | %6s | %6s%n", "Subject", "Score", "Grade");
        System.out.println("-----------------------------------------");
        System.out.println(report);
        System.out.printf("%-15s %10.2f %n", "Average:", averageGrade);
        System.out.printf("%-15s %10s%n", "Overall Grade:", overallLetterGrade);
        System.out.printf("%-15s %10s (%1d)%n", "Highest:", highestSubject, highestScore);
        System.out.printf("%-15s %10s (%1d)%n", "Lowest:", lowestSubject, lowestScore);
    
    }
    public static int getValidatedInt(Scanner scanner, String prompt, int min, int max) {
        int value;
        while (true) {
            try {
                System.out.print(prompt);
                value = scanner.nextInt();
                scanner.nextLine();
                if (value < min || value > max) {
                    System.out.println("Please enter a number between " + min + " and " + max + ".");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.nextLine();
            }
        }
        return value;
    }

    public static String scoreToGrade(double score) { // Letter grade method
        if (score >= 90) {
            return "A";
        } else if (score >=80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
