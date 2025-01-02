package Übungsblatt4;

public class Aufgabe5 {

	static char asciiToSign(int ascii) {

		return (char) ascii;

	}

	public static void main(String[] args) {

		for (int i = 0; i <= 127; i++) {

			if (Character.isUpperCase(asciiToSign(i))) {

				System.out.println("Der Buchstabe: " + asciiToSign(i) + " hat die folgende Code-Nummer: " + i);

			}

		}

	}

}
