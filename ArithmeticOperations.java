package sampleWorkout;
import java.util.InputMismatchException;


import java.util.Scanner;

public class ArithmeticOperations {
    public void arithmeticOperations() {
        Scanner sc = new Scanner(System.in);
        double a, b;
        char c;
        
        String response;

        while (true) {
        	System.out.print("Would you like to perform operation (yes/no): ");
            response = sc.nextLine().trim().toLowerCase();
            
            if (response.equals("no")) {
                System.out.println("Exiting...");
                break;
            } else if(!response.equals("yes")) {
            	System.out.println("Invalid input. Please enter 'yes' or 'no'!!!");
            	continue;
            }

            // Read 1st operand safely
            while (true) {
                try {
                    System.out.print("Enter the 1st operand: ");
                    a = sc.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter an integer.");
                    sc.nextLine(); // clear buffer
                }
            }

            // Read operator safely
            while (true) {
                try {
                    System.out.print("Enter the operator (+, -, *, /, %): ");
                    c = sc.next().charAt(0);
                    if ("+-*/%".indexOf(c) != -1) {
                        break;
                    } else {
                        System.out.println("Invalid operator. Try again.");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input for operator.");
                    sc.nextLine();
                }
            }

            // Read 2nd operand safely
            while (true) {
                try {
                    System.out.print("Enter the 2nd operand: ");
                    b = sc.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter an integer.");
                    sc.nextLine(); // clear buffer
                }
            }

            sc.nextLine(); // consume newline

            try {
            	Double result = calculate(a, b, c);
            
                if (result != null) {
                    System.out.printf("Result: %.2f %c %.2f = %.2f\n", a, c, b, result);
                }
            }catch (Exception e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
            
            System.out.println(); // add space before next round
        }

        sc.close();
    }

    public static Double calculate(double a, double b, char c) {
        switch (c) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) {
                    System.out.println("Cannot divide by zero!");
                    return null;
                }
                return a / b;
            case '%':
                if (b == 0) {
                    System.out.println("Cannot mod by zero!");
                    return null;
                }
                return a % b;
            default:
                System.out.println("Unknown operator!");
                return null;
        }
    }
}