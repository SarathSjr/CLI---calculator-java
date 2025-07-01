package sampleWorkout;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArithmeticOperations ae = new ArithmeticOperations();
		ScientificOperations so = new ScientificOperations();
		
		System.out.println("Welcome to calculative world!!!");
		int opt;
		
		while(true) {
			
			System.out.println("Would you like to perform: ");
			System.out.println("1. Arithmetic operations");
			System.out.println("2. Scientific operations");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			opt = sc.nextInt();
			
			
			switch(opt) {
				case 1:
					ae.arithmeticOperations();
					break;

				case 2:
					so.scientificOperations();
					break;
					
				case 3:
					System.out.println("Exiting...");
					sc.close();
					return;
					
				default:
					System.out.println("Invalid option! Please choose 1, 2 or 3.");
			}
		}
	}
}
