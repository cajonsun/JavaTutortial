package Teil06;

import java.awt.Point;
import java.util.Scanner;

public class Objekte2 {

	public static void main(String[] args) {
		aufgabe1();
	}
	
	public static void aufgabe1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Wert x1:");
		int x1 = scan.nextInt();		
		System.out.println("Wert x2:");
		int x2 = scan.nextInt();
		System.out.println("Wert y1:");
		int y1 = scan.nextInt();		
		System.out.println("Wert y2:");
		int y2 = scan.nextInt();
		
		Point a = new Point(x1,y1);
		Point b = new Point(x2,y2);
		
		if(a.equals(b)) {
			System.out.println("Die Koordinaten der beiden Punkte sind gleich:");
			System.out.println(a.toString()+" und "+b.toString());
		}
		
		if(a==b) {
			System.out.println("Die Referenzen der beiden Variablen sind gleich:");
		} else {
			System.out.println("Sie haben unterschiedliche Referenzen");
		}
			
	}
	
}
