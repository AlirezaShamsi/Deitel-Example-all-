package array03;

public class InitArray {

	public static void main(String[] args) 
	{
		final int ARRAY_LENGTH = 10;
		int[] array = new int[ARRAY_LENGTH];
		
		for(int counter = 0; counter < array.length; counter++ )
			array[counter] = 2 + 2 * counter;
		
		for(int counter = 0; counter< array.length; counter++)
		{
			System.out.printf("%5s%8s\n", counter,array[counter]);
		}

	}

}
