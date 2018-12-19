package Teil06;

import java.awt.Point;

public class ParameterVonMethoden {
	
	public static void main(String[] args) {
		aufgabe2();
	}
	
	public static void aufgabe1() {
		Point pt1 = new Point(10,10);
		Point pt2 = new Point(30,30);
		
		int breite  = pt2.x-pt1.x;
		int hoehe   = pt2.y-pt1.y;		
		int flaeche = breite*hoehe;
		System.out.println("Die Flaeche betraegt: "+flaeche);
	}
	
	public static void aufgabe2() {
		Point pt1 	  = new Point(10,10);
		Point ptAlias = pt1;
		
		if (pt1 == ptAlias) {
			System.out.println("pt1 und ptAlias verweisen auf dasselbe Objekt\n");
		}
		
		System.out.println("Point pt1 vorher:\t"+pt1.toString());
		System.out.println("Point ptAlias vorher:\t"+ptAlias.toString()+"\n");
		
		System.out.println("Nur von ptAlias wurden die x- und y-Werte verdoppelt\n");
		ptAlias.x = ptAlias.x*2;
		ptAlias.y = ptAlias.y*2;
		
		System.out.println("Point pt1 nacher:\t"+pt1.toString());
		System.out.println("Point ptAlias nacher:\t"+ptAlias.toString()+"\n");
	}
}
