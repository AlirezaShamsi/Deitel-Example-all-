package chswitch;
import java.util.*;
public class GradeBook 
{
	private String courseName;
	private int total;
	private int gradeCounter;
	private int aCount;
	private int bCount;
	private int cCount;
	private int dCount;
	private int fCount;
	
	public GradeBook(String name)
	{
		courseName = name;
	}
	
	public void setCourseName(String name)
	{
		courseName = name;
	}
	
	public String getCourseName()
	{
		return courseName;
	}
	
	public void displayMessage()
	{
		System.out.printf("Welcome to the GradeBook for: \n%s\n\n ", getCourseName());
	}
	
	public void inputGrade()
	{
		Scanner input = new Scanner(System.in);
		
		int grade;
		
		System.out.printf("%s\n%s\n	%s\n	%s\n",
				"Enter the Integer Grade in the range 0-100",
				"Type the end-of-file indicator to terminate input",
				"On UNIX/LINUX/MAC X type <Ctrl> d then press Enter",
				"On Windows type <Ctrl> z then press Enter");
		
		while(input.hasNext())
		{
			grade = input.nextInt();
			total += grade;
			++gradeCounter;
			
			incrementLetterGradeCounter(grade);
		}
	}
	
	private void incrementLetterGradeCounter(int grade)
	{
		switch(grade /10)
		{
		case 10:
		case 9:
			++aCount;
			break;
			
		case 8: 
			++bCount;
			break;
			
		case 7:
			++cCount;
			break;
			
		case 6:
			++dCount;
			break;
			
		default :
			++fCount;
			break;
		}
	}
	
	public void displayGradeReport()
	{
		System.out.println("\nGrade Report : ");
		
		if (gradeCounter !=0)
		{
			double average = (double) total / gradeCounter;
			
			System.out.printf("total of %d grade is : %d\n",gradeCounter,total);
			System.out.printf("\nClass average is : %.2f ", average);
			System.out.printf("\n%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n", 
					"Number of student who recive each Grade :",
					"A: " , aCount,
					"B: " , bCount,
					"C: " , cCount,
					"D: " , dCount,
					"F: " , fCount);
		}
		else
			System.out.println("No Grade Were Enterd");
	}
}
