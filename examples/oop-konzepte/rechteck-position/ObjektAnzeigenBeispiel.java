/**
 * Zeigt alle Möglichkeiten, ein Objekt anzuzeigen
 */
public class ObjektAnzeigenBeispiel {

    public static void main(String[] args) {

        System.out.println("═══════════════════════════════════════════════");
        System.out.println("  OBJEKTE IN DER KONSOLE ANZEIGEN");
        System.out.println("═══════════════════════════════════════════════");
        System.out.println();

        // Objekt erstellen
        Rechteck rect1 = new Rechteck(10, 20, 5, 3, "Rot");
        Rechteck rect2 = new Rechteck(50, 60, 8, 4, "Blau");

        // =====================================
        // METHODE 1: toString() verwenden
        // =====================================
        System.out.println(">>> METHODE 1: toString() verwenden <<<");
        System.out.println();

        // Automatisch (toString() wird aufgerufen)
        System.out.println("Rechteck 1: " + rect1);
        System.out.println("Rechteck 2: " + rect2);
        System.out.println();

        // Explizit toString() aufrufen
        System.out.println("Explizit: " + rect1.toString());
        System.out.println();

        // =====================================
        // METHODE 2: zeigeInfo() verwenden
        // =====================================
        System.out.println(">>> METHODE 2: zeigeInfo() verwenden <<<");
        System.out.println();

        rect1.zeigeInfo();
        System.out.println();

        rect2.zeigeInfo();
        System.out.println();

        // =====================================
        // METHODE 3: Einzelne Getter verwenden
        // =====================================
        System.out.println(">>> METHODE 3: Einzelne Getter verwenden <<<");
        System.out.println();

        System.out.println("Rechteck 1 Details:");
        System.out.println("  Position X: " + rect1.getPositionX());
        System.out.println("  Position Y: " + rect1.getPositionY());
        System.out.println("  Breite:     " + rect1.getBreite());
        System.out.println("  Höhe:       " + rect1.getHoehe());
        System.out.println("  Farbe:      " + rect1.getFarbe());
        System.out.println();

        // =====================================
        // METHODE 4: Eigene Formatierung
        // =====================================
        System.out.println(">>> METHODE 4: Eigene Formatierung <<<");
        System.out.println();

        System.out.println("Rechteck 1: [" + rect1.getBreite() + "x" + rect1.getHoehe() + "] " +
                          "an Position (" + rect1.getPositionX() + "," + rect1.getPositionY() + ") " +
                          "in Farbe " + rect1.getFarbe());

        System.out.println("Rechteck 2: [" + rect2.getBreite() + "x" + rect2.getHoehe() + "] " +
                          "an Position (" + rect2.getPositionX() + "," + rect2.getPositionY() + ") " +
                          "in Farbe " + rect2.getFarbe());
        System.out.println();

        // =====================================
        // METHODE 5: Alle Objekte in Schleife
        // =====================================
        System.out.println(">>> METHODE 5: Array von Objekten ausgeben <<<");
        System.out.println();

        // Array mit Rechtecken
        Rechteck[] rechtecke = new Rechteck[3];
        rechtecke[0] = rect1;
        rechtecke[1] = rect2;
        rechtecke[2] = new Rechteck(100, 150, 10, 6, "Grün");

        // Alle ausgeben
        for (int i = 0; i < rechtecke.length; i++) {
            System.out.println((i + 1) + ". " + rechtecke[i]);
        }
        System.out.println();

        // Mit for-each Schleife
        System.out.println("Mit for-each Schleife:");
        for (Rechteck r : rechtecke) {
            System.out.println("- " + r);
        }
        System.out.println();

        // =====================================
        // METHODE 6: Visuell zeichnen
        // =====================================
        System.out.println(">>> METHODE 6: Visuell zeichnen <<<");
        System.out.println();

        rect1.zeichne();
        rect2.zeichne();

        System.out.println("═══════════════════════════════════════════════");
        System.out.println("  FERTIG!");
        System.out.println("═══════════════════════════════════════════════");
    }
}
