package Übungsblatt.Aufgabe3;

public class Kunde {

	String name;
	String mailAdresse;

	public Kunde(String name, String mailAdresse) {

		super();
		this.name = name;
		this.mailAdresse = mailAdresse;
	}

	public String toString() {

		return "Dein Name: " + name + "\nDeine Mail: " + mailAdresse;
	}

	public boolean equals(Kunde kunde2) {
		return this.name.equals(kunde2.name) && this.mailAdresse.equals(kunde2.mailAdresse);
	}

}
