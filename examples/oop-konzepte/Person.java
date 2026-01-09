/**
 * Person-Klasse demonstriert die Grundkonzepte der OOP
 *
 * Konzepte:
 * - Kapselung (private Attribute)
 * - Konstruktoren
 * - Getter und Setter
 * - Methoden
 */
public class Person {

    // === ATTRIBUTE (Eigenschaften) ===
    // private = Kapselung, Zugriff nur über Getter/Setter
    private String name;
    private int alter;
    private String adresse;

    // === KONSTRUKTOREN ===

    /**
     * Standard-Konstruktor (ohne Parameter)
     */
    public Person() {
        this.name = "Unbekannt";
        this.alter = 0;
        this.adresse = "Keine Angabe";
    }

    /**
     * Konstruktor mit Parametern
     * @param name Der Name der Person
     * @param alter Das Alter der Person
     */
    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
        this.adresse = "Keine Angabe";
    }

    /**
     * Vollständiger Konstruktor mit allen Parametern
     * @param name Der Name der Person
     * @param alter Das Alter der Person
     * @param adresse Die Adresse der Person
     */
    public Person(String name, int alter, String adresse) {
        this.name = name;
        this.alter = alter;
        this.adresse = adresse;
    }

    // === GETTER (Lesemethoden) ===

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public String getAdresse() {
        return adresse;
    }

    // === SETTER (Schreibmethoden) ===

    public void setName(String name) {
        this.name = name;
    }

    public void setAlter(int alter) {
        // Validierung: Alter muss positiv sein
        if (alter >= 0) {
            this.alter = alter;
        } else {
            System.out.println("Fehler: Alter kann nicht negativ sein!");
        }
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // === METHODEN (Verhalten) ===

    /**
     * Gibt eine Begrüßung aus
     */
    public void begruessung() {
        System.out.println("Hallo, mein Name ist " + name + ".");
    }

    /**
     * Lässt die Person älter werden
     */
    public void geburtstag() {
        alter++;
        System.out.println(name + " ist jetzt " + alter + " Jahre alt. Alles Gute zum Geburtstag!");
    }

    /**
     * Gibt alle Informationen der Person aus
     */
    public void zeigeInfo() {
        System.out.println("=== Person Info ===");
        System.out.println("Name: " + name);
        System.out.println("Alter: " + alter + " Jahre");
        System.out.println("Adresse: " + adresse);
        System.out.println("==================");
    }

    /**
     * toString-Methode für String-Repräsentation
     * @return String-Darstellung der Person
     */
    @Override
    public String toString() {
        return "Person{name='" + name + "', alter=" + alter + ", adresse='" + adresse + "'}";
    }
}
