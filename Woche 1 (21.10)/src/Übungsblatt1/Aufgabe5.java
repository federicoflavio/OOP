package Übungsblatt1;

public class Aufgabe5 {

	public static void main(String[] args) {
		
		double Auto1 = 20000 + 500 + (8.6/100) * 125000 * 1.5;					// Kostenrechnung Auto 1
		double Auto2 = 25000 + 1240 + (5.4/100) * 5.4 * 1.3;					// Kostenrechnung Auto 2
		double Auto3 = 60000 - 4000 + 820 + (21.25/100) * 125000 * 0.25;			// Kostenrechnung Auto 3
				
				
		System.out.printf("Gesamtkosten Auto 1: %n%.2f Euro!", Auto1);			//Ausgabe Gesamtkosten Auto 1
		System.out.printf("%nGesamtkosten Auto 2: %n%.2f Euro!", Auto2);		//Ausgabe Gesamtkosten Auto 2
		System.out.printf("%nGesamtkosten Auto 3: %n%.2f Euro!", Auto3);		//Ausgabe Gesamtkosten Auto 3
		
		int kostenlostanken = 400/60;
		System.out.printf("%nHerr Müller dürfte zusätzlich mit Auto 3 %d-mal kostenlos tanken gehen!", kostenlostanken);
		
	}

}

