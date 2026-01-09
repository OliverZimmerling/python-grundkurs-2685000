/**
 * Waschmaschine-Klasse - Deine erste Klasse!
 *
 * Demonstriert:
 * - Private Attribute
 * - Konstruktor
 * - Getter und Setter
 * - Methoden
 */
public class Waschmaschine {

    // === ATTRIBUTE (Eigenschaften) ===
    private String modell;
    private int gewicht;           // in kg
    private double preis;          // in Euro
    private boolean energiesparProgramm;

    // === KONSTRUKTOR ===
    /**
     * Erstellt eine neue Waschmaschine
     * @param modell Das Modell der Waschmaschine
     * @param gewicht Das Gewicht in kg
     * @param preis Der Preis in Euro
     * @param energiesparProgramm Hat die Waschmaschine ein Energiesparprogramm?
     */
    public Waschmaschine(String modell, int gewicht, double preis, boolean energiesparProgramm) {
        this.modell = modell;
        this.gewicht = gewicht;
        this.preis = preis;
        this.energiesparProgramm = energiesparProgramm;
    }

    // === GETTER (Lesemethoden) ===

    public String getModell() {
        return modell;
    }

    public int getGewicht() {
        return gewicht;
    }

    public double getPreis() {
        return preis;
    }

    public boolean hatEnergiesparProgramm() {
        return energiesparProgramm;
    }

    // === SETTER (Schreibmethoden) ===

    public void setModell(String modell) {
        this.modell = modell;
    }

    public void setGewicht(int gewicht) {
        if (gewicht > 0) {
            this.gewicht = gewicht;
        } else {
            System.out.println("Fehler: Gewicht muss positiv sein!");
        }
    }

    public void setPreis(double preis) {
        if (preis > 0) {
            this.preis = preis;
        } else {
            System.out.println("Fehler: Preis muss positiv sein!");
        }
    }

    public void setEnergiesparProgramm(boolean energiesparProgramm) {
        this.energiesparProgramm = energiesparProgramm;
    }

    // === METHODEN ===

    /**
     * Startet einen Waschgang
     * @param programm Das gewählte Programm
     */
    public void starten(String programm) {
        System.out.println("Waschmaschine " + modell + " startet Programm: " + programm);
        System.out.println("Die Wäsche wird gewaschen...");
    }

    /**
     * Berechnet die Energiekosten pro Waschgang (geschätzt)
     * @return Geschätzte Kosten in Euro
     */
    public double berechneEnergiekosten() {
        // Vereinfachte Berechnung
        if (energiesparProgramm) {
            return 0.50;  // 50 Cent bei Energiesparprogramm
        } else {
            return 0.80;  // 80 Cent bei normalem Programm
        }
    }

    /**
     * Gibt alle Informationen der Waschmaschine aus
     */
    public void zeigeInfo() {
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║     WASCHMASCHINEN INFORMATION             ║");
        System.out.println("╠════════════════════════════════════════════╣");
        System.out.println("║ Modell:              " + String.format("%-20s", modell) + " ║");
        System.out.println("║ Gewicht:             " + String.format("%-17s", gewicht + " kg") + " ║");
        System.out.println("║ Preis:               " + String.format("%-17s", preis + " €") + " ║");
        System.out.println("║ Energiesparprogramm: " + String.format("%-20s", energiesparProgramm ? "Ja" : "Nein") + " ║");
        System.out.println("║ Energiekosten:       " + String.format("%-17s", berechneEnergiekosten() + " €") + " ║");
        System.out.println("╚════════════════════════════════════════════╝");
    }

    /**
     * Vergleicht Preis mit anderer Waschmaschine
     * @param andere Die andere Waschmaschine
     * @return true wenn diese günstiger ist
     */
    public boolean istGuenstigerAls(Waschmaschine andere) {
        return this.preis < andere.preis;
    }

    /**
     * toString-Methode für String-Darstellung
     */
    @Override
    public String toString() {
        return "Waschmaschine{" +
                "modell='" + modell + '\'' +
                ", gewicht=" + gewicht + " kg" +
                ", preis=" + preis + " €" +
                ", energiesparProgramm=" + energiesparProgramm +
                '}';
    }
}
