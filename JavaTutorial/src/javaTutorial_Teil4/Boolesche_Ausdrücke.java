package javaTutorial_Teil4;

public class Boolesche_Ausdr�cke {

	public static void main(String[] args) {
		beispiel();
	}
	
	public static void beispiel() {
		int bargeld = 150;
		int kredit	= 20000;
		
		//Eine Und-Funktion
		if( bargeld>200 && kredit>10000) {			
			System.out.println("Du hast gen�gend Geld");
		}
		
		//Eine Oder-Funktion
		if(bargeld>200 || kredit>10000)
			System.out.println("Du hast entweder gen�gend Bargeld oder gen�gend Kredit");
		
		//Eine Negierung
		if (bargeld != 200)
			System.out.println("Bargeld ist nicht gleich 200");
		
		if (!(bargeld>200)) {
			System.out.println("Du hast zu wenig Geld");
		}
	}
	

}	
