package chbreakcontinue;

public class Break {

	public static void main(String[] args) {
		int count;
		
		for(count = 1 ; count <= 10 ; count++ ){
			
			if(count == 5)
				continue;//break;
			
			System.out.printf(" %d ", count);
		}
		System .out.printf("\nNumber Counted  : %d" ,count);

	}

}
