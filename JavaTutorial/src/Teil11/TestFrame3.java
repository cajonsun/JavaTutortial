package Teil11;

public class TestFrame3 {

	public static void main(String[] args) {
		ButtonFrame2 frame = new ButtonFrame2("Klick Glück");
		frame.setVisible(true);
		frame.setBounds(750, 200, 350, 350);
		
		FarbkreisFrame frame2 = new FarbkreisFrame("Farbkreis");
		frame2.setVisible(true);
		frame2.setBounds(250, 200, 350, 350);
	}
}
