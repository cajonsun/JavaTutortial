package javaTutorial_Teil6;

public class BankkontoTester {
	  public static void main( String[] args )
	  {
	    Bankkonto konto1 = new Bankkonto( "999", "Bob", 100 );
	    Bankkonto konto2 = new Bankkonto( "111", "Jill", 500 );
	    
	    konto1.verarbeiteAuszahlung(50);
	    konto1.verarbeiteEinzahlung(150);
	    konto1.verarbeiteAuszahlung(50);

	    konto2.verarbeiteEinzahlung(500);
	    konto2.verarbeiteAuszahlung(100);
	    konto2.verarbeiteAuszahlung(100);
	    konto2.verarbeiteEinzahlung(100);
	    
	    konto1.anzeigen();
	    konto2.anzeigen();
	  }
}
