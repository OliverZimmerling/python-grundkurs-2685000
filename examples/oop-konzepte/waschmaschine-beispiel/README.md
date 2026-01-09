# Waschmaschine-Klasse - Korrigierte Version

## ❌ Was war falsch im Original-Code?

### Problem 1: Verschachtelte Klassen

**Dein Code:**
```java
public class MeineErsteKlassenkarte {
    public class Waschmaschine {  // ← Innere Klasse (meist nicht gewollt!)
        ...
    }
}
```

**Problem:** `Waschmaschine` ist eine **innere Klasse** von `MeineErsteKlassenkarte`. Das macht die Verwendung kompliziert!

**Lösung:** Jede Klasse in eine eigene Datei:
```java
// Datei: Waschmaschine.java
public class Waschmaschine {
    ...
}
```

---

### Problem 2: Fehlende schließende Klammer

**Dein Code:**
```java
public class MeineErsteKlassenkarte {
    public class Waschmaschine {
        ...
    }
    // ← Hier fehlt eine }
```

**Lösung:** Jede `{` braucht eine `}`!

---

### Problem 3: Keine Getter/Setter

**Dein Code:**
```java
private String modell;  // Private, aber keine Getter/Setter!
```

**Problem:** Wenn Attribute `private` sind, kannst du von außen nicht darauf zugreifen!

**Lösung:** Getter und Setter hinzufügen:
```java
public String getModell() {
    return modell;
}

public void setModell(String modell) {
    this.modell = modell;
}
```

---

### Problem 4: Variablennamen

**Dein Code:**
```java
private double lpreis;      // Was bedeutet "l"?
private boolean lesparPrg;  // Schwer lesbar!
```

**Besser:**
```java
private double preis;                  // Klar und deutlich
private boolean energiesparProgramm;   // Ausgeschrieben
```

---

## ✅ Vollständig korrigierter Code

Siehe Datei: `Waschmaschine.java`

---

## 🎯 Wie erstellt man Objekte?

### Schritt 1: Klasse erstellen (Bauplan)

Die Klasse ist der **Bauplan** (bereits erstellt in `Waschmaschine.java`)

### Schritt 2: Objekt erstellen

```java
// So erstellt man ein Objekt:
Waschmaschine meineMaschine = new Waschmaschine("Bosch", 75, 599.99, true);
//     ▲              ▲           ▲                     ▲
//     │              │           │                     └─ Konstruktor-Parameter
//     │              │           └─────────────────────── "new" erstellt Objekt
//     │              └─────────────────────────────────── Name des Objekts
//     └────────────────────────────────────────────────── Typ (Klasse)
```

### Schritt 3: Mit dem Objekt arbeiten

```java
// Werte auslesen (Getter)
String modell = meineMaschine.getModell();
double preis = meineMaschine.getPreis();

// Werte ändern (Setter)
meineMaschine.setPreis(499.99);

// Methoden aufrufen
meineMaschine.starten("Buntwäsche");
meineMaschine.zeigeInfo();
```

---

## 📋 Struktur einer Klasse

```java
public class Waschmaschine {

    // 1. ATTRIBUTE (private!)
    private String modell;
    private int gewicht;

    // 2. KONSTRUKTOR
    public Waschmaschine(String modell, int gewicht) {
        this.modell = modell;
        this.gewicht = gewicht;
    }

    // 3. GETTER (Lesemethoden)
    public String getModell() {
        return modell;
    }

    // 4. SETTER (Schreibmethoden)
    public void setModell(String modell) {
        this.modell = modell;
    }

    // 5. ANDERE METHODEN
    public void starten(String programm) {
        System.out.println("Starte " + programm);
    }
}
```

---

## 🎮 Programm ausführen

```bash
# In das Verzeichnis wechseln
cd examples/oop-konzepte/waschmaschine-beispiel

# Kompilieren
javac Waschmaschine.java WaschmaschineTest.java

# Ausführen
java WaschmaschineTest
```

---

## 📚 Wichtige Konzepte

### 1. Kapselung

**Private Attribute:**
```java
private String modell;  // Kann nur innerhalb der Klasse zugegriffen werden
```

**Public Methoden:**
```java
public String getModell() {  // Kann von überall aufgerufen werden
    return modell;
}
```

### 2. Konstruktor

**Der Konstruktor erstellt das Objekt:**
```java
public Waschmaschine(String modell, int gewicht, double preis, boolean energiesparProgramm) {
    this.modell = modell;           // ← "this" = aktuelles Objekt
    this.gewicht = gewicht;
    this.preis = preis;
    this.energiesparProgramm = energiesparProgramm;
}
```

