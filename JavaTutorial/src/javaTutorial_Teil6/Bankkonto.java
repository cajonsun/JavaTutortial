package javaTutorial_Teil6;

public class Bankkonto {
	  // Instanzvariablen
	  String kontonummer;
	  String kontoinhaber;
	  int    kontostand;

	  // Konstruktoren
	  Bankkonto( String ktoNummer, String ktoInhaber, int start )
	  {
	    kontonummer  = ktoNummer;
	    kontoinhaber = ktoInhaber;
	    kontostand   = start;
	  }

	  // Methoden
	  int aktuellerKontostand()
	  {
	    return kontostand;
	  }

	  void verarbeiteEinzahlung( int betrag )
	  {
	    kontostand = kontostand + betrag;
	  }

	  void verarbeiteAuszahlung( int betrag )
	  {
	    int gebuehr;
	    if ( kontostand < 100000 )
	      gebuehr = 15;
	    else
	      gebuehr = 0;

	    kontostand = kontostand - betrag - gebuehr;
	  }
	  
	  void anzeigen() 
	  {
		System.out.println("Kontonr.: "+kontonummer+"\t"+kontoinhaber+"\t"+(kontostand/100)+","+(kontostand%100)+"€");  
	  }
}

