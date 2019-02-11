package Teil10_Karte;

import java.util.Scanner;

public class Kartentester {
	public static void main(String[] args) {

	    Feiertag   feiern = new Feiertag( "Ole","Lieber" );
	    feiern.gruss();

	    Geburtstag  geb  = new Geburtstag( "Gustav","Lieber", 21 );
	    geb.gruss();

	    Valentin val = new Valentin( "Lina","Liebe", 7 );
	    val.gruss();	
	}
}
