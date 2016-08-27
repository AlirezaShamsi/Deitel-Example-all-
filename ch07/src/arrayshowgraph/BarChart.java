package arrayshowgraph;

public class BarChart {

	public static void main(String[] args) 
	{
		int[] array = {5,8,6,10,11,2,8,5,6,3,1};
		
		System.out.println("Grade distribution : ");
		
		for(int counter = 0 ; counter < array.length ; counter++)
		{
			if(counter == 10)
				System.out.printf("\n%5d |", 100 );
			else
				System.out.printf(" \n%02d-%02d |", counter*10,counter*10+9);
			
			for(int stars = 0 ; stars < array[counter] ; stars++)
				System.out.print("_");
		}

	}

}
