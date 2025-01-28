package beispieleVL.arrayList;
import java.util.ArrayList;

public class listeEinkauf {

	public static void main(String[] args) {
		
		ArrayList<String> listeEinkauf = new ArrayList<String>();
		
		listeEinkauf.add("Bananen");
		listeEinkauf.add("Butter");
		
		System.out.println("Einkaufsliste: ");
		for (int i = 0; i < listeEinkauf.size(); i++) {
			
			System.out.println(listeEinkauf.get(i));
			
		}
			
	}

}
