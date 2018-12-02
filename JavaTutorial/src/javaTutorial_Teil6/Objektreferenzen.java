package javaTutorial_Teil6;

import java.util.Scanner;

public class Objektreferenzen {

	public static void main(String[] args) {
		aufgabe2();
	}
	
	public static void aufgabe1() {
		String str1 = "Bo, die Katze";
		String str2 = "Bo, die Katze";
		String str3 = new String("Fred,der Hund");
		String str4 = new String("Fred,der Hund");
		int anzahl  = 0;
		if (str1==str2) {
			System.out.println("str1 und str2 verweisen auf dasselbe Objekt");
			anzahl = anzahl+1;
		}
		else {
			anzahl = anzahl+2;
		}
		
		if (str3==str4) {
			System.out.println("str3 und str4 verweisen dasselbe Objekt");			
			anzahl = anzahl+1;
		}
		else {
			anzahl = anzahl+2;
		}
		System.out.println("Es wurden "+anzahl+" Objekte erzeugt");
	}
	
	public static void aufgabe2() {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		String antwort = "ja";
		System.out.println("Eingabeaufforderung <ja> oder <nein>?");
		String eingabe = scan.nextLine();
		
		for (int i = 0; i < 5; i++) {
			if (eingabe.equals(antwort)) {
				System.out.println("Geben Sie die "+(i+1)+". Zahl ein:");
			}
			int zahl = scan.nextInt();
			sum = sum+zahl;
		}
		System.out.println("Gesamtsumme:" +sum);
		scan.close();
	}
}
