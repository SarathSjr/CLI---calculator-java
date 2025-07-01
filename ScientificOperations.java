package sampleWorkout;

import java.util.Scanner;
import java.lang.Math;
public class ScientificOperations {
	public void scientificOperations() {
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		double num1, num2, result = 0;
		
		
		while(true) {
			System.out.println("Welcome to Scientific calculator menu!!! ");
			System.out.println("Press: ");
			System.out.println("1. Square root");
			System.out.println("2. Power (a^b)");
			System.out.println("3. Sine");
			System.out.println("4. Cosine");
			System.out.println("5. Tangent");
			System.out.println("6. Exit");
			
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				try {
					System.out.print("Enter a number: ");
					num1 = sc.nextDouble();
					result = Math.sqrt(num1);
					System.out.printf("√%.2f = $.4f\n", num1, result);
					break;
				}catch (Exception e) {
					System.out.println(e.getMessage());
					sc.nextLine();
					break;
				}
			case 2:
				try {
					System.out.print("Enter base: ");
					num1 = sc.nextDouble();
					System.out.print("Enter exponent: ");
					num2 = sc.nextDouble();
					result = Math.pow(num1, num2);
					System.out.printf("%.2f ^ %.2f = %.4f\n", num1, num2, result);
					break;
				} catch (Exception e) {
					System.out.println(e.getMessage());
					sc.nextLine();
					break;
				}
			case 3:
				try {
					System.out.print("Enter the angle in degrees: ");
					num1 = Math.toRadians(sc.nextDouble());
					result = Math.sin(num1);
					System.out.printf("cos = %.4f\n", result);
					break;
				} catch (Exception e) {
					System.out.println(e.getMessage());
					sc.nextLine();
					break;
				}
			case 4:
                try {
                	System.out.print("Enter angle in degrees: ");
                    num1 = Math.toRadians(sc.nextDouble());
                    result = Math.cos(num1);
                    System.out.printf("cos = %.4f\n", result);
                    break;
                }catch (Exception e) {
					System.out.println(e.getMessage());
					sc.nextLine();
					break;
				}
            case 5:
                try {
                	System.out.print("Enter angle in degrees: ");
                    num1 = Math.toRadians(sc.nextDouble());
                    result = Math.tan(num1);
                    System.out.printf("tan = %.4f\n", result);
                    break;
                } catch (Exception e) {
					System.out.println(e.getMessage());
					sc.nextLine();
					break;
				}
            case 6:
                System.out.println("Exiting Calculator. Goodbye!");
                sc.close();
                return;
            default:
                System.out.println("Invalid choice. Try again.");
			}
		}
	}
	
	
	
	
}
