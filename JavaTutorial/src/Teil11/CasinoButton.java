package Teil11;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class CasinoButton extends JFrame implements ActionListener{

	JButton leftB, middleB, rightB;
	Random rnd = new Random();
	
	public CasinoButton(String title) {
		super(title);
		setLayout(new FlowLayout());

		leftB   = new JButton("1");
		middleB = new JButton("2");
		rightB  = new JButton("3");
		
		
		leftB.addActionListener(this);
		middleB.addActionListener(this);
		rightB.addActionListener(this);
		
		add(leftB);
		add(middleB);
		add(rightB);
		
	    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

	public void actionPerformed(ActionEvent evt) {
		
		int zufall = rnd.nextInt(3);
		
		if (zufall == 0) {
			System.exit(0);
		} else {
			if (getContentPane().getBackground() == Color.GREEN) {
				getContentPane().setBackground(Color.orange);
			} else {
				getContentPane().setBackground(Color.green);
			}
		}
		
	}	
	
}
