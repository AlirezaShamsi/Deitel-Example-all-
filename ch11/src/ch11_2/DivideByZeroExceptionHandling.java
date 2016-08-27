package ch11_2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DivideByZeroExceptionHandling {
	
	private static Scanner scanner;

	public static int quotient(int numerator , int denominator)
	throws ArithmeticException		
	{
		return numerator / denominator;
	}

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		boolean continueLoop = true;
		
		do {
			
			try 
			{
				System.out.print("\nPlease enter a integer numerator ");
				int numerator = scanner.nextInt();
				
				System.out.print("\nPlease enter a integer denominator ");
				int denominator = scanner.nextInt();
				
				int result = quotient(numerator, denominator);
				
				System.out.printf("\nResult: %d / %d =%d", numerator,denominator,result);
				continueLoop = false;
				
			} 
			catch (InputMismatchException inputMismatchException) 
			{
				System.err.printf("\nExceptin: %s\n", inputMismatchException);
				scanner.nextLine();
				System.out.println("You must Enter Integer . Please try again.\n");
			}
			catch (ArithmeticException arithmeticException)
			{
				System.err.printf("\nExeption: %s\n\n", arithmeticException);
				scanner.nextLine();
				System.out.println("Zero is an Invalid denominator.Please try Again.");
			}
		} while (continueLoop);
		

	}

}
