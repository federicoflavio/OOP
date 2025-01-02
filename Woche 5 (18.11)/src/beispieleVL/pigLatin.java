package beispieleVL;

public class pigLatin {

	static String translateWord(String wort) {

		char anfangsBuchstabe = wort.charAt(0);
		String cutWort = wort.substring(1);

		String neuesWort = cutWort + anfangsBuchstabe + "ay";

		return neuesWort;
	}
	
	static String[] translateSentence(String satz) {
		
		String[] woerter = satz.split(" ");
		
		String[] satzListe = new String[woerter.length];
		for (int i = 0; i < woerter.length; i++) {
			
			String uebersetztesWort = translateWord(woerter[i]);
			satzListe[i] = uebersetztesWort;
	
		}
		return satzListe;
	}
	

	static String joinWords(String[] words) {
		
		String satz = "";
		for (int i = 0; i < words.length; i++) {
			
			satz = satz + words[i] + " ";
			
			
		}
		return satz;
	}

	public static void main(String[] args) {

		String WORT = "Hallo";
	
		String wortLower = WORT.toLowerCase();
		System.out.println(translateWord(wortLower));
		
		String SATZ = "Ankara Messi Gol!";
		String satzLower = SATZ.toLowerCase();
		
		System.out.println(joinWords(translateSentence(satzLower)));
	}

}
