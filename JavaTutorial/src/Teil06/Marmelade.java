package Teil06;

public class Marmelade {

	  // Instanzvariablen
	  private String inhalt;   // Art der Frucht im Glas
	  private String datum;   // Datum des Abfüllens
	  private int menge;       // Menge der Marmelade im Glas

	  // Konstruktor
	  public Marmelade( String inhalt, String datum, int menge )  {
	    this . inhalt = inhalt;
	    this . datum  = datum;
	    this . menge  = menge;
	  }

	  // Methoden
	  public boolean istLeer() {
	    return ( menge == 0 );
	  }
	  
	  public int mengeAusgabe() {
		  return menge;
	  }

	  public void ausgeben()  {
	    System.out.println ( inhalt + "   " +  datum + "   " +  menge + " Unzen." );
	  }

	  public void auftragen ( int unzen)  {
	    if ( !istLeer() ) {
	      if ( unzen <= menge ) {
	        System.out.println("Auftragen von " + unzen + " Unzen "
	            + inhalt+"marmelade" );
	        menge = menge - unzen;
	      }
	      else {
	        System.out.println("Auftragen von  " + menge + " Unzen "
	            + inhalt+"marmelade" );
	        menge =  0;
	      }
	    }
	    else
	       System.out.println("Keine Marmelade im Glas!");
	    }

}
