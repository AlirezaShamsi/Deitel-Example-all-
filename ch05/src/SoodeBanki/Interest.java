package SoodeBanki;

public class Interest {

	public static void main(String[] args) {
		
		double amount;
		double principal = 1000;
		double rate = 0.05;
		
		System.out.printf("%s%25s", "YEAR","Amount of Desposit");
		
		for(int year = 1 ; year <=10 ;year++)
		{
			amount = principal * Math.pow(1 + rate, year);
			
			System.out.printf("\n%2d%20.2f",year,amount );
		}

	}

}
