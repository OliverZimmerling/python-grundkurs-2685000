# Rechteck (Rectangle) - OOP-Beispiel

## Übersicht

Dieses Beispiel zeigt, wie man eine **Rechteck-Klasse** in Java mit OOP-Konzepten erstellt.
Die Rectangle-Klasse demonstriert alle wichtigen OOP-Prinzipien anhand eines praktischen Beispiels.

## Was macht die Rectangle-Klasse?

Die Rectangle-Klasse repräsentiert ein geometrisches Rechteck und bietet:

- 📏 **Eigenschaften**: Länge und Breite
- 🧮 **Berechnungen**: Fläche, Umfang, Diagonale
- 🔍 **Vergleiche**: Größenvergleich, Quadrat-Prüfung
- 📐 **Manipulation**: Skalieren, Verdoppeln, Halbieren
- 🎨 **Visualisierung**: ASCII-Darstellung, Info-Ausgabe

## OOP-Konzepte demonstriert

### 1. 🔒 Kapselung (Encapsulation)

```java
private double laenge;  // Geschützt
private double breite;  // Geschützt

public double getLaenge() {  // Kontrollierter Zugriff
    return laenge;
}

public void setLaenge(double laenge) {  // Mit Validierung!
    if (laenge > 0) {
        this.laenge = laenge;
    } else {
        System.out.println("Fehler: Länge muss positiv sein!");
        this.laenge = 1.0;
    }
}
```

**Vorteile:**
- Attribute sind geschützt
- Validierung bei Wertänderungen
- Kontrolle über Zugriffe

### 2. 🏗️ Konstruktoren

```java
// Standard-Konstruktor
Rectangle r1 = new Rectangle();  // 1.0 × 1.0

// Mit Parametern
Rectangle r2 = new Rectangle(5.0, 3.0);  // 5.0 × 3.0

// Quadrat (eine Seitenlänge)
Rectangle quadrat = new Rectangle(4.0);  // 4.0 × 4.0
```

### 3. 🧮 Methoden

**Berechnungsmethoden:**
```java
double flaeche = rechteck.berechneFlaече();      // L × B
double umfang = rechteck.berechneUmfang();       // 2 × (L + B)
double diagonale = rechteck.berechneDiagonale(); // √(L² + B²)
```

**Prüfmethoden:**
```java
boolean istQuadrat = rechteck.istQuadrat();  // L == B ?
```

**Vergleichsmethoden:**
```java
r1.hatGleicheFlaecheWie(r2);  // Gleiche Fläche?
r1.istGroesserAls(r2);         // Größere Fläche?
```

**Manipulationsmethoden:**
```java
rechteck.verdoppeln();      // Größe × 2
rechteck.halbieren();       // Größe × 0.5
rechteck.skaliere(1.5);     // Größe × 1.5
```

## Dateien

- **Rectangle.java**: Die Rechteck-Klasse mit allen Methoden
- **RectangleTest.java**: Umfassendes Test-Programm mit 12 Beispielen
- **rectangle-diagrams.md**: UML-Diagramme (Mermaid-Format)
- **README.md**: Diese Datei

## Programm ausführen

```bash
# In das Verzeichnis wechseln
cd examples/oop-konzepte/rechteck-beispiel

# Kompilieren
javac Rectangle.java RectangleTest.java

# Ausführen
java RectangleTest
```

## Erwartete Ausgabe (Auszug)

```
╔═══════════════════════════════════════════════════╗
║     RECHTECK (RECTANGLE) - OOP DEMONSTRATION      ║
╚═══════════════════════════════════════════════════╝

>>> 1. Standard-Rechteck erstellen <<<

╔════════════════════════════════════╗
║      RECHTECK INFORMATION          ║
╠════════════════════════════════════╣
║ Länge:      1.00                   ║
║ Breite:     1.00                   ║
║ Fläche:     1.00                   ║
║ Umfang:     4.00                   ║
║ Diagonale:  1.41                   ║
║ Quadrat?    Ja                     ║
╚════════════════════════════════════╝

┌────┐
│    │
└────┘
```

## Mathematische Formeln

Die Rectangle-Klasse implementiert folgende Formeln:

| Berechnung | Formel | Code |
|------------|--------|------|
| **Fläche** | A = Länge × Breite | `berechneFlaече()` |
| **Umfang** | U = 2 × (Länge + Breite) | `berechneUmfang()` |
| **Diagonale** | d = √(Länge² + Breite²) | `berechneDiagonale()` |

### Beispiel-Berechnungen:

**Rechteck 5 × 3:**
- Fläche: 5 × 3 = **15**
- Umfang: 2 × (5 + 3) = **16**
- Diagonale: √(5² + 3²) = √(25 + 9) = √34 ≈ **5.83**

## Test-Programm Übersicht

Das `RectangleTest`-Programm demonstriert:

