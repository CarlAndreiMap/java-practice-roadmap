import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum = 0;
        int endNum = 0;
        int primeCount = 0;
        int perfectSquareCount = 0;
        int ascendingCount = 0;
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
        scanner.close();
        
        System.out.println("\nAnalyzing numbers from " + startNum + " to " + endNum + "...\n"); 
        

        for (int i = startNum; i <= endNum; i++) {
            boolean prime = primeCheck(i);
            boolean perfectSquare = perfectSquareCheck(i);
            boolean ascendingOrder = ascendingCheck(i);
            if (prime) {
                primeCount++;
                System.out.println(i + " -> Prime");
            } else if (perfectSquare) {
                perfectSquareCount++;
                System.out.println(i + " -> Perfect square");
            }

            if (ascendingOrder) {
                ascendingCount++;
                System.out.println(i + " -> Ascending digits");
            }
        }
        System.out.println("Summary:\nPrimes found: " + primeCount);

    }

    // Method to check if number is a prime.
    public static Boolean primeCheck(int number) {
        boolean isPrime = false;
        if (number > 1) {
            int prime = (int) Math.floor(Math.sqrt(number));
            for (int i = 2; i <= prime; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
                isPrime = true;
            }
        }
        return isPrime;
    }

    // Perfect Square Check
    public static Boolean perfectSquareCheck(int number) {
        int root = (int) Math.round(Math.sqrt(number));
        boolean isPerfectSquare = (root * root == number);
        return isPerfectSquare;
    }

    public static Boolean ascendingCheck(int number) {
        boolean isAscending = false;
        int previousNum = Integer.MAX_VALUE;
        for (int i = number; i != 0;) {
            int num = i % 10;
            if (num < previousNum) {
                previousNum = num;
                i = i / 10;
                continue;
            } else {
                isAscending = false;
                break;
            }
            
        }
        isAscending = true;
        
        return isAscending;
    }
}
