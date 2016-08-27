package ch11_7;
import java.util.Scanner;

public class AssertTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter a Number between 0 and 10:");
		int number = input.nextInt();
		
		assert(number >= 0 && number <= 10) : "Bad Number" + number;
		System.out.printf("you entered %d\n", number);

	}

}
