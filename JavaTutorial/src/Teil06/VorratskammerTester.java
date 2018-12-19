package Teil06;

import java.util.Scanner;

public class VorratskammerTester {
	  public static void main ( String[] args ) {
		Scanner scan = new Scanner(System.in);
	    Marmelade stachelbeer = new Marmelade( "Stachelbeer", "04.07.09", 12 );
	    Marmelade erdbeer     = new Marmelade( "Erdbeer", "30.09.10", 8 );
	    int auswahl = 0;
	    
	    Vorratskammer vorrat = new Vorratskammer( stachelbeer, erdbeer);
	    System.out.println("Willkommen zu Mutter Hubbards Vorratskammer!");
	    vorrat.ausgeben();

	    while(true) {
		    System.out.println("Treffen Sie Ihre Auswahl (1 oder 2). Exit -1");
		    auswahl = scan.nextInt();
		    if (vorrat.auswaehlen(auswahl)) {
		    	System.out.println("Geben Sie die Menge ein, die aufgetragen werden soll:");
		    	int menge = scan.nextInt();
		    	vorrat.auswaehlen(auswahl);
		    	vorrat.auftragen(menge);
		    	vorrat.ausgeben();
			} 
		    else if (auswahl == -1) {
		    	System.out.println("Good Bye");
		    	break;
		    }
		    else {
		    	System.out.println("Sie haben eine falsche Eingabe gemacht."
		    			+ " Machen sie eine neue!");
		    }
		    
		    if (vorrat.mengenAbfrage()) {
		    	vorrat.gemischteFruechte();
		    	vorrat.ausgeben();
			}
		    
	    }
	    
	    Marmelade kirsch 	  = new Marmelade("Kirsch", "01.07.09", 11);
	    
	    vorrat.ersetzen(kirsch, 2);
	    vorrat.ausgeben();
	    System.out.println("Ende");
	  }
}
