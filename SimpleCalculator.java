import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
    
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        
        
        System.out.print("Enter the number corresponding to the operation (1/2/3/4): ");
        int choice = scanner.nextInt();
        
        double result;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.printf("Result of addition: %.2f\n", result);
                break;
            case 2:
                result = num1 - num2;
                System.out.printf("Result of subtraction: %.2f\n", result);
                break;
            case 3:
                result = num1 * num2;
                System.out.printf("Result of multiplication: %.2f\n", result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.printf("Result of division: %.2f\n", result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation (1/2/3/4).");
                break;
        }
        
        
        scanner.close();
    }
}
