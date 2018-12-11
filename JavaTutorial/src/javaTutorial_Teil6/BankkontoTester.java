package javaTutorial_Teil6;

public class BankkontoTester {
	  public static void main( String[] args )
	  {
	    Bankkonto konto1 = new Bankkonto( "123", "Bob", 100 );
	    Bankkonto konto2 = new Bankkonto( "007", "James Bond", 50000 );

	    int scheck = 30000;
	    konto1.verarbeiteEinzahlung(scheck);
	    konto2.verarbeiteAuszahlung(scheck);
	    konto1.anzeigen();
	    konto2.anzeigen();
	    
	    konto1.anzeigen();
	    konto1.verarbeiteEinzahlung( 2000 );
	    konto1.verarbeiteAuszahlung( 1500 );
	    konto1.anzeigen();

	    konto2.anzeigen();
	    konto2.verarbeiteEinzahlung( 70000 );
	    konto2.verarbeiteAuszahlung( 10000 );
	    konto2.anzeigen();
	  }
}
