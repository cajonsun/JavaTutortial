package Teil10_Haustier;

public abstract class Haustiere {

	//Instanzvariablen
	String name;
	double futtervorrat;
	int	   anzahlTage;	  //gibt die Anzahl Tage  aus, die der Futtervorrat reicht
	
	//Konstruktor
	public Haustiere(String name, double futtervorrat, int auswahl) {
		this.name			= name;
		this.futtervorrat	= futtervorrat;
	}
	
	//Methoden
	public void fuettern() {
		sprich();
		friss();
	};
	
	public void anzeigen() {
		System.out.println("Der Vorrat fuer "+name+" reicht "+anzahlTage+" Tage.\n");
	};
	
	public abstract void friss();
	public abstract void sprich();
	
	
}
