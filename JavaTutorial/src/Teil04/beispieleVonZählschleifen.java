package Teil04;

import java.util.Scanner;


public class beispieleVonZählschleifen {
	public static void main(String[] args) {
		aufgabe4();
	}
	
	public static void beispiel() {
		//Anwender gibt einen Wert N ein
		//Addieren der geraden, ungeraden und 
		//aller Integer von 0 bis N
	
		Scanner scan = new Scanner(System.in);
		int n, summeAlle = 0, summeGerade = 0, summeUngerade = 0;

		System.out.println("Geben Sie den Grenzwert ein:");
		n = scan.nextInt();

		int zaehler = 0;
		while (zaehler <= n) {
			summeAlle = summeAlle + zaehler;

			if (zaehler % 2 == 0)
				summeGerade = summeGerade + zaehler;

			else
				summeUngerade = summeUngerade + zaehler;

			zaehler = zaehler + 1;
		}

		System.out.print("Summe aller: " + summeAlle);
		System.out.print("\tSumme der geraden: " + summeGerade);
		System.out.println("\tSumme der ungeraden: " + summeUngerade);
	}
	
	public static void aufgabe1() {
		Scanner scan = new Scanner(System.in);
		int sumQ	= 1;
		int sumK	= 1;
		
		System.out.println("Geben Sie n ein");
		int n = scan.nextInt();
		
		while (n>1) {
			sumQ = sumQ+n*n;
			sumK = sumK+n*n*n;
			n--;
		}
		
		System.out.println("Die Quadratsumme ist:\t"+sumQ);
		System.out.println("Die Kubuksumme ist:\t"+sumK);
	}

	public static void aufgabe2() {
		Scanner scan = new Scanner(System.in);
		double x;
		double ergebnis;
		int n; 
		
		System.out.println("Geben Sie einen WErt für x ein:");
		x = scan.nextDouble();
		System.out.println("Geben sie einen WErt für n ein:");
		n = scan.nextInt();
		
		ergebnis = x;
		while (n>1) {
			ergebnis = ergebnis*x;
			n--;
		}
		
		System.out.println(x+" hoch "+n+" ergibt: "+ergebnis);
	}
	
	public static void aufgabe3() {
		Scanner scan = new Scanner(System.in);
		int stern;
		
		System.out.println("Anfangszahl der Sterne:");
		int anzahl = scan.nextInt();
		
		while (anzahl>0) {
			stern = anzahl;
			while (stern>0) {
				System.out.print("*");
				stern--;
			}
			System.out.println();
			anzahl--;
		}
	}
	
	public static void aufgabe4() {
		int anzahl	= 15;
		int start 	= anzahl/2;
		int stern	= anzahl%2;
		
		while (stern<=15) {
			int leer = 0;
			while (leer<start) {
				System.out.print(" ");
				leer++;
			}
			start--;
			
			for (int i = 0; i < stern; i++) {
				System.out.print("*");
			}
			System.out.println();
			stern = stern+2;
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(" ");
			}
			System.out.println("***");
		}
	}
}
