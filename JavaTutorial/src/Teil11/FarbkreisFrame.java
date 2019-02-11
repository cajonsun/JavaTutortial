package Teil11;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class FarbkreisFrame extends JFrame implements ActionListener{

	JButton bChange;
	
	public FarbkreisFrame (String title) {
		super(title);
		
		setLayout(new FlowLayout());
		
		bChange = new JButton("Farbe wechseln");
		bChange.addActionListener(this);
		add(bChange);
		
	}

	public void actionPerformed(ActionEvent evt) {

		if (getContentPane().getBackground() == Color.red) {
			getContentPane().setBackground(Color.green);
		} 
		else if (getContentPane().getBackground() == Color.green) {
			getContentPane().setBackground(Color.blue);
		}
		else if (getContentPane().getBackground() == Color.blue) {
			getContentPane().setBackground(Color.gray);
		}
		else {
			getContentPane().setBackground( Color.red );
		}
	}
}
