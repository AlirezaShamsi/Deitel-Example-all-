package setget;
import java.util.Scanner;


public class GradeBookTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		GradeBook myGradeBook = new GradeBook();
		
		System.out.printf("Initial course name is :\n%s\n", myGradeBook.getCourseName());
		
		System.out.print("Please Enter the Course Name :");
		String theName = input.nextLine();
		
		myGradeBook.setCourseName(theName);
		System.out.println();
		
		myGradeBook.displayMessage();
		

	}

}
