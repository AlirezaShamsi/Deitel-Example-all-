package senteniel;
import java.util.*;
public class GradeBook {
	
	public String courseName;
	
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
		System.out.printf("WelCome to the GradeBook for : \n%s\n", getCourseName());
	}
	
	public void determineClassAverage()
	{
		Scanner input = new Scanner(System.in);
		
		int total ,
			gradeCounter ,
			grade;
		double average;
		
		total = 0;
		gradeCounter = 0;
		
		System.out.print("Enter Grade or -1 to quit : ");
		grade = input.nextInt();
		
		while( grade != -1 )
		{
			total += grade;
			gradeCounter += 1;
			
			System.out.print("Enter Grade or -1 to quit : ");
			grade = input.nextInt();
		}
		
		if(gradeCounter != 0 )
		{
			average = (double) total/gradeCounter;
			
			System.out.printf("\nTotal of %d Grade Entered is %d\n", gradeCounter,total);
			System.out.printf("Class Average is %.2f\n", average);
		}
		else
			System.out.print("No Grade Were Enterd");
		
	}

}
