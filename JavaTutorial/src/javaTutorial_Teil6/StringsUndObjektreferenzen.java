package javaTutorial_Teil6;

import java.util.Scanner;

public class StringsUndObjektreferenzen {
	
	public static void main(String[] args) {
		aufgabe3();
	}
	
	public static void aufgabe1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie einen String ein:");
		String str = scan.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public static void aufgabe2() {
		Scanner scan = new Scanner(System.in);
		String name = "a";
		boolean abfrage = true;
		while (abfrage) {
			System.out.println("Geben Sie einen Namen ein:");
			name = scan.nextLine();
			if (name.length()<1) {
				abfrage = false;
			} else {
				if(name.startsWith("Amy") || name.startsWith("Buffy") || name.startsWith("Cathy")) {
					System.out.println("Ms. "+name);
				}
				else if(name.startsWith("Elroy") || name.startsWith("Fred") || name.startsWith("Graham")) {
					System.out.println("Mr. "+name);
				}
				else {
					System.out.println(name);
				}
			}	
		}				
	}
	
	public static void aufgabe3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie ihren Namen ein:");
		String name = scan.nextLine();
		char zeichen = 'a';
		int stelle = 0;

		while (zeichen != ' ') {
			zeichen = name.charAt(stelle);
			stelle++;
		}
		
//		while (name.charAt(stelle) != ' ') {
//			stelle++;			
//		}
		
		System.out.println(name.substring(0, stelle)+name.toUpperCase().substring(stelle, name.length()));
	}
}
