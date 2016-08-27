package arrayexceptin;

public class StudentPoll {

	public static void main(String[] args) {
		
		int[] responses = {1,2,3,4,5,2,5,4,7,8,9,6,5,4,7,4,9,6,10,14,22,11,8,7};
		int[] frequency = new int[11];
		
		for(int answer = 0 ; answer < responses.length ; answer++)
		{
			
			try
			{
				++frequency[responses[answer]];
			}
		
			catch( ArrayIndexOutOfBoundsException e)
			{
			System.out.println( e );
			System.out.printf("responses[%d] : %d\n\n", answer, responses[answer]);
			}
			
		}
		
		System.out.printf("%s%10s\n", "Rate","Frequency");
		
		for(int rate = 1 ; rate < frequency.length ; rate++)
			System.out.printf("%d%10d\n", rate , frequency[rate]);

	}

}
