/**
 * Test-Programm für Rechteck-Klasse
 * Zeigt, wie man Objekte erstellt und verwendet
 */
public class RechteckTest {

    public static void main(String[] args) {
        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.println("║     RECHTECK - OBJEKTE ERSTELLEN                  ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");
        System.out.println();

        // ========================================
        // 1. ERSTES RECHTECK ERSTELLEN
        // ========================================
        System.out.println(">>> 1. Erstes Rechteck erstellen <<<");
        System.out.println();

        // So erstellt man ein Objekt:
        Rechteck rechteck1 = new Rechteck(10, 20, 5, 3, "Rot");
        //       ▲               ▲          ▲  ▲  ▲  ▲   ▲
        //       │               │          │  │  │  │   └─ farbe
        //       │               │          │  │  │  └───── hoehe
        //       │               │          │  │  └──────── breite
        //       │               │          │  └─────────── positionY
        //       │               │          └────────────── positionX
        //       │               └───────────────────────── "new" erstellt Objekt
        //       └───────────────────────────────────────── Name des Objekts

        rechteck1.zeigeInfo();
        rechteck1.zeichne();
        System.out.println();

        // ========================================
        // 2. ZWEITES RECHTECK ERSTELLEN
        // ========================================
        System.out.println(">>> 2. Zweites Rechteck erstellen <<<");
        System.out.println();

        Rechteck rechteck2 = new Rechteck(50, 30, 8, 4, "Blau");
        rechteck2.zeigeInfo();
        rechteck2.zeichne();
        System.out.println();

        // ========================================
        // 3. DRITTES RECHTECK ERSTELLEN
        // ========================================
        System.out.println(">>> 3. Drittes Rechteck erstellen <<<");
        System.out.println();

        Rechteck rechteck3 = new Rechteck(0, 0, 10, 10, "Grün");
        rechteck3.zeigeInfo();
        rechteck3.zeichne();
        System.out.println();

        // ========================================
        // 4. GETTER VERWENDEN (Werte auslesen)
        // ========================================
        System.out.println(">>> 4. Werte mit Gettern auslesen <<<");
        System.out.println();

        System.out.println("Rechteck 1:");
        System.out.println("  Position X: " + rechteck1.getPositionX());
        System.out.println("  Position Y: " + rechteck1.getPositionY());
        System.out.println("  Breite: " + rechteck1.getBreite());
        System.out.println("  Höhe: " + rechteck1.getHoehe());
        System.out.println("  Farbe: " + rechteck1.getFarbe());
        System.out.println();

        // ========================================
        // 5. SETTER VERWENDEN (Werte ändern)
        // ========================================
        System.out.println(">>> 5. Werte mit Settern ändern <<<");
        System.out.println();

        System.out.println("Rechteck 1 vorher:");
        rechteck1.zeigeInfo();

        // Farbe ändern
        rechteck1.setFarbe("Gelb");
        // Größe ändern
        rechteck1.setBreite(7);
        rechteck1.setHoehe(5);

        System.out.println("Rechteck 1 nachher (neue Farbe und Größe):");
        rechteck1.zeigeInfo();
        rechteck1.zeichne();
        System.out.println();

        // ========================================
        // 6. RECHTECK VERSCHIEBEN
        // ========================================
        System.out.println(">>> 6. Rechteck verschieben <<<");
        System.out.println();

        System.out.println("Rechteck 2 vorher:");
        System.out.println("Position: (" + rechteck2.getPositionX() + ", " + rechteck2.getPositionY() + ")");

        // Um 5 nach rechts und 10 nach unten verschieben
        rechteck2.verschieben(5, 10);

        System.out.println("Rechteck 2 nachher (um 5,10 verschoben):");
        System.out.println("Position: (" + rechteck2.getPositionX() + ", " + rechteck2.getPositionY() + ")");
        System.out.println();

        // ========================================
        // 7. RECHTECK ZU NEUER POSITION BEWEGEN
        // ========================================
        System.out.println(">>> 7. Rechteck zu neuer Position bewegen <<<");
        System.out.println();

        System.out.println("Rechteck 3 vorher:");
        System.out.println("Position: (" + rechteck3.getPositionX() + ", " + rechteck3.getPositionY() + ")");

        // Zu Position (100, 50) bewegen
        rechteck3.bewegeZu(100, 50);

        System.out.println("Rechteck 3 nachher (zu 100,50 bewegt):");
        System.out.println("Position: (" + rechteck3.getPositionX() + ", " + rechteck3.getPositionY() + ")");
        System.out.println();

        // ========================================
        // 8. BERECHNUNGEN
        // ========================================
        System.out.println(">>> 8. Fläche und Umfang berechnen <<<");
        System.out.println();

        System.out.println("Rechteck 1:");
        System.out.println("  Fläche: " + rechteck1.berechneFlaече());
        System.out.println("  Umfang: " + rechteck1.berechneUmfang());

        System.out.println("Rechteck 2:");
        System.out.println("  Fläche: " + rechteck2.berechneFlaече());
        System.out.println("  Umfang: " + rechteck2.berechneUmfang());

        System.out.println("Rechteck 3:");
        System.out.println("  Fläche: " + rechteck3.berechneFlaече());
        System.out.println("  Umfang: " + rechteck3.berechneUmfang());
        System.out.println();

        // ========================================
        // 9. MEHRERE RECHTECKE IN EINEM ARRAY
        // ========================================
        System.out.println(">>> 9. Array mit mehreren Rechtecken <<<");
        System.out.println();

        // Array mit 5 Rechtecken erstellen
        Rechteck[] rechtecke = new Rechteck[5];

        // Rechtecke erstellen und im Array speichern
        rechtecke[0] = new Rechteck(0, 0, 5, 5, "Rot");
        rechtecke[1] = new Rechteck(10, 10, 6, 4, "Blau");
        rechtecke[2] = new Rechteck(20, 20, 7, 3, "Grün");
        rechtecke[3] = new Rechteck(30, 30, 4, 8, "Gelb");
        rechtecke[4] = new Rechteck(40, 40, 10, 2, "Orange");

        System.out.println("Alle Rechtecke im Array:");
        for (int i = 0; i < rechtecke.length; i++) {
            System.out.println((i + 1) + ". " + rechtecke[i]);
        }
        System.out.println();

        // ========================================
        // 10. GRÖSSTES RECHTECK FINDEN
        // ========================================
        System.out.println(">>> 10. Rechteck mit größter Fläche finden <<<");
        System.out.println();

        Rechteck groesstes = rechtecke[0];
        for (Rechteck r : rechtecke) {
            if (r.berechneFlaече() > groesstes.berechneFlaече()) {
                groesstes = r;
            }
        }

        System.out.println("Das Rechteck mit der größten Fläche ist:");
        groesstes.zeigeInfo();
        groesstes.zeichne();
        System.out.println();

        // ========================================
        // 11. ALLE RECHTECKE ZEICHNEN
        // ========================================
        System.out.println(">>> 11. Alle Rechtecke visualisieren <<<");
        System.out.println();

        for (int i = 0; i < rechtecke.length; i++) {
            System.out.println("Rechteck " + (i + 1) + ":");
            rechtecke[i].zeichne();
        }
        System.out.println();

        // ========================================
        // 12. toString() VERWENDEN
        // ========================================
        System.out.println(">>> 12. toString() Methode <<<");
        System.out.println();

        System.out.println("Rechteck 1: " + rechteck1.toString());
        System.out.println("Rechteck 2: " + rechteck2.toString());
        System.out.println("Rechteck 3: " + rechteck3.toString());
        System.out.println();

        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.println("║          Demonstration abgeschlossen!             ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");
    }
}
