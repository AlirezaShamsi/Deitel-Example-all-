package packagedata;

public class PackageDataTest {

	public static void main(String[] args) {
		PackageData  packageData = new PackageData();
		
		System.out.printf("After instantiation: \n%s\n", packageData);
		
		packageData.number=77;
		packageData.string="Goodbye";
		System.out.printf("After Changing Value: \n%s\n", packageData);

	}

}

class PackageData{
	int number;// na publican ni privatan na protected barayr hamin mitoonim  to kole barname ha azashoon estefade konim.
	String string;
	
	public PackageData(){
		number=0;
		string="Hello";
	}
	public String toString()
	{
		return String.format("number = %d , string = %s",number,string);
	}
}

