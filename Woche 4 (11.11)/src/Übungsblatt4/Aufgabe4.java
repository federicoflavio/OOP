package Übungsblatt4;

import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {

//		Scanner initialisieren & Array anlegen
		Scanner eingabe = new Scanner(System.in);
		int[] urlaubsAnspruch = {15, 20, 25, 30};

		System.out.println("Urlaubsanspruch - Bitte Firmenzugehörigkeit angeben (in Jahren): ");
		int firmenZugehörigkeit = eingabe.nextInt();

		if (firmenZugehörigkeit == 0 || firmenZugehörigkeit == 1) {
			System.out.println("Ihr Urlaubsanspruch beträgt: " + urlaubsAnspruch[0] + " Tage!");
		}

		else if (firmenZugehörigkeit == 2 || firmenZugehörigkeit == 3) {

			System.out.println("Ihr Urlaubsanspruch beträgt: " + urlaubsAnspruch[1] + " Tage! ");

		}

		else if (firmenZugehörigkeit == 2 || firmenZugehörigkeit == 3) {

			System.out.println("Ihr Urlaubsanspruch beträgt: " + urlaubsAnspruch[1] + " Tage! ");

		}

		else if (firmenZugehörigkeit == 4 || firmenZugehörigkeit == 5) {

			System.out.println("Ihr Urlaubsanspruch beträgt: " + urlaubsAnspruch[2] + " Tage! ");

		}

		else if (firmenZugehörigkeit >= 6) {

			System.out.println("Ihr Urlaubsanspruch beträgt: " + urlaubsAnspruch[3] + " Tage! ");

		}
		eingabe.close();
	}

}
