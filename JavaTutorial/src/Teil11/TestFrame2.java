package Teil11;

public class TestFrame2 {

	
	public static void main(String[] args) {
		SelfFrame frame = new SelfFrame("Test");
		frame.setVisible(true);
		frame.setSize(300, 300);
		
		ButtonFrame frame2 = new ButtonFrame("Klick Glück");
		frame2.setVisible(true);
		frame2.setBounds(750, 500, 350, 350);
	}
}
