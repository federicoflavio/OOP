package Übungsblatt2;

import java.util.Scanner;

public class Aufgabe6 {

	public static void main(String[] args) {

		Scanner eingabe = new Scanner(System.in);
		int Notenwert;
		

		while (true) {
			
			System.out.println("Bitte geben Sie eine Note von 1 - 6 ein!: ");
			Notenwert = eingabe.nextInt();

			switch (Notenwert) {
	
				case 1:
					System.out.println("sehr gut!");
					break;
	
				case 2:
					System.out.println("gut!");
					break;
	
				case 3:
					System.out.println("mittelmäßig!");
					break;
	
				case 4:
					System.out.println("ausreichend!");
					break;
	
				case 5:
					System.out.println("mangelhaft!");
					break;
	
				case 6:
					System.out.println("ungenügend!");
					break;
	
				case 0:
					System.out.println("Programm wird beendet!");
					eingabe.close();
					return;
	
				default:
					System.out.println("Ungültige Eingabe!");
					break;

			}

		}

	}

}
