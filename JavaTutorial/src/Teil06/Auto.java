package Teil06;

import java.util.Scanner;

public class Auto {
		  // Instanzvariablen
		  double startMeilen;   // Anfangsstand Tachometer
		  double endMeilen;     // Endstand Tachometer
		  double gallonen;      // verbrauchte Gallonen Benzin

		  // Konstruktor
		  Auto(  double startTacho, double endTacho, double galls  ) {
		    startMeilen = startTacho;
		    endMeilen   = endTacho;
		    gallonen    = galls;
		  }
		  
		  Auto(double startTacho) {
			startMeilen = startTacho;  
		  }

		  // Methoden
		  double berechneMPG() {
		    return (endMeilen - startMeilen) / gallonen ;
		  }

		  void auftanken(double aktTacho, double gallonen) {
			  this.gallonen  = gallonen;
			  this.endMeilen = aktTacho;
		  }
		  
		  boolean benzinschwein(double mpg) {
			 if (mpg<15) {
				return true;
			} 
			 return false;
		  }

		  boolean sparauto(double mpg) {
			 if (mpg>30) {
				return true;
			 } 
			 return false;
		  }
		  
		  public static void main( String[] args )  {
			Scanner scan = new Scanner(System.in);
			boolean progende = false;
			
			System.out.println("Geben Sie den Anfangsmeilenstand ein:");
			double startTacho = scan.nextDouble();
			Auto auto = new Auto( startTacho);
			
			while(progende == false) {
				System.out.println("+++ Besuch der Tankstelle +++");
				System.out.println("Aktuellen Tachometerstand eingeben:");
				double endTacho = scan.nextDouble();
				System.out.println("Anzahl der Galleonen fuer die Tankfuellung:");
				double galls = scan.nextDouble();
				auto.auftanken(endTacho, galls);
			    
				System.out.print( "Meilen pro Gallone: "
			        + auto.berechneMPG() );
			    if (auto.benzinschwein(auto.berechneMPG())) {
					System.out.println(" Autotyp: Benzinschwein!");
				}
			    if (auto.sparauto(auto.berechneMPG())) {
					System.out.println(" Autotyp: Sparauto!");
				}
			    
			    System.out.println("Programm beenden <j>ja <n>nein?");
			    String antwort = scan.next();
			    if(antwort.equals("j")) {
			    	progende = true;
			    } else {
			    	auto.startMeilen = auto.endMeilen;
			    }
			}
		  }
}

