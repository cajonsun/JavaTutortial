package Teil10_Artikel;

public class Sonderposten extends Artikel {
	//Instanzvariablen
	protected double rabatt;
	
	//Konstruktor
	public Sonderposten(String artikelNr, String bezeichnung, double einkaufspreis, int lagerzeit) {
		super(artikelNr, bezeichnung, einkaufspreis, lagerzeit);
		if (lagerzeit>12) {
			rabatt = 0.3;
		} else {
			rabatt = 0.1;
		}
	}

	public void anzeigen() {
		System.out.println("\nSonderposten:");
		super.anzeigen();
		System.out.println("(VK <alt>: "+super.berechneVerkaufspreis()+" Euro Rabatt: "+(rabatt*100)+"%)");
	}
	
	public double berechneVerkaufspreis() {
		return super.berechneVerkaufspreis()-rabatt*super.berechneVerkaufspreis();
	}
}
