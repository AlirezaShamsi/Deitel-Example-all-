package ch11_1;

import java.util.Scanner;

public class DivideByZeroExceptionHandling {
	
	private static Scanner scanner;
	public static int quotient(int numerator , int denominator)
	{
		return numerator / denominator;
	}
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.print("Please enter a integer numerator ");
		int numerator = scanner.nextInt();
		
		System.out.print("Please enter a integer denominator ");
		int denominator = scanner.nextInt();
		
		int result = quotient(numerator, denominator);
		
		System.out.printf("\nResult: %d / %d =%d", numerator,denominator,result);

	}

}
