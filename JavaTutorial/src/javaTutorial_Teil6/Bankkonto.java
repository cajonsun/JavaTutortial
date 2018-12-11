package javaTutorial_Teil6;

public class Bankkonto {
	  // Instanzvariablen
	  private String kontonummer;
	  private String kontoinhaber;
	  private int    kontostand;
	  private int	 zaehler = 0; //zaehlt wie oft das Bankkonto verwendet wird
	  
	  // Konstruktoren
	  public Bankkonto( String ktoNummer, String ktoInhaber, int start )
	  {
	    kontonummer  = ktoNummer;
	    kontoinhaber = ktoInhaber;
	    kontostand   = start;
	  }

	  // Methoden

	  private void inkrementZaehler() {
		  zaehler++;
	  }
	  
	  public int aktuellerKontostand()
	  {
		  return kontostand;
	  }
	  
	  public void verarbeiteEinzahlung( int betrag )
	  {
		inkrementZaehler();
	    kontostand = kontostand + betrag;
	  }

	  public void verarbeiteAuszahlung( int betrag )
	  {
	    int gebuehr;
	    inkrementZaehler();
	    if ( kontostand < 100000 )
	      gebuehr = 15;
	    else
	      gebuehr = 0;

	    kontostand = kontostand - betrag - gebuehr;
	  }
	  
	  public void anzeigen() 
	  {
		System.out.println("Kontonr.: "+kontonummer+"\t"+kontoinhaber+"\t"
				+(kontostand/100)+","+(kontostand%100)+"€\t"+zaehler);  
	  }
}

