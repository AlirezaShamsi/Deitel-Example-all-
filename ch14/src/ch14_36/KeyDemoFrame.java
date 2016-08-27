package ch14_36;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyDemoFrame extends JFrame implements KeyListener {

		private String line1 = "";
		private String line2 = "";
		private String line3 = "";
		private JTextArea textArea;
		
		public KeyDemoFrame()
		{
			super("Demonstrating Keystroke Events");
			
			textArea = new JTextArea(10,15);
			textArea.setText("Press any key on the Keyboard...");
			textArea.setEnabled(false);
			textArea.setDisabledTextColor(Color.BLACK);
			add(textArea);
			
			addKeyListener(this);
		}
		
		public void keyPressed(KeyEvent event)
		{
			line1 = String.format("Key Pressed: %s", KeyEvent.getKeyText(event.getKeyCode()));
			setLines2and3(event);
			
		}
		
		public void keyReleased(KeyEvent event)
		{
			line1 = String.format("Key Released: %s", KeyEvent.getKeyText(event.getKeyCode()));
			setLines2and3(event);
		}
		
		public void keyTyped(KeyEvent event)
		{
			line1 = String.format("Key Typed: %s", event.getKeyChar());
			setLines2and3(event);
		}
		
		private void setLines2and3(KeyEvent event)
		{
			line2 = String.format("This key is %s an action key", (event.isActionKey()? "" : "not"));
			String temp = KeyEvent.getKeyModifiersText(event.getModifiers());
			line3 = String.format("Modifier keys Pressed: %s", (temp.equals("") ? "none" : temp));
			textArea.setText(String.format("%s\n%s\n%s\n", line1,line2,line3));
			
		}
}
