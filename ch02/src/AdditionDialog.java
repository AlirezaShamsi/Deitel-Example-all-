import javax.swing.JOptionPane;

public class AdditionDialog {




	public static void main(String[] args) {
		
		String num1 = JOptionPane.showInputDialog("Enter First Number : ");
		int first = Integer.parseInt(num1);
		
		String num2 = JOptionPane.showInputDialog("Enter Second Number : ");
		int second = Integer.parseInt(num2);
		
		String sum = String.format("Sum is %d ", first+second );
		
		JOptionPane.showMessageDialog(null, sum);
		

	}
}



