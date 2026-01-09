/**
 * Test-Programm für die Rectangle-Klasse
 * Demonstriert alle Funktionen der Rectangle-Klasse
 */
public class RectangleTest {

    public static void main(String[] args) {
        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.println("║     RECHTECK (RECTANGLE) - OOP DEMONSTRATION      ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");
        System.out.println();

        // ========================================
        // 1. Rechteck mit Standard-Konstruktor erstellen
        // ========================================
        System.out.println(">>> 1. Standard-Rechteck erstellen <<<");
        System.out.println();

        Rectangle rechteck1 = new Rectangle();
        rechteck1.zeigeInfo();
        rechteck1.zeichne();
        System.out.println();

        // ========================================
        // 2. Rechteck mit Parametern erstellen
        // ========================================
        System.out.println(">>> 2. Rechteck mit Länge=5, Breite=3 erstellen <<<");
        System.out.println();

        Rectangle rechteck2 = new Rectangle(5.0, 3.0);
        rechteck2.zeigeInfo();
        rechteck2.zeichne();
        System.out.println();

        // ========================================
        // 3. Quadrat erstellen
        // ========================================
        System.out.println(">>> 3. Quadrat mit Seitenlänge=4 erstellen <<<");
        System.out.println();

        Rectangle quadrat = new Rectangle(4.0);
        quadrat.zeigeInfo();
        quadrat.zeichne();
        System.out.println();

        // ========================================
        // 4. Berechnungen durchführen
        // ========================================
        System.out.println(">>> 4. Berechnungen mit Rechteck (8 × 6) <<<");
        System.out.println();

        Rectangle rechteck3 = new Rectangle(8.0, 6.0);
        System.out.println("Länge: " + rechteck3.getLaenge());
        System.out.println("Breite: " + rechteck3.getBreite());
        System.out.println("Fläche: " + rechteck3.berechneFlaече());
        System.out.println("Umfang: " + rechteck3.berechneUmfang());
        System.out.println("Diagonale: " + String.format("%.2f", rechteck3.berechneDiagonale()));
        System.out.println("Ist Quadrat? " + (rechteck3.istQuadrat() ? "Ja" : "Nein"));
        System.out.println();
        rechteck3.zeichne();
        System.out.println();

        // ========================================
        // 5. Setter verwenden (Werte ändern)
        // ========================================
        System.out.println(">>> 5. Rechteck-Größe ändern mit Settern <<<");
        System.out.println();

        Rectangle rechteck4 = new Rectangle(2.0, 2.0);
        System.out.println("Vorher:");
        rechteck4.zeigeInfo();

        rechteck4.setLaenge(10.0);
        rechteck4.setBreite(5.0);

        System.out.println("Nachher (Länge=10, Breite=5):");
        rechteck4.zeigeInfo();
        System.out.println();

        // ========================================
        // 6. Validierung testen
        // ========================================
        System.out.println(">>> 6. Validierung testen (negative Werte) <<<");
        System.out.println();

        Rectangle rechteck5 = new Rectangle(5.0, 3.0);
        System.out.println("Versuche negative Länge zu setzen:");
        rechteck5.setLaenge(-10.0);  // Sollte Fehlermeldung ausgeben

        System.out.println("Versuche negative Breite zu setzen:");
        rechteck5.setBreite(-5.0);   // Sollte Fehlermeldung ausgeben

        rechteck5.zeigeInfo();
        System.out.println();

        // ========================================
        // 7. Rechtecke vergleichen
        // ========================================
        System.out.println(">>> 7. Rechtecke vergleichen <<<");
        System.out.println();

        Rectangle r1 = new Rectangle(4.0, 5.0);  // Fläche: 20
        Rectangle r2 = new Rectangle(10.0, 2.0); // Fläche: 20
        Rectangle r3 = new Rectangle(3.0, 3.0);  // Fläche: 9

        System.out.println("Rechteck 1: " + r1);
        System.out.println("Rechteck 2: " + r2);
        System.out.println("Rechteck 3: " + r3);
        System.out.println();

        System.out.println("R1 hat gleiche Fläche wie R2? " + r1.hatGleicheFlaecheWie(r2));
        System.out.println("R1 hat gleiche Fläche wie R3? " + r1.hatGleicheFlaecheWie(r3));
        System.out.println("R1 ist größer als R3? " + r1.istGroesserAls(r3));
        System.out.println("R3 ist größer als R1? " + r3.istGroesserAls(r1));
        System.out.println();

        // ========================================
        // 8. Skalierung
        // ========================================
        System.out.println(">>> 8. Rechteck skalieren <<<");
        System.out.println();

        Rectangle rechteck6 = new Rectangle(4.0, 3.0);
        System.out.println("Original:");
        rechteck6.zeigeInfo();
        rechteck6.zeichne();

        rechteck6.verdoppeln();
        System.out.println("Nach Verdopplung:");
        rechteck6.zeigeInfo();
        rechteck6.zeichne();

        rechteck6.halbieren();
        System.out.println("Nach Halbierung:");
        rechteck6.zeigeInfo();
        rechteck6.zeichne();

        System.out.println();

        // ========================================
        // 9. Benutzerdefinierte Skalierung
        // ========================================
        System.out.println(">>> 9. Rechteck um Faktor 1.5 skalieren <<<");
        System.out.println();

        Rectangle rechteck7 = new Rectangle(6.0, 4.0);
        System.out.println("Vorher:");
        rechteck7.zeigeInfo();

        rechteck7.skaliere(1.5);
        System.out.println("Nachher (× 1.5):");
        rechteck7.zeigeInfo();
        System.out.println();

        // ========================================
        // 10. Array von Rechtecken
        // ========================================
        System.out.println(">>> 10. Array von Rechtecken <<<");
        System.out.println();

        Rectangle[] rechtecke = new Rectangle[5];
        rechtecke[0] = new Rectangle(2.0, 3.0);
        rechtecke[1] = new Rectangle(5.0, 5.0);
        rechtecke[2] = new Rectangle(7.0, 2.0);
        rechtecke[3] = new Rectangle(4.0, 6.0);
        rechtecke[4] = new Rectangle(3.0);

        double gesamtFlaeche = 0;
        System.out.println("Alle Rechtecke:");
        for (int i = 0; i < rechtecke.length; i++) {
            System.out.println((i + 1) + ". " + rechtecke[i]);
            gesamtFlaeche += rechtecke[i].berechneFlaече();
        }
        System.out.println();
        System.out.println("Gesamtfläche aller Rechtecke: " + gesamtFlaeche);
        System.out.println();

        // ========================================
        // 11. Größtes Rechteck finden
        // ========================================
        System.out.println(">>> 11. Größtes Rechteck finden <<<");
        System.out.println();

        Rectangle groesstes = rechtecke[0];
        for (Rectangle r : rechtecke) {
            if (r.istGroesserAls(groesstes)) {
                groesstes = r;
            }
        }

        System.out.println("Das größte Rechteck ist:");
        groesstes.zeigeInfo();
        groesstes.zeichne();
        System.out.println();

        // ========================================
        // 12. Verschiedene Rechteck-Größen visualisieren
        // ========================================
        System.out.println(">>> 12. Verschiedene Rechteck-Größen <<<");
        System.out.println();

        Rectangle klein = new Rectangle(2.0, 1.5);
        Rectangle mittel = new Rectangle(5.0, 3.0);
        Rectangle gross = new Rectangle(10.0, 6.0);

        System.out.println("Klein (2 × 1.5):");
        klein.zeichne();

        System.out.println("\nMittel (5 × 3):");
        mittel.zeichne();

        System.out.println("\nGroß (10 × 6):");
        gross.zeichne();

        System.out.println();
        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.println("║          Demonstration abgeschlossen!             ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");
    }
}
