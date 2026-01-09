/**
 * Student-Klasse demonstriert Vererbung
 *
 * Konzepte:
 * - Vererbung (extends Person)
 * - Erweiterung der Basisklasse
 * - super-Schlüsselwort
 * - Methodenüberschreibung (@Override)
 */
public class Student extends Person {

    // === ZUSÄTZLICHE ATTRIBUTE (spezifisch für Student) ===
    private String matrikelnummer;
    private String studiengang;
    private double durchschnittsnote;

    // === KONSTRUKTOREN ===

    /**
     * Standard-Konstruktor
     */
    public Student() {
        super(); // Ruft Konstruktor der Elternklasse (Person) auf
        this.matrikelnummer = "000000";
        this.studiengang = "Unbekannt";
        this.durchschnittsnote = 0.0;
    }

    /**
     * Konstruktor mit Basis-Parametern
     * @param name Name des Students
     * @param alter Alter des Students
     * @param matrikelnummer Matrikelnummer
     */
    public Student(String name, int alter, String matrikelnummer) {
        super(name, alter); // Ruft Person-Konstruktor auf
        this.matrikelnummer = matrikelnummer;
        this.studiengang = "Unbekannt";
        this.durchschnittsnote = 0.0;
    }

    /**
     * Vollständiger Konstruktor
     * @param name Name des Students
     * @param alter Alter des Students
     * @param adresse Adresse des Students
     * @param matrikelnummer Matrikelnummer
     * @param studiengang Studiengang
     */
    public Student(String name, int alter, String adresse,
                   String matrikelnummer, String studiengang) {
        super(name, alter, adresse); // Ruft Person-Konstruktor auf
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
        this.durchschnittsnote = 0.0;
    }

    // === GETTER ===

    public String getMatrikelnummer() {
        return matrikelnummer;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public double getDurchschnittsnote() {
        return durchschnittsnote;
    }

    // === SETTER ===

    public void setMatrikelnummer(String matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

    public void setDurchschnittsnote(double note) {
        // Validierung: Note muss zwischen 1.0 und 5.0 liegen
        if (note >= 1.0 && note <= 5.0) {
            this.durchschnittsnote = note;
        } else {
            System.out.println("Fehler: Note muss zwischen 1.0 und 5.0 liegen!");
        }
    }

    // === METHODEN ===

    /**
     * Student-spezifische Methode
     */
    public void lernen() {
        System.out.println(getName() + " lernt für das Studium in " + studiengang + ".");
    }

    /**
     * Gibt das Semester basierend auf dem Alter zurück (vereinfacht)
     * @return geschätztes Semester
     */
    public int getSemester() {
        int semester = (getAlter() - 18) * 2; // Vereinfachte Berechnung
        return semester > 0 ? semester : 1;
    }

    /**
     * Überschreibt die begruessung-Methode der Elternklasse
     */
    @Override
    public void begruessung() {
        System.out.println("Hallo, ich bin " + getName() +
                ", Student/in im Studiengang " + studiengang + ".");
    }

    /**
     * Überschreibt die zeigeInfo-Methode und erweitert sie
     */
    @Override
    public void zeigeInfo() {
        System.out.println("=== Student Info ===");
        System.out.println("Name: " + getName());
        System.out.println("Alter: " + getAlter() + " Jahre");
        System.out.println("Adresse: " + getAdresse());
        System.out.println("Matrikelnummer: " + matrikelnummer);
        System.out.println("Studiengang: " + studiengang);
        System.out.println("Semester: " + getSemester());
        System.out.println("Durchschnittsnote: " +
                (durchschnittsnote > 0 ? durchschnittsnote : "Noch keine Note"));
        System.out.println("====================");
    }

    /**
     * Überschreibt toString-Methode
     */
    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", alter=" + getAlter() +
                ", matrikelnummer='" + matrikelnummer + '\'' +
                ", studiengang='" + studiengang + '\'' +
                ", durchschnittsnote=" + durchschnittsnote +
                '}';
    }
}
