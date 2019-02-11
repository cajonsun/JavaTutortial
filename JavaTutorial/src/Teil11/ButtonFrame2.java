package Teil11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonFrame2 extends JFrame implements ActionListener {


	  JButton bChangeRed, bChangeGreen, bChangeBlue, bChangeGray ; // Referenz auf ein Button-Objekt

	  // Konstruktor für ButtonFrame

	  ButtonFrame2(String title)
	  {
	    super( title );                    		// den JFrame Konstruktor aufrufen
	    setLayout( new FlowLayout() );     		// den Layoutmanager setzen

	    bChangeRed   = new JButton("Rot"); 	// einen JButton konstruieren
	    bChangeGreen = new JButton("Grün");
	    bChangeBlue  = new JButton("Blau");
	    bChangeGray  = new JButton("Grau");
	    
	    
	    bChangeRed.setActionCommand("rot");
	    bChangeGreen.setActionCommand("gruen");
	    bChangeBlue.setActionCommand("blau");
	    bChangeGray.setActionCommand("grau");
	    
	    bChangeRed.addActionListener(this);
	    bChangeGreen.addActionListener(this);
	    bChangeBlue.addActionListener(this);
	    bChangeGray.addActionListener(this);
	    
	    add( bChangeRed);
	    add(bChangeGreen);
	    add(bChangeBlue);
	    add(bChangeGray);                     	// dem JFrame den Button hinzufügen

	    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	  }

	public void actionPerformed(ActionEvent evt) {

		if (evt.getActionCommand().equals("rot")) {
			getContentPane().setBackground( Color.red );
		}
		else if (evt.getActionCommand().equals("gruen")) {
			getContentPane().setBackground( Color.green );
		}
		else if (evt.getActionCommand().equals("blau")) {
			getContentPane().setBackground( Color.blue );
		}
		else {
			getContentPane().setBackground( Color.gray );
		}
//		System.exit(0);
		repaint();
	}
}
