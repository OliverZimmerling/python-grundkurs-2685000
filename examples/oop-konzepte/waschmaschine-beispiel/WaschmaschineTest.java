/**
 * Test-Programm für die Waschmaschine-Klasse
 * Zeigt, wie man Objekte erstellt und verwendet
 */
public class WaschmaschineTest {

    public static void main(String[] args) {
        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.println("║     WASCHMASCHINE - OBJEKTE ERSTELLEN             ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");
        System.out.println();

        // ========================================
        // 1. ERSTES OBJEKT ERSTELLEN
        // ========================================
        System.out.println(">>> 1. Erste Waschmaschine erstellen <<<");
        System.out.println();

        // Objekt erstellen mit dem Konstruktor
        Waschmaschine waschmaschine1 = new Waschmaschine("Bosch Serie 6", 75, 599.99, true);

        // Informationen anzeigen
        waschmaschine1.zeigeInfo();
        System.out.println();

        // ========================================
        // 2. ZWEITES OBJEKT ERSTELLEN
        // ========================================
        System.out.println(">>> 2. Zweite Waschmaschine erstellen <<<");
        System.out.println();

        Waschmaschine waschmaschine2 = new Waschmaschine("Siemens iQ500", 80, 749.50, true);
        waschmaschine2.zeigeInfo();
        System.out.println();

        // ========================================
        // 3. DRITTES OBJEKT ERSTELLEN (ohne Energiesparprogramm)
        // ========================================
        System.out.println(">>> 3. Dritte Waschmaschine erstellen <<<");
        System.out.println();

        Waschmaschine waschmaschine3 = new Waschmaschine("Miele Basic", 70, 450.00, false);
        waschmaschine3.zeigeInfo();
        System.out.println();

        // ========================================
        // 4. GETTER VERWENDEN (Werte auslesen)
        // ========================================
        System.out.println(">>> 4. Werte mit Gettern auslesen <<<");
        System.out.println();

        System.out.println("Modell von Waschmaschine 1: " + waschmaschine1.getModell());
        System.out.println("Gewicht: " + waschmaschine1.getGewicht() + " kg");
        System.out.println("Preis: " + waschmaschine1.getPreis() + " €");
        System.out.println("Hat Energiesparprogramm? " + waschmaschine1.hatEnergiesparProgramm());
        System.out.println();

        // ========================================
        // 5. SETTER VERWENDEN (Werte ändern)
        // ========================================
        System.out.println(">>> 5. Werte mit Settern ändern <<<");
        System.out.println();

        System.out.println("Vorher:");
        waschmaschine3.zeigeInfo();

        // Preis senken
        waschmaschine3.setPreis(399.99);
        // Energiesparprogramm nachrüsten
        waschmaschine3.setEnergiesparProgramm(true);

        System.out.println("Nachher (Preis gesenkt, Energiesparprogramm aktiviert):");
        waschmaschine3.zeigeInfo();
        System.out.println();

        // ========================================
        // 6. METHODEN AUFRUFEN
        // ========================================
        System.out.println(">>> 6. Waschmaschine starten <<<");
        System.out.println();

        waschmaschine1.starten("Buntwäsche 40°");
        System.out.println();

        waschmaschine2.starten("Kurzprogramm 30°");
        System.out.println();

        waschmaschine3.starten("Energiesparprogramm");
        System.out.println();

        // ========================================
        // 7. WASCHMASCHINEN VERGLEICHEN
        // ========================================
        System.out.println(">>> 7. Waschmaschinen vergleichen <<<");
        System.out.println();

        System.out.println("Waschmaschine 1: " + waschmaschine1.getModell() + " - " + waschmaschine1.getPreis() + " €");
        System.out.println("Waschmaschine 2: " + waschmaschine2.getModell() + " - " + waschmaschine2.getPreis() + " €");
        System.out.println("Waschmaschine 3: " + waschmaschine3.getModell() + " - " + waschmaschine3.getPreis() + " €");
        System.out.println();

        if (waschmaschine1.istGuenstigerAls(waschmaschine2)) {
            System.out.println(waschmaschine1.getModell() + " ist günstiger als " + waschmaschine2.getModell());
        } else {
            System.out.println(waschmaschine2.getModell() + " ist günstiger als " + waschmaschine1.getModell());
        }

        if (waschmaschine3.istGuenstigerAls(waschmaschine1)) {
            System.out.println(waschmaschine3.getModell() + " ist günstiger als " + waschmaschine1.getModell());
        }
        System.out.println();

        // ========================================
        // 8. ENERGIEKOSTEN VERGLEICHEN
        // ========================================
        System.out.println(">>> 8. Energiekosten vergleichen <<<");
        System.out.println();

        System.out.println("Energiekosten pro Waschgang:");
        System.out.println(waschmaschine1.getModell() + ": " + waschmaschine1.berechneEnergiekosten() + " €");
        System.out.println(waschmaschine2.getModell() + ": " + waschmaschine2.berechneEnergiekosten() + " €");
        System.out.println(waschmaschine3.getModell() + ": " + waschmaschine3.berechneEnergiekosten() + " €");
        System.out.println();

        // ========================================
        // 9. toString() VERWENDEN
        // ========================================
        System.out.println(">>> 9. toString() Methode verwenden <<<");
        System.out.println();

        System.out.println(waschmaschine1);
        System.out.println(waschmaschine2);
        System.out.println(waschmaschine3);
        System.out.println();

        // ========================================
        // 10. ARRAY VON WASCHMASCHINEN
        // ========================================
        System.out.println(">>> 10. Array von Waschmaschinen <<<");
        System.out.println();

        Waschmaschine[] waschmaschinen = new Waschmaschine[5];
        waschmaschinen[0] = new Waschmaschine("AEG L7FE74485", 68, 599.00, true);
        waschmaschinen[1] = new Waschmaschine("Samsung WW80", 62, 449.99, true);
        waschmaschinen[2] = new Waschmaschine("LG F4WV508S0", 66, 529.00, true);
        waschmaschinen[3] = waschmaschine1;  // Bereits erstellt
        waschmaschinen[4] = waschmaschine2;  // Bereits erstellt

        System.out.println("Alle Waschmaschinen im Array:");
        for (int i = 0; i < waschmaschinen.length; i++) {
            System.out.println((i + 1) + ". " + waschmaschinen[i].getModell() +
                             " - " + waschmaschinen[i].getPreis() + " €");
        }
        System.out.println();

        // ========================================
        // 11. GÜNSTIGSTE WASCHMASCHINE FINDEN
        // ========================================
        System.out.println(">>> 11. Günstigste Waschmaschine finden <<<");
        System.out.println();

        Waschmaschine guenstigste = waschmaschinen[0];
        for (Waschmaschine wm : waschmaschinen) {
            if (wm.istGuenstigerAls(guenstigste)) {
                guenstigste = wm;
            }
        }

        System.out.println("Die günstigste Waschmaschine ist:");
        guenstigste.zeigeInfo();
        System.out.println();

        // ========================================
        // 12. VALIDIERUNG TESTEN
        // ========================================
        System.out.println(">>> 12. Validierung testen <<<");
        System.out.println();

        System.out.println("Versuche negativen Preis zu setzen:");
        waschmaschine1.setPreis(-100);  // Sollte Fehlermeldung geben

        System.out.println("Versuche negatives Gewicht zu setzen:");
        waschmaschine1.setGewicht(-50);  // Sollte Fehlermeldung geben

        System.out.println();
        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.println("║          Demonstration abgeschlossen!             ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");
    }
}
