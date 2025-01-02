package beispieleVL;

public class learn_switch {

	public static void main(String[] args) {
		
		String tag = "Pizza";
		
		switch(tag) {
		
			case "Montag": System.out.println("Es ist Montag!");
			break;
			
			case "Dienstag": System.out.println("Es ist Dienstag!");
			break;
			
			case "Mittwoch": System.out.println("Es ist Mittwoch!");
			break;
			
			case "Donnerstag": System.out.println("Es ist Donnerstag!");
			break;
			
			case "Freitag": System.out.println("Es ist Freitag!");
			break;
			
			case "Samstag": System.out.println("Es ist Samstag!");
			break;
			
			case "Sonntag": System.out.println("Es ist Sonntag!");
			break;
			
			default: System.out.println("Deine Eingabe entspricht keinem Tag der Woche!");
			
		}

	}

}
