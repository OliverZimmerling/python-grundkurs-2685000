/**
 * Rechteck-Klasse mit Position und Farbe
 *
 * Demonstriert:
 * - Private Attribute
 * - Konstruktor (richtig platziert!)
 * - Getter und Setter
 * - Methoden
 */
public class Rechteck {

    // === ATTRIBUTE (Eigenschaften) ===
    private int positionX;
    private int positionY;
    private int breite;
    private int hoehe;
    private String farbe;

    // === KONSTRUKTOR (muss INNERHALB der Klasse sein!) ===
    /**
     * Erstellt ein neues Rechteck
     * @param positionX X-Koordinate
     * @param positionY Y-Koordinate
     * @param breite Breite des Rechtecks
     * @param hoehe Höhe des Rechtecks
     * @param farbe Farbe des Rechtecks
     */
    public Rechteck(int positionX, int positionY, int breite, int hoehe, String farbe) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.breite = breite;
        this.hoehe = hoehe;
        this.farbe = farbe;
    }

    // === GETTER (Lesemethoden) ===

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getBreite() {
        return breite;
    }

    public int getHoehe() {
        return hoehe;
    }

    public String getFarbe() {
        return farbe;
    }

    // === SETTER (Schreibmethoden) ===

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void setBreite(int breite) {
        if (breite > 0) {
            this.breite = breite;
        } else {
            System.out.println("Fehler: Breite muss positiv sein!");
        }
    }

    public void setHoehe(int hoehe) {
        if (hoehe > 0) {
            this.hoehe = hoehe;
        } else {
            System.out.println("Fehler: Höhe muss positiv sein!");
        }
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    // === BEWEGUNGSMETHODEN ===

    /**
     * Verschiebt das Rechteck um dx und dy
     * @param dx Verschiebung in X-Richtung
     * @param dy Verschiebung in Y-Richtung
     */
    public void verschieben(int dx, int dy) {
        this.positionX += dx;
        this.positionY += dy;
    }

    /**
     * Bewegt das Rechteck zu einer neuen Position
     * @param neueX Neue X-Koordinate
     * @param neueY Neue Y-Koordinate
     */
    public void bewegeZu(int neueX, int neueY) {
        this.positionX = neueX;
        this.positionY = neueY;
    }

    // === BERECHNUNGSMETHODEN ===

    /**
     * Berechnet die Fläche des Rechtecks
     * @return Die Fläche
     */
    public int berechneFlaече() {
        return breite * hoehe;
    }

    /**
     * Berechnet den Umfang des Rechtecks
     * @return Der Umfang
     */
    public int berechneUmfang() {
        return 2 * (breite + hoehe);
    }

    // === AUSGABEMETHODEN ===

    /**
     * Zeigt alle Informationen des Rechtecks
     */
    public void zeigeInfo() {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║      RECHTECK INFORMATION              ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.println("║ Position:    (" + positionX + ", " + positionY + ")");
        System.out.println("║ Breite:      " + breite);
        System.out.println("║ Höhe:        " + hoehe);
        System.out.println("║ Farbe:       " + farbe);
        System.out.println("║ Fläche:      " + berechneFlaече());
        System.out.println("║ Umfang:      " + berechneUmfang());
        System.out.println("╚════════════════════════════════════════╝");
    }

    /**
     * Zeichnet eine einfache Darstellung des Rechtecks
     */
    public void zeichne() {
        System.out.println("\nRechteck bei (" + positionX + ", " + positionY + ") - Farbe: " + farbe);

        // Obere Linie
        System.out.print("┌");
        for (int i = 0; i < breite; i++) {
            System.out.print("─");
        }
        System.out.println("┐");

        // Mittlere Linien
        for (int i = 0; i < hoehe; i++) {
            System.out.print("│");
            for (int j = 0; j < breite; j++) {
                System.out.print(" ");
            }
            System.out.println("│");
        }

        // Untere Linie
        System.out.print("└");
        for (int i = 0; i < breite; i++) {
            System.out.print("─");
        }
        System.out.println("┘");
    }

    /**
     * toString-Methode
     */
    @Override
    public String toString() {
        return "Rechteck{" +
                "position=(" + positionX + "," + positionY + ")" +
                ", breite=" + breite +
                ", hoehe=" + hoehe +
                ", farbe='" + farbe + '\'' +
                '}';
    }

}  // ← WICHTIG: Schließende Klammer der Klasse!
