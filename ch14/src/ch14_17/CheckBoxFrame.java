package ch14_17;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame
{
	private JTextField textField;
	private JCheckBox boldCheckBox;
	private JCheckBox italicCheckBox;
	
	public CheckBoxFrame()
	{
		super("JCheckBox Test");
		setLayout(new FlowLayout());
		
		textField = new JTextField("Watch the font style Change",20);
		textField.setFont(new Font("Serif", Font.PLAIN, 14));
		add(textField);
		
		boldCheckBox = new JCheckBox("Bold");
		italicCheckBox = new JCheckBox("Italic");
		add(boldCheckBox);
		add(italicCheckBox);
		
		CheckBoxHandler handler = new CheckBoxHandler();
		boldCheckBox.addItemListener(handler);
		italicCheckBox.addItemListener(handler);
	}
	
	private class CheckBoxHandler implements ItemListener
	{
		public void itemStateChanged(ItemEvent event)
		{
			Font font = null;
			
			if(boldCheckBox.isSelected()&&italicCheckBox.isSelected())
				font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
			else if(boldCheckBox.isSelected())
				font = new Font("Serif",Font.BOLD,14);
			else if(italicCheckBox.isSelected())
				font = new Font("Serif", Font.ITALIC, 14);
			else {
				font = new Font("Serif", Font.PLAIN, 14);
			}
			textField.setFont(font);
		}
	}
	

}
