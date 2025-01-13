package Übungsblatt.Aufgabe2;

public class OneDay {

	private int tag, jahr;
	private String monat;

	public OneDay(int tag, int jahr, String monat) {

		super();

		String[] gueltigeMonate = { "Jan", "Feb", "Mrz", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov",
				"Dez" };

		boolean zaehler = false;
		for (String aktuellerMonat : gueltigeMonate) {
			
			if (monat == aktuellerMonat) {
				zaehler = true;
				break;
			}

		}
		
		if (!zaehler) {
			
			System.out.println("Fehler, m8");
		}

		this.tag = tag;
		this.jahr = jahr;
		this.monat = monat;

		// to-do monat auf 3 buchstaben beschränken?

	}

	public int getTag() {

		return tag;
	}

	public String getMonat() {

		return monat;
	}

	public int getJahr() {

		return jahr;
	}
	
	public void displayDate() {
		
		System.out.println("Tag: " + tag + "\nMonat: " + monat + "\nJahr: " + jahr);
		
	}
}
