package sendarraytomethod;

public class PassArray {

	public static void main(String[] args) 
	{
		int[] array = { 1 , 2 , 3 , 4 , 5 };
		
		System.out.println("Effects of passing refrence to entire array : \n" + 
		"The value of the orginal array are : ");
		
		for(int value : array)
			System.out.printf("   %d", value );
		
		modifyArray(array);
		System.out.println("\n\nThe value of the modify array are : ");
		
		for(int value : array)
			System.out.printf("   %d", value);
		
		System.out.printf("\nEffects of passing array element value : \n" + 
				"array[3] befor modify element : %d\n" , array[3]);
		
		modifyElement(array[3]);
		System.out.printf("array[3] after modify element : %d\n", array[3]);

	}
	
	public static void modifyArray(int array2[])
	{
		for(int counter = 0 ; counter < array2.length ; counter++)
			array2[counter] += 2;//چون نیاز به دستکاری آرایه داریم نمیتوانیم از نوع بهبود یافته استفاده نماییم
		
	}
	
	public static void modifyElement(int element)
	{
		element *= 2;
		System.out.printf("Value of element in modify element : %d\n", element);
	}

}
