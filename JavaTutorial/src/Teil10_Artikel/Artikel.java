package Teil10_Artikel;

public class Artikel {

	// Instanzvariablen
	protected String artikelNr;
	protected String bezeichnung;
	protected double einkaufspreis;
	protected int lagerzeit;
	final double HANDELSSPANNE = 0.6; // 60 Prozent des Einkaufspreises
	final double MWST = 0.19; // 19 Prozent

	// Konstruktor
	public Artikel(String artikelNr, String bezeichnung, double einkaufspreis, int lagerzeit) {
		this.artikelNr = artikelNr;
		this.bezeichnung = bezeichnung;
		this.einkaufspreis = einkaufspreis;
		this.lagerzeit = lagerzeit;
	}

	// Methoden
	public void anzeigen() {
		System.out.println(artikelNr+" "+bezeichnung+" EK: "+einkaufspreis+" Euro"+
				" VK: "+berechneVerkaufspreis()+" Lagerzeit: "+ lagerzeit+" Monate");
	}
	
	public double berechneVerkaufspreis() {
		double zwischen = einkaufspreis+einkaufspreis*HANDELSSPANNE;
		return zwischen+zwischen*MWST;
	}
}
