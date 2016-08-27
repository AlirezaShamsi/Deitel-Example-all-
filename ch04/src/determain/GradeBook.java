package determain;
import java.util.Scanner;
public class GradeBook {
	
	private String courseName;
	
	public GradeBook(String name){
		
		courseName = name;
	}
	
	public void setCourseName(String name){
		
		courseName = name;
	}
	
	public String getCourseName(){
		
		return courseName;
	}
	
	public void displayMessage(){
		
		System.out.printf("Welcome to the GradeBook for \n%s\n", getCourseName());
	}
	
	public void determineClassAverage(){
		
		Scanner input = new Scanner(System.in);
		
		int total;
		int gradeCounter;
		int grade;
		int average;
		
		total = 0;
		gradeCounter = 1;
		
		while( gradeCounter <= 10){
			
			System.out.print("Enter Grade :  ");
			grade = input.nextInt();
			total += grade;
			gradeCounter += 1;
			
		}
		
		average = total/10;
		
		System.out.printf("\n total of all 10 grade is : %d", total);
		System.out.printf("\n class Average is : %d " , average);
		
	}

}
