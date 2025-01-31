package beispieleVL;

import java.text.DecimalFormat;

public class decimalFormat {

	public static void main(String[] args) {
		
		double zahl = 13.97593;
		
		DecimalFormat zweiNachkommastellen = new DecimalFormat("#.##");
		
		System.out.println("Gewählte Zahl: " + zahl + " lautet gerundet: " + zweiNachkommastellen.format(zahl));
		
		DecimalFormat vierVorUndNachkommastellen = new DecimalFormat("0000.0000");
		
		System.out.println("mit vier Vor- und Nachkommastellen: " + vierVorUndNachkommastellen.format(zahl));

	}

}
