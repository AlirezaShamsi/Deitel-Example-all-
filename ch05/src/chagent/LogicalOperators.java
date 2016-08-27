package chagent;

public class LogicalOperators {

	public static void main(String[] args) {
		
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Conditional AND(&&)",
				"false && false" , (false && false),
				"false && true"  , (false && true),
				"true && false"  , (true && false),
				"true && true"   , (true && true));
		
		
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Conditional OR(||)",
				"false || false" , (false || false),
				"false || true"  , (false || true),
				"true || false"  , (true || false),
				"true || true"   , (true || true));
		
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Boolean Logical AND(&)",
				"false & false" , (false & false),
				"false & true"  , (false & true),
				"true & false"  , (true & false),
				"true & true"   , (true & true));

		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Boolean Logical Inclusive OR(|)",
				"false | false" , (false | false),
				"false | true"  , (false | true),
				"true | false"  , (true | false),
				"true | true"   , (true | true));
		
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Boolean Logical Exclusive OR(^)",
				"false ^ false" , (false ^ false),
				"false ^ true"  , (false ^ true),
				"true ^ false"  , (true ^ false),
				"true ^ true"   , (true ^ true));
		

		System.out.printf("%s\n%s: %b\n%s: %b\n",
				"Logical Not(!)",
				"!false" , (!false),
				"!true"  , (!true));

	}

}
