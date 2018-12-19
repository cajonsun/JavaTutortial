package Teil04;

import java.util.Scanner;
import java.util.Random;

public class Zufallszahlen {

	public static void main(String[] args) {
		aufgabe1();
	}
	
	public static void beispiel() {
	    Scanner scan = new Scanner( System.in );
	    Random  rand = new Random();

	    while ( true )
	    {
	      System.out.print("Ihr Wurf ist eine " + (rand.nextInt(6)+1) );
	      String zeile = scan.nextLine();
	    }
		   
		    
	}	public static void aufgabe1() {
		Scanner scan	= new Scanner(System.in);
		Random	rand 	= new Random();
		int spielerz;
		int zaehler  	= 1;
		boolean abfrage = false;
		
		System.out.println("Ich denke an eine Zahl zwischen 1 und 10.");
		int zufallz = rand.nextInt(10)+1;
		System.out.println("Sie haben 3 Versuche diese Zahl zu erraten.");
		System.out.println("Raten Sie!");
		
		while (zaehler < 4 && abfrage == false) {
			System.out.println("Versuch: "+zaehler);
			
			spielerz = scan.nextInt();
			if (spielerz == zufallz) {
				System.out.println("Richtig");
				System.out.println("Sie haben das Spiel gewonnen");
				abfrage = true;
			} else {
				System.out.println("Falsch");
			}
			
			zaehler++;
		}
		
		if (abfrage == false) {
			System.out.println("Die richtige Zahl war "+zufallz);
			System.out.println("Sie haben das Spiel verloren");
		}
		
	}
	
}
