package Teil04;

import java.util.Scanner;

public class Ergebnisgesteuerte_Schleifen {
	public static void main(String[] args) {
		aufgabe2();
	}
	
	public static void beispiel() {
		//math.abs ist der Betrag von dem ergebnis
		//also wenn dort -0,5 rauskommen würde, macht
		//der Befehl daraus 0,5
		double ergebnis = Math.abs(3-3.5);
		System.out.println(ergebnis);
	}
	
	public static void aufgabe1() {
		double schulden		= 1000.00;
		final double zinsen	= 0.015;
		int monat			= 1;
		int gesamtrueck		= 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie den monatlichen Betrag ein:");
		final int rueckzahlung = scan.nextInt();
		
		while (schulden >= 0) {
			schulden = schulden+(schulden*zinsen)-rueckzahlung;
			gesamtrueck = gesamtrueck+rueckzahlung;
			
			System.out.print("Monat: "+monat);
			System.out.print(" Saldo: "+schulden);
			System.out.println("\tGesamtbetrag: "+gesamtrueck);
			monat++;
		}
	}
	
	public static void aufgabe2() {
		double wirkg			= 100;
		final double verlust	= 0.04;
		int monat				= 0;
		System.out.print("Monat: "+monat);
		System.out.println(" Wirkstoffgehalt: "+wirkg);	
		
		while (wirkg >= 50) {
			wirkg = wirkg-(wirkg*verlust);
			monat++;
			
			System.out.print("Monat: "+monat);
			System.out.println(" Wirkstoffgehalt: "+wirkg);
		}
		System.out.println("Wirkstoff abgelaufen!!");
	}
}
