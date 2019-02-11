package Teil11;

import java.util.concurrent.TimeUnit;
import java.awt.*;
import javax.swing.*;

public class TestFrame1 {

	public static void main(String[] args) throws InterruptedException {
		
//		JFrame frame1 = new JFrame("Test Frame 1");
//		JFrame frame2 = new JFrame("Test Frame 2");
//		
//		frame1.setVisible(true);
//		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame1.setBounds(200, 150, 500, 300);
//
//		frame2.setVisible(true);
//		frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//		frame2.setBounds(1000, 150, 350, 400);
		
		
		
		for (int i = 0; i < 10;i++) {
			JFrame frame = new JFrame("Troll");
			frame.setVisible(true);
			frame.setBounds(i*50, i*25, 300, 300);
			TimeUnit.SECONDS.sleep(1);
		}
		
	}
}
