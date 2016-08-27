package inheritemployee;

public class CommissionEmployeeTest {

	public static void main(String[] args) {
		CommissionEmployee employee = new CommissionEmployee(
				"Sue", "Jones", "222-22-2222", 10000, .06);
		
		System.out.println("Employee Information obtained by get Method: \n");
		System.out.printf("%s %s\n", "FirstName is : ",employee.getFirstName());
		System.out.printf("%s %s\n", "LastName is : ",employee.getLastName());
		System.out.printf("%s %s\n", "Social Security Number is : ",employee.getSocialSecurityNumber());
		System.out.printf("%s %.2f\n", "Gross Sales is : ",employee.getGrossSales());
		System.out.printf("%s %.2f\n", "Commission Rate is : ",employee.getCommissionRate());
		
		employee.setGrossSales(500);
		employee.setCommissionRate(.1);
		
		System.out.printf("\n%s: \n\n%s\n","Update Employee information obtained by toString",employee );

	}

}
