package Teil11;

import java.awt.*;
import javax.swing.*;

public class SelfFrame extends JFrame {

	JLabel label;
	
	public SelfFrame(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout() );
		
		label = new JLabel("Hello people!");
		add(label);
	}
}