### 3. this-Keyword

**`this` bezieht sich auf das aktuelle Objekt:**
```java
private String modell;

public void setModell(String modell) {
    this.modell = modell;
    //   ▲           ▲
    //   │           └─ Parameter
    //   └──────────── Attribut des Objekts
}
```

---

## 💡 Vergleich: Vorher vs. Nachher

### ❌ Vorher (Dein Code)

```java
public class MeineErsteKlassenkarte {
    public class Waschmaschine {
        private String modell;
        private int gewicht;
        private double lpreis;
        private boolean lesparPrg;

        public Waschmaschine(String modell, int gewicht, double lpreis, boolean lesparPrg) {
            this.modell = modell;
            this.gewicht = gewicht;
            this.lpreis = lpreis;
            this.lesparPrg = lesparPrg;
        }
    }  // ← Fehlende Getter/Setter, fehlende }, verschachtelte Klasse
```

**Probleme:**
- Verschachtelte Klassen
- Fehlende schließende Klammer
- Keine Getter/Setter
- Schlechte Variablennamen

### ✅ Nachher (Korrigiert)

```java
// Datei: Waschmaschine.java
public class Waschmaschine {
    // Private Attribute
    private String modell;
    private int gewicht;
    private double preis;
    private boolean energiesparProgramm;

    // Konstruktor
    public Waschmaschine(String modell, int gewicht, double preis, boolean energiesparProgramm) {
        this.modell = modell;
        this.gewicht = gewicht;
        this.preis = preis;
        this.energiesparProgramm = energiesparProgramm;
    }

    // Getter
    public String getModell() { return modell; }
    public int getGewicht() { return gewicht; }
    public double getPreis() { return preis; }
    public boolean hatEnergiesparProgramm() { return energiesparProgramm; }

    // Setter
    public void setModell(String modell) { this.modell = modell; }
    public void setGewicht(int gewicht) { this.gewicht = gewicht; }
    public void setPreis(double preis) { this.preis = preis; }
    public void setEnergiesparProgramm(boolean e) { this.energiesparProgramm = e; }

    // Weitere Methoden
    public void starten(String programm) { ... }
    public void zeigeInfo() { ... }
}
```

**Verbesserungen:**
- ✅ Eigene Datei (nicht verschachtelt)
- ✅ Alle Klammern geschlossen
- ✅ Getter und Setter vorhanden
- ✅ Klare Variablennamen

---

## 🎯 Checkliste für eine gute Klasse

Beim Erstellen einer Klasse solltest du immer haben:

- [ ] **Attribute** (private)
- [ ] **Konstruktor** (mindestens einer)
- [ ] **Getter** für alle private Attribute
- [ ] **Setter** für veränderbare Attribute
- [ ] **Methoden** für das Verhalten
- [ ] **toString()** für String-Darstellung (optional aber empfohlen)

---

## 📖 Beispiel: Objekte erstellen

```java
// Drei verschiedene Waschmaschinen-Objekte:

Waschmaschine wm1 = new Waschmaschine("Bosch", 75, 599.99, true);
Waschmaschine wm2 = new Waschmaschine("Siemens", 80, 749.50, true);
Waschmaschine wm3 = new Waschmaschine("Miele", 70, 450.00, false);

// Jetzt hast du 3 verschiedene Waschmaschinen!
// Alle vom Typ "Waschmaschine", aber mit unterschiedlichen Werten

wm1.zeigeInfo();  // Zeigt Info von Waschmaschine 1
wm2.zeigeInfo();  // Zeigt Info von Waschmaschine 2
wm3.zeigeInfo();  // Zeigt Info von Waschmaschine 3
```

---

## ✨ Zusammenfassung

### Was du gelernt hast:

1. **Klassen richtig strukturieren** (nicht verschachteln)
2. **Attribute private machen** (Kapselung)
3. **Getter und Setter erstellen** (Zugriff von außen)
4. **Konstruktoren schreiben** (Objekte initialisieren)
5. **Objekte erstellen** mit `new`
6. **Mit Objekten arbeiten** (Methoden aufrufen)

### Deine Klasse ist jetzt:
- ✅ Vollständig
- ✅ Gut strukturiert
- ✅ Nach OOP-Prinzipien
- ✅ Mit Validierung
- ✅ Einsatzbereit!

---

**Gut gemacht! Du hast deine erste richtige OOP-Klasse erstellt! 🎉**
