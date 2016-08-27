package constructor;


public class GradeBookTest {

	public static void main(String[] args) {
		
		
		GradeBook myGradeBook1 = new GradeBook("CS 101 Introudaction to Java Programming");
		
		GradeBook myGradeBook2 = new GradeBook("CS 102 Introudaction to Java Programming");
		
        
		
		
		System.out.printf("Grade Book 1 Course name is : %s\n",myGradeBook1.getCourseName());
		System.out.printf("Grade Book 2 Course Name is : %s\n",myGradeBook2.getCourseName());

	}

}
