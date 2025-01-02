package Übungsblatt2;

import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		
		Scanner KBM = new Scanner(System.in);
		System.out.printf("Jugendschutzprüfung%nBitte Alter des Kunden angeben:%n");
		int KundeAlter = KBM.nextInt();
		
			switch (KundeAlter) {
			
				case 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15:
					System.out.println("Kein Verkauf von Alkohol!");
					break;
				
				case 16,17:
					System.out.println("Kunde darf Bier und Wein kaufen!");
					break;
					
				default: 
					if (KundeAlter >= 18) {
						System.out.println("Kunde darf jeden Alkohol kaufen!");
					
					} else { 
						
						System.out.println("Üngültige Altersangabe");
					
					}
					
					break;
					
			
			
			}		
			KBM.close();
	}					
}