package javaTutorial_Teil4;

import java.util.Scanner;

public class Überwachungsgesteuerte_Schleifen {
	
	public static void main(String[] args) {
		aufgabe4();
	}
	
	public static void aufgabe1() {
		Scanner scan = new Scanner(System.in);
		double ergebnis;
		System.out.println("Programm Meilen pro Gallone");
		int anfang = 0;

		
		while (anfang != -1) {
			System.out.println("Anfangsstand Meilen:");
			anfang	= scan.nextInt();
		
			if (anfang != -1) {
				System.out.println("Endstand Meilen:");
				int ende	= scan.nextInt();
		
				System.out.println("Gallonen:");
				double gallone	= scan.nextInt();
			
				ergebnis = (ende-anfang)/gallone;
				System.out.println("Meilen pro Gallone: "+ergebnis);	
			}

		}
		System.out.println("bye");
	}
	
	public static void aufgabe2() {
		Scanner scan = new Scanner(System.in);
		int x =1;
		int ergebnisA = 0;
		int ergebnisI = 0;
		
		System.out.println("Bereiche addieren");
		
		System.out.println("Untergrenze des Bereichs:");
		int unterg = scan.nextInt();
		
		System.out.println("Obergrenze des Bereichs:");
		int oberg = scan.nextInt();
		
		while (x != 0) {
			System.out.println("Daten eingeben:");
			x = scan.nextInt();
			
			if (x<unterg || x>oberg) {
				ergebnisA = ergebnisA+x;
			} else {
				ergebnisI = ergebnisI+x;
			}
		}
		
		System.out.println("Summe der Werte innerhalb des Bereichs: "+ergebnisI);
		System.out.println("Summe der Werte außerhalb des Bereichs: "+ergebnisA);		
	}
	
	public static void aufgabe3() {
		Scanner scan = new Scanner(System.in);
		int gewichtZ;
		int gewicht = 1;
		double versandk = 3;
		
		while (gewicht>0) {
			System.out.println("Gewicht der Sendung:");
			gewicht = scan.nextInt();
			
			if (gewicht>0) {
				if (gewicht<=10) {
					System.out.println("Versandkosten: $"+versandk);
				}
				else {
				gewichtZ = gewicht-10;
				versandk = versandk+gewichtZ*0.25;
				System.out.println("Versandkosten: $"+versandk);
				}
			}
		}
		
		System.out.println("bye");
	}
	
	public static void aufgabe4() {
		Scanner scan = new Scanner(System.in);
		System.out.println("CAD Programm");
		int hoehe	= 1;
		int breite	= 1;
		
		while (hoehe != 0 && breite != 0) {
			System.out.println("Erster Eckpunkt X-Koordinate:");
			int x1 = scan.nextInt();
			
			System.out.println("Erster Eckpunkt Y-Koordinate:");
			int y1 = scan.nextInt();
			
			System.out.println("Zweite Eckpunkt X-Koordinate:");
			int x2 = scan.nextInt();
			
			System.out.println("Zweite Eckpunkt X-Koordinate:");
			int y2 = scan.nextInt();
			
				if (y2<y1) {
					hoehe = y1-y2;
				}
				else {
					hoehe = y2-y1;
				}
				
				if (x2<x1) {
					breite = x1-x2;
				}
				else {
					breite = x2-x1;
				}
				
			int flaeche = breite*hoehe;
			System.out.println("Breite: "+breite+" Höhe: "+hoehe+" Fläche: "+flaeche);
		}
		System.out.println("bye");
	}
}
