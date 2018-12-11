package javaTutorial_Teil6;

import java.util.Scanner;

public class HelloObject {
	String mit;
	
	public HelloObject() {}
	
	public HelloObject(String mit) {
		this.mit =  mit;
	}
	//Aufgabe1
	void sprich() {
		for (int i = 0; i < mit.length(); i++) {
			System.out.println(mit);
		}  
	}
	
	//Aufgabe2
	void sprichMorg() {
		System.out.println("Guten Morgen Welt");
	}
	
	void sprichAbend() {
		System.out.println("Guten Abend Welt");
	}
	
	//Aufgabe3
	void getEingabe() {
		System.out.println("Geben Sie eine Mitteilung ein:");
		Scanner scan = new Scanner(System.in);
		this.mit = scan.nextLine();
	}
	
	void sprichEingabe() {
			System.out.println(mit);
	}

	  public static void main ( String[] args ) {
		  
	    HelloObject einObjekt = new HelloObject();
	    einObjekt.getEingabe();
	    einObjekt.sprichEingabe();
	    
	  }
}
