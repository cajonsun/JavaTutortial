package Teil10_Haustier;

public class Katze extends Haustiere {

	String haltung;
	
	public Katze(String name, double futtervorrat, int auswahl) {
		super(name, futtervorrat, auswahl);
		switch (auswahl) {
		case 1:
			haltung = "Wohnung";
			break;
		case 2: 
			haltung = "Artgerecht";
			break;
		default:
			break;
		}
	}
	
	public void anzeigen() {
		System.out.print("(Haltung: "+haltung+") ");
		super.anzeigen();
	}
	
	public void friss() {
		while (futtervorrat> 0) {
			System.out.println(name+": "+futtervorrat);
			futtervorrat = futtervorrat-0.5;
			anzahlTage++;
		}	
	}

	public void sprich() {
		System.out.println("Miau!");
	}
}
