package timewithpackage;

import com.deitel.jhtp.ch8.Time1;

public class TimePackageTest {

	public static void main(String[] args) {

		Time1 time = new Time1();
		
		System.out.print("Initial universal Time is : ");
		System.out.println(time.toUniversalString());
		System.out.print("The Initial Standard Time is:");
		System.out.println(time.toString());
		System.out.println();
		
		time.setTime(13, 27, 6);
		System.out.print("Universal Time after setTime is : ");
		System.out.println(time.toUniversalString());
		System.out.print("Standard Time after setTime is:");
		System.out.println(time.toString());
		System.out.println();
		
		try
		{
			time.setTime(99, 99, 99);
		}
		catch(IllegalArgumentException e)
		{
			System.out.printf("Exception : %s\n\n", e.getMessage());
		}
		
		System.out.println("After attemping invalid setting : ");
		System.out.print("Universal Time : ");
		System.out.println(time.toUniversalString());
		System.out.print("Standard :");
		System.out.println(time.toString());
		System.out.println();
		

	}

}
