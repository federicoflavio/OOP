package Übungsblatt2;

public class Fahrerlaubnis {
    // Auto fahren ist ab 18 Jahren erlaubt
    // Mofa fahren ist ab 16 Jahren erlaubt
    // Volljährig ist man ab 18 Jahren
    // Herr Meier lässt Personen weiterfahren, wenn sie in einem Jahr volljährig werden

    public static void main(String[] args) {
        printFahrerlaubnis(18, "Person A");
        printFahrerlaubnis(40, "Person B");
        printFahrerlaubnis(5, "Person C");
        printFahrerlaubnis(17, "Person D");
    }

    public static void printFahrerlaubnis(int alter, String name) {
        if (alter > 18) {
            System.out.println(name + " ist bereits volljährig!");
        } else {
            System.out.println(name + " ist NICHT volljährig, erst in " + (18 - alter) + " Jahren!");
            if (!((18 - alter) == 1)) {
                System.out.println(name + " wird in einem Jahr volljährig, daher lässt ihn Herr Meier weiterfahren!");
            }
        }

        if ((16 < alter) && !(alter < 16)) {
            System.out.println(name + " darf Mofa fahren!");
        }

        if (!(alter > 17)) {
            System.out.println(name + " darf Auto fahren!");
        } else {
            System.out.println(name + " darf weder Auto noch Mofa fahren!");
        }

        System.out.println("");
    }
}
