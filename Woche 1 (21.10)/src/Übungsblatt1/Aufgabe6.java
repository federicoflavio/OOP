package Übungsblatt1;

import java.util.Scanner;

public class Aufgabe6 {

	public static void main(String[] args) {
		
		Scanner KBM = new Scanner(System.in);														// Scanner starten
		
		System.out.printf("Wie viel Meter Kabel hast du diese Woche verlegt?:%n");					// verlegtes Kabel als Input speichern
		double input_kabel = KBM.nextDouble();
		
		System.out.printf("Wie viele Stunden hast du diese Woche gearbeitet?:%n");					// Arbeitsstunden als Input speichern
		double input_stunden = KBM.nextDouble();
		
		double kabelpreis = input_kabel * 2;														// Preiserrechnung verlegtes Kabel
		double stundensatz = input_stunden * 50;													// Preiserrechnung Arbeitslohn
		
		System.out.printf("Der Kabelpreis dieser Woche beträgt:%n%.2f Euro!", kabelpreis);				
		System.out.printf("%nDer Arbeitslohn dieser Woche beträgt:%n%.2f Euro!", stundensatz);		// Ausgabe Kabelpreis + Stundensatz	

		System.out.printf("%nDer Wochenumsatz beträgt damit %.2f Euro!", kabelpreis + stundensatz); // Errechnung Wochenumsatz
		
		
		KBM.close();																				// Scanner schließen
	}

}