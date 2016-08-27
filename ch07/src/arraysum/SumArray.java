package arraysum;

public class SumArray {

	public static void main(String[] args) {
		
		int[] array = {85,65,98,47,58,89,99,100,65,74};
		int total = 0;
		
		for(int counter = 0 ; counter < array.length ; counter++)
			total += array[counter];
		
		System.out.printf("Total of Grade is : %d", total);

	}

}
