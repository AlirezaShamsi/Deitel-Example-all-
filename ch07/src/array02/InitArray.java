package array02;

public class InitArray {

	public static void main(String[] args) 
	{
		int[] array = { 55 ,65 , 98 ,3 ,35,45,78,89,96,10};
		
		System.out.printf("%s%8s\n", "Index", "Value");
		
		for(int counter = 0; counter< array.length; counter++)
		{
			System.out.printf("%5s%8s\n", counter,array[counter]);
		}

	}

}
