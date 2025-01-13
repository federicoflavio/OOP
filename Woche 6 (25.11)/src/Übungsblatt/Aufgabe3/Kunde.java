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

	public boolean isEqual(Kunde kunde2) {
		return this.name == kunde2.name && this.mailAdresse == kunde2.mailAdresse;
	}

}
