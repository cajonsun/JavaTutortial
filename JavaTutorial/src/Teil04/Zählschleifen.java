package Teil04;

import java.util.Scanner;

public class Zählschleifen {
	
	public static void main(String[] args) {
		aufgabe3();
	}
	
	public static void aufgabe1() {
		Scanner scan = new Scanner(System.in);
		int zahl; 
		int sum = 0;
		
		System.out.println("Wie viele Integer sollen addiert werden: ");
		int mengeI = scan.nextInt();
		
		for (int i = 0; i < mengeI; i++) {
			System.out.println("Geben Sie einen Integer ein:");
			zahl = scan.nextInt();
			sum = sum + zahl;
		}
		
		System.out.println("Die Summe ist "+sum);
		scan.close();
	}
	
	public static void aufgabe2() {
		int n = 4;
		double summe = 0;
		for (int i = 1; i < n+1; i++) {
			summe = summe + 1.0/i; 
		}
		System.out.println("Die Summe ist: "+summe);
	}
	
	public static void aufgabe3() {
		Scanner scan = new Scanner(System.in);
		double durchschn 	= 0;
		double durchschnH2 	= 0;
		double durchschnQ 	= 0;
		double SD;
		int zahl;
		
		System.out.println("Wie viele Zahlen sollen eingelesen werden: ");
		int N = scan.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.println("Geben Sie einen Integer ein:");
			zahl = scan.nextInt();
			durchschn = durchschn + zahl;
			durchschnQ = durchschnQ + zahl*zahl; 
		}
		
		durchschn	= durchschn/N;
		durchschnH2	= durchschn*durchschn;
		durchschnQ	= durchschnQ/N;
		
		System.out.println(durchschn+" "+durchschnQ);
		SD = Math.sqrt(durchschnQ-durchschnH2);
		System.out.println("Die Standardabweichung ist: "+SD);
	}
}
