package Teil06;

public class Box {
	//Instanzvariablen
	private double breite;
	private double laenge;
	private double hoehe;
	  
	//Konstruktor
	
	//Initialisiert die Seitenlaengen der Instanz, wenn sie unterschiedlich lang sind
	Box(double breite, double hoehe, double laenge) {
	    this.breite  = breite;
	    this.laenge  = laenge;
	    this.hoehe   = hoehe;
	}
	
	//Initilisiert die Seitenlaengen der Instanz, wenn alle gleich sind
	Box( double seite) {
	    breite  = seite;
	    laenge  = seite;
	    hoehe   = seite;
	}
	
	//Initialisiert eine neue Instanz von der Klasse Box
	Box(Box alteBox) {
		Box box = alteBox;
	}
	
	//Methoden
	
	//Gibt die Oberflaeche von der Vorderseite aus
	private double berechneOberflaecheVorn() {
		return breite*hoehe;
	}
	
	//Gibt die Oberflaeche von der Oberseite aus
	private double berechneOberflaecheOben() {
		return breite*laenge;
	}
	
	//Gibt die Oberflaeche von der Seite aus
	private double berechneOberflaecheSeitlich() {
		return hoehe*laenge;
	}
	
	//Gibt die Seitenlaengen, sowie die Flaeche und das Volumen aus
	public void anzeigen() {
	     System.out.println("Flaeche: "    + berechneOberflaeche() +
                 " Volumen: " + berechneVolumen()  );
	     System.out.println("Laenge: "+laenge);	
	     System.out.println("Hoehe : "+hoehe);	
	     System.out.println("Breite: "+breite);	
	}
	
	//Berechnet das Volumen der Box
	public double berechneVolumen() {
	    return breite * laenge * hoehe;	
	}
	
	//Berechnet die Oberflaeche der Box
	public double berechneOberflaeche() {
	    return 2 * berechneOberflaecheVorn() +
	    	   2 * berechneOberflaecheOben() +
	    	   2 * berechneOberflaecheSeitlich();
	}
	
	//Gibt die Laenge der Box aus
	public double getLaenge() {
		return laenge;
	}

	//Gibt die Hoehe der Box aus
	public double getHoehe() {
		return hoehe;
	}
	
	//Gibt die Breite der Box aus
	public double getBreite() {
		return breite;
	}
	
	//Vergroeﬂert die Box um 25%
	public Box  groessereBox() {
		return new Box(1.25*breite, 1.25*hoehe, 1.25*this.laenge);
	}

	//Verkleinert die Box um 25%
	public Box  kleinereBox() {
		return new Box(0.75*breite, 0.75*hoehe, 0.75*this.laenge);
	}
	
	//‹berprueft, ob die innere Box in die aeuﬂere Box passt
	public boolean passtIn(Box aeussereBox ) {
		if(breite<aeussereBox.getBreite() &&
		   hoehe<aeussereBox.getHoehe()   &&
		   laenge<aeussereBox.getLaenge()) {
		  return true;
		}
		return false;
	}
}
