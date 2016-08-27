package overload;

public class methodOverload {

	public static void main(String[] args) {
		System.out.printf("\nSquare of integer 7 is : %d \n", square(7));
		System.out.printf("\nSquare of double 7.5 is : %f \n", square(7.5));

	}
	
	public static int square(int intValue)
	{
		System.out.printf("\nCalled Squre with int argument : %d", intValue);
		
		return intValue * intValue;
	}
	
	public static double square(double doubleValue)
	{
		System.out.printf("\nCalled square with double argument : %f",doubleValue);
		
		return doubleValue * doubleValue;
	}

}
