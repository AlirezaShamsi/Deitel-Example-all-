import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		
		System.out.print("Enter Your First Number: ");
		number1 = input.nextInt();
		
		System.out.print("Enter Your Second Number: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		
		System.out.printf("Sum is %d\n",sum);

	}

}
