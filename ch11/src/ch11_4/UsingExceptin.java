package ch11_4;

public class UsingExceptin {

	public static void main(String[] args) {
		
		try {
			throwException();
		} 
		catch(Exception exception)
		{
			System.err.println("Exception Handled in main");
		}
		doesNotThrowException();

	}
	
	public static void throwException() throws Exception
	
	{
		try {
			System.out.println("Method throwException");
			throw new Exception();
		} catch (Exception exception) {
			System.err.println("Exception handled in method throwException");
			throw exception;
		}
		finally
		{
			System.err.println("Finally Execute in throwExceptin");
		}
	}
	
	public static void doesNotThrowException()
	{
		try {
			System.out.println("Method doesNotThrowException");
			
		} catch (Exception exception) {
			System.err.println(exception);
		}
		finally
		{
			System.out.println("Finally Execute in doesNotThrowException");
		}
		System.out.println("End of method doesNotThrowException");
	}

}
