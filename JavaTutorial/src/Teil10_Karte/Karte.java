package Teil10_Karte;

public abstract class Karte {

	String empfaenger;
	String anrede;
	
	public Karte(String empfaenger, String anrede) {
		this.empfaenger = empfaenger;
		this.anrede		= anrede;
	}
	
	public abstract void gruss();
}
