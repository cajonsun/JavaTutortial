package Teil06;

public class Vorratskammer {
	  // Instanzvariablen
	  private Marmelade  glas1;
	  private Marmelade  glas2;
	  private Marmelade  glas3;
	  private Marmelade  glasAusgewaehlt;

	  // Konstruktor
	  public Vorratskammer( Marmelade glas1)  {
	    this . glas1    = glas1;
	    glas2		    = null;
	    glas3 			= null;
	    glasAusgewaehlt = null;
	  }
	  
	  public Vorratskammer( Marmelade glas1, Marmelade glas2)  {
		  this . glas1    = glas1;
		  this . glas2    = glas2;
		  glas3 		  = null;
		  glasAusgewaehlt = null;
	  }

	  // Methoden
	  public void ausgeben() {
		System.out.println("\nDie Vorratskammer enthaelt:");
	    System.out.print("1: "); glas1 . ausgeben();
	    if (glas2 != null) {
	    	System.out.print("2: "); glas2 . ausgeben();
		}
	  }

	  // wir setzen voraus, dass der Anwender eine richtige Auswahl trifft, 1, 2, oder 3
	  public boolean auswaehlen( int glasNummer ) {
	    if (glasNummer>0 && glasNummer<3) {
	    	if ( glasNummer == 1 )
	    		glasAusgewaehlt = glas1;
	    	else 
	    		glasAusgewaehlt = glas2;
	    	return true;
		}
	    else {
			return false;
		}
	  }

	  // Auftragen der ausgewählten Marmelade
	  public void auftragen( int unzen  ) {
	    glasAusgewaehlt . auftragen( unzen  );
	  }
	  
	  //Ersetzen eines Glases durch ein anderes
	  public void ersetzen(Marmelade m, int slot) {
		  if(slot == 1) 
			  glas1 = m;
		  else
			  glas2 = m;
	  }
	  
	  public boolean mengenAbfrage() {
		  return glas1.mengeAusgabe()<3 && glas2.mengeAusgabe()<3; 
	  }
	  
	  public void gemischteFruechte() {
		  int gesmenge = glas1.mengeAusgabe()+glas2.mengeAusgabe();
		  glas1 = new Marmelade("Gemischte Fruechte", "19.01.11", gesmenge);
		  glas2 = null;
	  }
}
