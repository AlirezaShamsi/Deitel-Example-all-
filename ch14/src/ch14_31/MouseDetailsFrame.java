package ch14_31;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseDetailsFrame extends JFrame
{
	private String details;
	private JLabel statusBar;

	public MouseDetailsFrame()
	{
		super("Mouse Clicked and Buttons");
		statusBar = new JLabel("Click the mouse");
		add(statusBar, BorderLayout.SOUTH);
		addMouseListener(new MouseClickHandler());
	}

	private class MouseClickHandler extends MouseAdapter
	{
		public void mouseClicked(MouseEvent event)
		{
			int xPos = event.getX();
			int ypos = event.getY();
			details = String.format("Clicked %d times.", event.getClickCount());
			if(event.isMetaDown())
				details += "With Right Mouse Buttons";
			else if(event.isAltDown())
				details += "With Middle Mouse Buttons";
			else
				details += "With Left Mouse Buttons";
			
			statusBar.setText(details);
		}
	}
}