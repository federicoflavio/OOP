package beispieleVL;

public class MittelwertBerechnen {

	public static void main(String[] args) {
		
		int zahl1 = 10;
		int zahl2 = 5;
		
		double schnitt = berechneMittelwert(zahl1, zahl2);
		
		System.out.println("Der Mittelwert ist: " + schnitt);
		

	}
	
	static double berechneMittelwert(int kommazahl1, int kommazahl2) {
		
		double schnitt = (kommazahl1 + kommazahl2) / 2;
		
		return schnitt;
	}

}
