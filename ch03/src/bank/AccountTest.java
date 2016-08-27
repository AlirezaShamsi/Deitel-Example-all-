package bank;
import java.util.Scanner;
public class AccountTest {

	public static void main(String[] args) {
		
		Account account1 = new Account(50.00);
		Account account2 = new Account(-7.53);
		
		System.out.printf("Account 1 Balance $%.2f\n", account1.getBalance() );
		System.out.printf("Account 2 Balance $%.2f\n", account2.getBalance() );
		
		Scanner input = new Scanner(System.in);
		double depositAmount;
		System.out.print("\nEnter deposit amount for account 1 :");
		depositAmount = input.nextDouble();
		System.out.printf("\nadding $%.2f to Account 1 Balance\n\n", depositAmount);
		account1.credit(depositAmount);
		
		System.out.printf("Account 1 Balance : $%.2f\n", account1.getBalance() );
		System.out.printf("Account 2 Balance : $%.2f\n", account2.getBalance() );
		
		System.out.print("\nEnter deposit amount for account 2 : ");
		depositAmount = input.nextDouble();
		System.out.printf("\nadding $%.2f to Account 2 Balance\n\n", depositAmount);
		account2.credit(depositAmount);
		
		System.out.printf("Account 1 Balance : $%.2f\n", account1.getBalance() );
		System.out.printf("Account 2 Balance : $%.2f\n", account2.getBalance() );
		

	}

}
