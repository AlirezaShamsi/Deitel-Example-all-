package enumi;

import java.util.EnumSet;

public class enumTest {
	
	public static void main (String[] args)
	{
		System.out.println("All Book : \n");
		
		for ( Book book : Book.values())
			System.out.printf("%-10s%-45s%s\n",book, book.getTitle(),book.getcopyrightYear());
		
		System.out.println("\nDisplay a range of enum constants:\n");
		

		for( Book book : EnumSet.range(Book.JHTP, Book.CPPHTP))
			System.out.printf("%-10s%-45s%s\n", book,book.getTitle(),book.getcopyrightYear());
	}

}
