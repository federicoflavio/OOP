package beispieleVL;

public class methoden_strings {

	static void laengeAusgeben(String text) {

		int länge = text.length();
		System.out.println(länge);

	}
	
	static void wortSuchen(String text, String wort) {
		
		int position = text.indexOf(wort);
		System.out.println(position);
		
	}
	
	static void drittesZeichen(String text) {
		
		char x = text.charAt(2);
		System.out.println(x);
		
	}
	
	static void textTrennen(String text) {
		
		String[] trennung = text.split(" ");
		
		for (int i = 0; i < trennung.length; i++) {
			
			System.out.println(trennung[i]);
			
		}
		
	}
	

	public static void main(String[] args) {

		String text = "Dies ist ein Beispieltext!";
		String gesuchtesWort = "ein";
		laengeAusgeben(text);
		wortSuchen(text, gesuchtesWort);
		drittesZeichen(text);
		textTrennen(text);

	}

}
