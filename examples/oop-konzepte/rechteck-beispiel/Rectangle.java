/**
 * Rectangle (Rechteck) Klasse - Demonstriert OOP-Konzepte
 *
 * Konzepte:
 * - Kapselung (private Attribute)
 * - Konstruktoren
 * - Getter und Setter mit Validierung
 * - Berechnungsmethoden (Fläche, Umfang)
 * - toString-Methode
 */
public class Rectangle {

    // === ATTRIBUTE (Eigenschaften) ===
    private double laenge;    // Länge des Rechtecks
    private double breite;    // Breite des Rechtecks

    // === KONSTRUKTOREN ===

    /**
     * Standard-Konstruktor
     * Erstellt ein Rechteck mit Länge und Breite = 1.0
     */
    public Rectangle() {
        this.laenge = 1.0;
        this.breite = 1.0;
    }

    /**
     * Konstruktor mit Parametern
     * @param laenge Die Länge des Rechtecks
     * @param breite Die Breite des Rechtecks
     */
    public Rectangle(double laenge, double breite) {
        setLaenge(laenge);  // Nutzt Setter für Validierung
        setBreite(breite);
    }

    /**
     * Konstruktor für Quadrat (gleiche Länge und Breite)
     * @param seite Die Seitenlänge des Quadrats
     */
    public Rectangle(double seite) {
        this.laenge = seite;
        this.breite = seite;
    }

    // === GETTER (Lesemethoden) ===

    public double getLaenge() {
        return laenge;
    }

    public double getBreite() {
        return breite;
    }

    // === SETTER (Schreibmethoden mit Validierung) ===

    public void setLaenge(double laenge) {
        if (laenge > 0) {
            this.laenge = laenge;
        } else {
            System.out.println("Fehler: Länge muss positiv sein!");
            this.laenge = 1.0;  // Standardwert
        }
    }

    public void setBreite(double breite) {
        if (breite > 0) {
            this.breite = breite;
        } else {
            System.out.println("Fehler: Breite muss positiv sein!");
            this.breite = 1.0;  // Standardwert
        }
    }

    // === BERECHNUNGSMETHODEN ===

    /**
     * Berechnet die Fläche des Rechtecks
     * Formel: Fläche = Länge × Breite
     * @return Die Fläche des Rechtecks
     */
    public double berechneFlaече() {
        return laenge * breite;
    }

    /**
     * Berechnet den Umfang des Rechtecks
     * Formel: Umfang = 2 × (Länge + Breite)
     * @return Der Umfang des Rechtecks
     */
    public double berechneUmfang() {
        return 2 * (laenge + breite);
    }

    /**
     * Berechnet die Diagonale des Rechtecks
     * Formel: Diagonale = √(Länge² + Breite²)
     * @return Die Diagonale des Rechtecks
     */
    public double berechneDiagonale() {
        return Math.sqrt(laenge * laenge + breite * breite);
    }

    /**
     * Prüft, ob das Rechteck ein Quadrat ist
     * @return true wenn Quadrat, sonst false
     */
    public boolean istQuadrat() {
        return laenge == breite;
    }

    // === VERGLEICHSMETHODEN ===

    /**
     * Vergleicht die Fläche mit einem anderen Rechteck
     * @param anderes Das andere Rechteck zum Vergleich
     * @return true wenn gleiche Fläche, sonst false
     */
    public boolean hatGleicheFlaecheWie(Rectangle anderes) {
        return this.berechneFlaече() == anderes.berechneFlaече();
    }

    /**
     * Prüft ob dieses Rechteck größer ist als ein anderes
     * @param anderes Das andere Rechteck
     * @return true wenn größere Fläche, sonst false
     */
    public boolean istGroesserAls(Rectangle anderes) {
        return this.berechneFlaече() > anderes.berechneFlaече();
    }

    // === SKALIERUNGSMETHODEN ===

    /**
     * Skaliert das Rechteck mit einem Faktor
     * @param faktor Der Skalierungsfaktor
     */
    public void skaliere(double faktor) {
        if (faktor > 0) {
            this.laenge *= faktor;
            this.breite *= faktor;
        } else {
            System.out.println("Fehler: Faktor muss positiv sein!");
        }
    }

    /**
     * Verdoppelt die Größe des Rechtecks
     */
    public void verdoppeln() {
        skaliere(2.0);
    }

    /**
     * Halbiert die Größe des Rechtecks
     */
    public void halbieren() {
        skaliere(0.5);
    }

    // === AUSGABEMETHODEN ===

    /**
     * Gibt alle Informationen des Rechtecks aus
     */
    public void zeigeInfo() {
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║      RECHTECK INFORMATION          ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║ Länge:      " + String.format("%-20.2f", laenge) + " ║");
        System.out.println("║ Breite:     " + String.format("%-20.2f", breite) + " ║");
        System.out.println("║ Fläche:     " + String.format("%-20.2f", berechneFlaече()) + " ║");
        System.out.println("║ Umfang:     " + String.format("%-20.2f", berechneUmfang()) + " ║");
        System.out.println("║ Diagonale:  " + String.format("%-20.2f", berechneDiagonale()) + " ║");
        System.out.println("║ Quadrat?    " + String.format("%-20s", istQuadrat() ? "Ja" : "Nein") + " ║");
        System.out.println("╚════════════════════════════════════╝");
    }

    /**
     * Zeichnet eine einfache ASCII-Darstellung des Rechtecks
     */
    public void zeichne() {
        int zeichenBreite = (int) Math.min(breite * 2, 40);
        int zeichenHoehe = (int) Math.min(laenge, 20);

        // Mindestgröße
        if (zeichenBreite < 4) zeichenBreite = 4;
        if (zeichenHoehe < 2) zeichenHoehe = 2;

        // Obere Linie
        System.out.print("┌");
        for (int i = 0; i < zeichenBreite; i++) {
            System.out.print("─");
        }
        System.out.println("┐");

        // Mittlere Linien
        for (int i = 0; i < zeichenHoehe; i++) {
            System.out.print("│");
            for (int j = 0; j < zeichenBreite; j++) {
                System.out.print(" ");
            }
            System.out.println("│");
        }

        // Untere Linie
        System.out.print("└");
        for (int i = 0; i < zeichenBreite; i++) {
            System.out.print("─");
        }
        System.out.println("┘");
    }

    /**
     * toString-Methode für String-Repräsentation
     * @return String-Darstellung des Rechtecks
     */
    @Override
    public String toString() {
        return String.format("Rectangle{länge=%.2f, breite=%.2f, fläche=%.2f}",
                laenge, breite, berechneFlaече());
    }
}
