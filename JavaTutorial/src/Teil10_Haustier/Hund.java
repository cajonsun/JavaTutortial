package Teil10_Haustier;

public class Hund extends Haustiere {

	String kategorie;
	
	public Hund(String name, double futtervorrat, int auswahl) {
		super(name, futtervorrat, auswahl);
		if (auswahl == 1) 
			kategorie = "Kleinhunde";
		else if(auswahl == 2) 
			kategorie = "Mittelgrosse Hunde";
		else 
			kategorie = "Große Hunde";
	}
	
	public void anzeigen() {
		System.out.print("(Kategorie: "+kategorie+") ");
		super.anzeigen();
	}
	
	public void friss() {
		while (futtervorrat> 0) {
			System.out.println(name+": "+futtervorrat);
			futtervorrat--;
			anzahlTage++;
		}
	}

	public void sprich() {
		System.out.println("Wuff!");
	}

}
