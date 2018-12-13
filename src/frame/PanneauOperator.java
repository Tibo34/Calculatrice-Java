package frame;

import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class PanneauOperator extends JPanel {
	
	private LayoutManager layout=new GridLayout(1,4);
	private String[] operator= {"+","-","/","*"};

	public PanneauOperator() {		
		addButton();
		setLayout(layout);		
	}
	
	private void addButton() {
		
	}
	
}
