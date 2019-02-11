package Teil10_Karte;

public class Feiertag extends Karte {

	public Feiertag(String empfaenger, String anrede) {
		super(empfaenger, anrede);
	}

	public void gruss() {
		System.out.println(anrede+" " + empfaenger + ",\n");
		System.out.println("frohe Feiertage!\n\n");
	}
}
