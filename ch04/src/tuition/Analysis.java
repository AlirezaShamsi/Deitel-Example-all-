package tuition;
import java.util.*;
public class Analysis {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		int result ; 
		
		while(studentCounter <= 10)
		{
			System.out.print("Enter Result (1 = Pass , 2 = Fail)");
			result = input.nextInt();
			
			if(result == 1)
				passes +=1;
			else
				failures +=1;
			
			studentCounter +=1;
		}
		
		System.out.printf("\nPassed : %d \nFaild : %d", passes,failures);
		
		if(passes >= 8)
			System.out.print("\nBounce To Instructor!");

	}

}
