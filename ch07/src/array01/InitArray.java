package array01;

public class InitArray {

	public static void main(String[] args) 
	{
		int[] array;
		array = new int[10];
		
		System.out.printf("%s%8s\n", "Index", "Value");
		
		for(int counter = 0; counter< array.length; counter++)
		{
			System.out.printf("%5s%8s\n", counter,array[counter]);
		}

	}

}
