package ch14_15;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame{
	
	private JButton plainJButton;
	private JButton fancyJButton;
	
	public ButtonFrame()
	{
		super("Testing Buttons");
		setLayout(new FlowLayout());
		
		plainJButton = new JButton("plain Button");
		add(plainJButton);
		
		Icon bug1 = new ImageIcon(getClass().getResource("bug1.GIF"));
		Icon bug2 = new ImageIcon(getClass().getResource("bug2.GIF"));
		fancyJButton = new JButton("fancy Button",bug1);
		fancyJButton.setRolloverIcon(bug2);
		add(fancyJButton);
		
		ButtonHandler handler = new ButtonHandler();
		fancyJButton.addActionListener(handler);
		plainJButton.addActionListener(handler);
	}
	
	private class ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
					"You Pressed %s ", event.getActionCommand()));
		}
	}

}
