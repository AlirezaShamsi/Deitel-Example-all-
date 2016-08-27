package ch14_25;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.text.DefaultEditorKit.CopyAction;

public class MultipleSelectionFrame extends JFrame {
	
	private JList colorJList;
	private JList copyJList;
	private JButton copyJButton;
	private static final String[] colorNames ={"Black","Blue","Cyan","Dark Gray","Gray","Green",
		"Light Gray","Mageta","Orange","Pink","Red","White","Yellow"};
	
	public MultipleSelectionFrame()
	{
		super("Multiple Selection List");
		setLayout(new FlowLayout());
		
		colorJList = new JList(colorNames);
		colorJList.setVisibleRowCount(5);
		colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(colorJList));
		
		copyJButton = new JButton("Copy >>>");
		copyJButton.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
						copyJList.setListData(colorJList.getSelectedValues());
					}
					
				});
		add(copyJButton);
		
		copyJList = new JList();
		copyJList.setVisibleRowCount(5);
		copyJList.setFixedCellWidth(100);
		copyJList.setFixedCellHeight(15);
		copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		add(new JScrollPane(copyJList));
	}

}