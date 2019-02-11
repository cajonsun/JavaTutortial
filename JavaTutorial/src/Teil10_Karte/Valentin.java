package Teil10_Karte;

public class Valentin extends Karte {
	private int kuesse;

	public Valentin(String empfaenger, String anrede, int kuesse) {
		super(empfaenger, anrede);
		this.kuesse = kuesse;
	}

	public void gruss() {
		System.out.println(anrede+" " + empfaenger + ",\n");
		System.out.println("herzliche Gruesse und Kuesse,\n");
		for (int i = 0; i < kuesse; i++) {
			System.out.print("X");
		}
		System.out.println("\n\n");
	}
}
