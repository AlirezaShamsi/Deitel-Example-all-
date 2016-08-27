package interfaceEmployee;

public class SalariedEmployee extends Employee
{
	
	private double weeklySalary;
	
	public SalariedEmployee(String first,String last , String ssn, double salary){
		
		super(first, last, ssn);
		setWeeklySalary(salary);
		
	}

	public void setWeeklySalary(double salary)
	{
		if ( salary >= 0.0)
			weeklySalary = salary;
		else {
			throw new IllegalArgumentException("Weekly Salary must be >= 0.0");
		}
	}
	
	public double getWeeklySalary()
	{
		return weeklySalary;
	}
	
	@Override 
	public double getPaymentAmount()
	{
		return getWeeklySalary();
	}
	
	@Override
	public String toString()
	{
		return String.format("salaried Employee : %s\n%s : $%,.2f", super.toString(),
				"Weekly Salarid", getWeeklySalary());
	}
}
