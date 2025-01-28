package beispieleVL.arrayList;
import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		
		// erstellen einer Array-List
		ArrayList<String> listeWoerter = new ArrayList<String>();
		
		// hinzufügen von Elementen
		listeWoerter.add("One");
		listeWoerter.add("Two");
		listeWoerter.add("Three");
		
		// abfragen von Elementen
		String str = listeWoerter.get(2);
		System.out.println(str);
		
		// aktualisieren von Elementen
		listeWoerter.set(2, "Hi");
		
		// löschen von Elementen
		listeWoerter.remove(2);

	}

}
