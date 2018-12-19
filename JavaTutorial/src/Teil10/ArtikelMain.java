package Teil10;

public class ArtikelMain {
	public static void main(String[] args) {
		Artikel 	 art1 = new Artikel("SC123-F","DUFFY MALT WHISKEY",10,3);
		Sonderposten art2 = new Sonderposten("SC347-A","GLEN MORANGIE MALT WHISKEY",49,15);
		
		art1.anzeigen();
		art2.anzeigen();
	}
}
