package frame;

import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanneauNombre extends JPanel {
	
	
	private LayoutManager layout;
	
	public PanneauNombre() {
		createButton();
		addLayout();
	}

	private void createButton() {		
		for(Integer i=0;i<10;i++) {
			JButton j=new JButton();
			j.setText(i.toString());
			add(j);
		}
	}
	
	private void addLayout() {
		layout=new GridLayout(3,3,10,10);
		setLayout(layout);
	}
		
	
	
	

}
