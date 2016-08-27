package ch14_2;

import javax.swing.JOptionPane;

public class Addition {

	public static void main(String[] args) 
	{
		String firstNumber = JOptionPane.showInputDialog("Please Enter First Number:");
		String secondNumber = JOptionPane.showInputDialog("Please Enter Second Number:");
		
		int number1 = Integer.parseInt(firstNumber);
		int number2 = Integer.parseInt(secondNumber);
		
		int sum = number1 + number2;
		
		JOptionPane.showMessageDialog(null, "The Sum is:" + sum, "Sum of Two Integers",
				JOptionPane.PLAIN_MESSAGE);

	}

}
