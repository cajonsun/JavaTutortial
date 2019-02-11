package Teil11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class Sizeconverter extends JFrame implements ActionListener{

	JButton bigger, smaller;
	int x = 500;
	int y = 500;
	
	public Sizeconverter(String title) {
		super(title);
		
		setLayout(new FlowLayout());
		setSize(x, y);
		
		bigger  = new JButton("Größer");
		smaller = new JButton("Kleiner");
		
		bigger.setActionCommand("b");
		smaller.setActionCommand("s");
		
		bigger.addActionListener(this);
		smaller.addActionListener(this);
		
		add(bigger); 
		add(smaller);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent evt) {
		
		if (evt.getActionCommand().equals("b")) {
			x = x+(x/10);
			y = y+(y/10);
		} else {
			x = x-(x/10);
			y = y-(y/10);
		}
		System.out.println(x);
		setSize(x,y);
	}
	
}