1. ✅ Standard-Rechteck erstellen
2. ✅ Rechteck mit Parametern
3. ✅ Quadrat erstellen
4. ✅ Berechnungen durchführen
5. ✅ Setter verwenden
6. ✅ Validierung testen
7. ✅ Rechtecke vergleichen
8. ✅ Skalierung (verdoppeln, halbieren)
9. ✅ Benutzerdefinierte Skalierung
10. ✅ Array von Rechtecken
11. ✅ Größtes Rechteck finden
12. ✅ Verschiedene Größen visualisieren

## Wichtige Konzepte

### this-Keyword

```java
public void setLaenge(double laenge) {
    this.laenge = laenge;  // this.laenge = Attribut
                           // laenge = Parameter
}
```

### Validierung in Settern

```java
public void setBreite(double breite) {
    if (breite > 0) {
        this.breite = breite;  // OK
    } else {
        System.out.println("Fehler: Breite muss positiv sein!");
        this.breite = 1.0;  // Fallback-Wert
    }
}
```

### Methoden rufen andere Methoden auf

```java
public void verdoppeln() {
    skaliere(2.0);  // Nutzt existierende Methode
}

public void halbieren() {
    skaliere(0.5);  // Wiederverwendung von Code
}
```

## Erweiterungsmöglichkeiten

Du kannst die Rectangle-Klasse erweitern mit:

1. **Square-Klasse** (erbt von Rectangle)
   ```java
   public class Square extends Rectangle {
       public Square(double seite) {
           super(seite, seite);
       }
   }
   ```

2. **Farb-Attribut**
   ```java
   private String farbe;
   ```

3. **Position**
   ```java
   private int x, y;  // Position im Koordinatensystem
   ```

4. **Rotation**
   ```java
   private double winkel;
   public void rotiere(double grad) { ... }
   ```

5. **Überlappung prüfen**
   ```java
   public boolean ueberlapptMit(Rectangle anderes) { ... }
   ```

## Lernziele

Nach diesem Beispiel solltest du:

- [ ] Klassen mit privaten Attributen erstellen können
- [ ] Konstruktoren mit verschiedenen Parametern schreiben
- [ ] Getter und Setter mit Validierung implementieren
- [ ] Berechnungsmethoden erstellen
- [ ] Objekte vergleichen können
- [ ] Methoden für Manipulation schreiben
- [ ] toString() überschreiben
- [ ] Mit Arrays von Objekten arbeiten

## Vergleich: Prozedural vs. OOP

### ❌ Prozedural (ohne OOP):

```java
double[] rechteck = {5.0, 3.0};  // [länge, breite]
double flaeche = rechteck[0] * rechteck[1];
double umfang = 2 * (rechteck[0] + rechteck[1]);
```

**Probleme:**
- Keine Kapselung
- Keine Validierung
- Schwer erweiterbar
- Fehleranfällig

### ✅ OOP (mit Rectangle-Klasse):

```java
Rectangle rechteck = new Rectangle(5.0, 3.0);
double flaeche = rechteck.berechneFlaече();
double umfang = rechteck.berechneUmfang();
```

**Vorteile:**
- Klare Struktur
- Validierung eingebaut
- Einfach erweiterbar
- Selbstdokumentierend

## Tipps

💡 **Tipp 1:** Nutze die `zeichne()`-Methode, um Rechtecke visuell zu vergleichen!

💡 **Tipp 2:** Die Validierung in den Settern verhindert ungültige Werte!

💡 **Tipp 3:** Experimentiere mit verschiedenen Skalierungsfaktoren!

💡 **Tipp 4:** Erstelle ein Array von Rechtecken und finde das größte!

## Häufige Fehler

❌ **Fehler 1:** Negative Werte verwenden
```java
Rectangle r = new Rectangle(-5, 3);  // Funktioniert, aber Validierung setzt Standardwert
```

✅ **Richtig:**
```java
Rectangle r = new Rectangle(5, 3);  // Positive Werte verwenden
```

---

❌ **Fehler 2:** Direkt auf Attribute zugreifen wollen
```java
rechteck.laenge = 10;  // FEHLER: laenge ist private!
```

✅ **Richtig:**
```java
rechteck.setLaenge(10);  // Setter verwenden
```

---

❌ **Fehler 3:** Vergessen, dass Skalierung permanent ist
```java
rechteck.verdoppeln();  // Ändert das Objekt!
rechteck.verdoppeln();  // Jetzt 4× größer!
```

✅ **Richtig:** Verstehen, dass Methoden das Objekt verändern

## Nächste Schritte

1. Führe `RectangleTest.java` aus
2. Studiere die Methoden in `Rectangle.java`
3. Betrachte die UML-Diagramme
4. Erweitere die Klasse um eigene Methoden
5. Erstelle eine `Square`-Klasse, die von `Rectangle` erbt
6. Implementiere weitere geometrische Formen (Circle, Triangle)

## Quellen und weiterführende Links

- Java API Dokumentation: https://docs.oracle.com/javase/8/docs/api/
- Math.sqrt() Dokumentation: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html

---

**Viel Erfolg beim Lernen! 🎉**
