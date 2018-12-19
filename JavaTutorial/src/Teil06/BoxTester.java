package Teil06;

public class BoxTester {

	  public static void main ( String[] args )
	  {

	     // eine Box mit den Seiten 2.5, 3.0 und 5.0 erzeugen
		   
	     Box box1 = new  Box( 3.5, 5.0, 6.0 );
	     Box box2 =  new Box (7.0);
	     
	     box1.anzeigen();
	     box2.anzeigen();
	     
//	     box1.groessereBox();
//	     box1.anzeigen();
//
//	     box1 = box1.groessereBox();
//	     box1.anzeigen();
	     
	     if( box1.passtIn(box2)) {
	    	 System.out.println("Sie passen ineinander");
	     } else {
	    	 System.out.println("Sie passen nicht ineinander");
	     }
	     
//	     box2.anzeigen();
	     
	     // eine Box mit gleichen Seiten von 3.0 erzeugen

//	     Box box2 =  new Box (3.0);
//
//	     System.out.println( "Box2 Flaeche: "    + box2.berechneOberflaeche() +
//	                         "  Volumen: " + box2.berechneVolumen()  );


	  }
}
