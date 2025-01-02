package beispieleVL;
import java.util.Scanner;

public class Jahreszeiten {

	public static void main(String[] args) {
		
		Scanner KBM = new Scanner(System.in);
		System.out.printf("Gib bitte einen Monat an! (Januar entspricht 1, Juni 6, Dezember 12...):%n");
		int Monat = KBM.nextInt();
		
		if (Monat == 1) 
			System.out.println("Der Januar liegt im Winter!");
		
			else if (Monat == 2)
				System.out.println("Der Februar liegt im Winter!");
			
			else if (Monat == 3)
				System.out.println("Der März liegt im Frühling!");
			
			else if (Monat == 4)
				System.out.println("Der April liegt im Frühling!");	
		
			else if (Monat == 5)
				System.out.println("Der Mai liegt im Frühling!");	
			
			else if (Monat == 6)
				System.out.println("Der Juni liegt im Sommer!");
		
			else if (Monat == 7)
				System.out.println("Der Juli liegt im Sommer!");
		
			else if (Monat == 8)
				System.out.println("Der August liegt im Sommer!");
		
			else if (Monat == 9)
				System.out.println("Der September liegt im Herbst!");
		
			else if (Monat == 10)
				System.out.println("Der Oktober liegt im Herbst!");
		
			else if (Monat == 11)
				System.out.println("Der November liegt im Herbst!");
			
			else if (Monat == 12)
				System.out.println("Der Dezember liegt im Winter!");
		
		KBM.close();
	}

}
