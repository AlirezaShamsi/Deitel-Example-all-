package ch14_28;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

import org.omg.CORBA.PRIVATE_MEMBER;

public class MouseTrackFrame extends JFrame
{
	private JPanel mousePanel;
	private JLabel statusBar;
	
	public MouseTrackFrame()
	{
		super("Demonsterating  Mouse Event");
		
		mousePanel = new JPanel();
		mousePanel.setBackground(Color.WHITE);
		add(mousePanel,BorderLayout.CENTER);
		
		statusBar = new JLabel("Mouse Outside Panel");
		add(statusBar,BorderLayout.SOUTH);
		
		MouseHandler handler = new MouseHandler();
		mousePanel.addMouseListener(handler);
		mousePanel.addMouseMotionListener(handler);
		
		
	}
	
	private class MouseHandler implements MouseListener,MouseMotionListener
	{
		public void MouseCliked(MouseEvent event)
		{
			statusBar.setText(String.format("Cliced at [%d , %d]", event.getX(),event.getY()));
		}
		
		public void mouseClicked(MouseEvent event)
		{
			statusBar.setText(String.format("Cliced at [%d , %d]", event.getX(),event.getY()));
		}
		
		public void mousePressed(MouseEvent event)
		{
			statusBar.setText(String.format("Pressed at [%d , %d]", event.getX(),event.getY()));
		}
		
		public void mouseReleased(MouseEvent event)
		{
			statusBar.setText(String.format("Released at [%d , %d]", event.getX(),event.getY()));
		}
		
		public void mouseEntered(MouseEvent event)
		{
			statusBar.setText(String.format("Entered at [%d , %d]", event.getX(),event.getY()));
			mousePanel.setBackground(Color.GREEN);
		}
		
		public void mouseExited(MouseEvent event)
		{
			statusBar.setText(String.format("Exited at [%d , %d]", event.getX(),event.getY()));
			mousePanel.setBackground(Color.WHITE);
		}
		
		public void mouseDragged(MouseEvent event)
		{
			statusBar.setText(String.format("Dragged at [%d , %d]", event.getX(),event.getY()));
		}
		public void mouseMoved(MouseEvent event)
		{
			statusBar.setText(String.format("Moved at [%d , %d]", event.getX(),event.getY()));
		}
	}

}
