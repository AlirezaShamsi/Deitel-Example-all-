package polymorphism;

public class PolymorphismTest {

	public static void main(String[] args) {
		CommissionEmployee commissionEmployee = new CommissionEmployee(
				"Sue", "Jones", "222-22-2222", 10000, .06);
		
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
				"Bob", "Lewis", "333-33-3333", 500, .04,300);
		
		System.out.printf("%s %s: \n\n%s\n\n",
							"Call CommissionEmployee With superclass refrence",
							"to SuperClass Object",commissionEmployee.toString());
		
		System.out.printf("%s %s: \n\n%s\n\n",
				"Call BasePlusCommissionEmployee's to string with subclass",
				"refrence to subclass object",basePlusCommissionEmployee.toString());
		
		CommissionEmployee commissionEmployee2 = basePlusCommissionEmployee;
		
		System.out.printf("%s %s: \n\n%s\n\n",
				"Call BasePlusCommissionEmployee's to string with superclass",
				"refrence to subclass object",commissionEmployee2.toString());

	}

}
