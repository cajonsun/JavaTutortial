package Teil10_Haustier;

public class HaustierTester {

	public static void main(String[] args) {
		Haustiere minka 	= new Katze("Minka",5.0,1);
		Haustiere strolchie = new Hund("Strolchie",5.0,2);
		
		minka.fuettern();
		minka.anzeigen();
		strolchie.fuettern();
		strolchie.anzeigen();
	}
}
