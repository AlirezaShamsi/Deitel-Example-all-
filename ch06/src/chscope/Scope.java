package chscope;

public class Scope {

	private static int x = 1 ;
	
	public static void main(String[] args) 
	{
		int x = 5;
		
		System.out.printf("Local x main is : %d\n", x);
		
		useLocalVariable();
		useField();
		useLocalVariable();
		useField();
		
		System.out.printf("\nLocal x main is : %d", x);

	}
	
	public static void useLocalVariable()
	{
		int x = 25;
		
		System.out.printf("\nLocal x on entering method useLocalVariable is %d\n", x);
		++x;
		System.out.printf("Local x befor exiting method useLocalVariable is %d\n",x);
	}
	
	public static void useField()
	{
		
		System.out.printf("\nLocal x on entering method useField is %d\n", x);
		x *= 10;
		System.out.printf("Local x befor exiting method useField is %d\n",x);
	}
	

}
