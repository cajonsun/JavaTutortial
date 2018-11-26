package javaTutorial_Teil6;
/**
 * Aufgaben zu Objekte
 * @author Ole
 *
 */
 class Plaetzchen {
		
	public static void main(String[] args) {
		Plaetzchen p1 = new Plaetzchen();
		Plaetzchen p2 = new Plaetzchen();
		Plaetzchen p3 = new Plaetzchen();
		
		p1.sorte		= new String("Kokos");
		p1.groesse		= "mittel";
		p1.form			= "rund";
		p1.verzierung	= false;
		
		p2.sorte		= "Affennuss";
		p2.groesse		= "klein";
		p2.form			= "rund";
		p2.verzierung	= false;
		
		p3.sorte		= "Honigkuchen";
		p3.groesse		= "gross";
		p3.form			= "rechteckig";
		p3.verzierung	= true;
		
		System.out.println("+++Plaetzchenliste+++");
		p1.ausgeben();
		p2.ausgeben();
		p3.ausgeben();
	}
	
	
	String sorte, groesse, form, verz;	
	boolean verzierung;
	
	public void ausgeben() {
		if (verzierung) {
			verz = new String("ja");
		}
		else {
			verz = new String("nein");
		}
		System.out.print("Sorte "+sorte);
		System.out.print(", Groesse "+groesse);
		System.out.print(", Form "+form);
		System.out.println(", Verzierung "+verz);
	}
}
