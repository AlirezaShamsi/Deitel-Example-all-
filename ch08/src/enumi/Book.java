package enumi;

public enum Book 
{
	
	JHTP("Java how to Program" , "2012"),
	CHTP("C how to Program","2006"),
	TW3HTP("Internet & World Wide web how to Program","2008"),
	CPPHTP("C++ how to program","2012"),
	VBHTP("Visual Basic 2010 how to Program","2011"),
	CSHARPHTP("Visual C# 2010 how to program","2011");

	private final String title;
	private final String copyrightYear;
	


	Book(String bookTitle , String year)
	{
		title = bookTitle;
		copyrightYear = year;
	
	}
	
	public String getTitle()
	{
		
		return title;
	}
	
	public String getcopyrightYear()
	{
		return copyrightYear;
	}

}