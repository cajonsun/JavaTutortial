package Teil11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonFrame extends JFrame implements ActionListener{

	  JButton bChange ; // Referenz auf ein Button-Objekt

	  // Konstruktor für ButtonFrame

	  ButtonFrame(String title)
	  {
	    super( title );                    		// den JFrame Konstruktor aufrufen
	    setLayout( new FlowLayout() );     		// den Layoutmanager setzen

	    bChange = new JButton("Klick mich!"); 	// einen JButton konstruieren
	    
	    bChange.addActionListener(this);
	    add( bChange );                     	// dem JFrame den Button hinzufügen

	    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	  }

	public void actionPerformed(ActionEvent evt) {
		getContentPane().setBackground( Color.blue );
//		System.exit(0);
		repaint();
	}
}
