# Rechteck mit Position - Korrigierte Version

## ❌ Was war falsch in deinem Code?

### Dein Original-Code:

```java
public class KlassenkarteRechteck {
    public class Rechteck{
        private int positionX;
        private int positionY;
        private int breite;
        private int hoehe;
        private String farbe;
    }
    public Rechteck(int positionX, int positionY,int breite, int hoehe, String farbe){
        this.positionX = positionX;
        this.positionY = positionY;
        this.breite = breite;
        this.hoehe = hoehe;
        this.farbe = farbe;}
}
```

---

## 🔴 Fehler 1: Verschachtelte Klassen

```java
public class KlassenkarteRechteck {
    public class Rechteck {  // ← PROBLEM: Rechteck ist INNERHALB!
        ...
    }
}
```

**Problem:** `Rechteck` ist eine **innere Klasse** von `KlassenkarteRechteck`.

**Lösung:** Jede Klasse in eine eigene Datei!

```java
// Datei: Rechteck.java
public class Rechteck {
    ...
}
```

---

## 🔴 Fehler 2: Konstruktor in falscher Klasse!

**Das ist der HAUPTFEHLER!**

```java
public class KlassenkarteRechteck {
    public class Rechteck {
        private int positionX;
        private int positionY;
        ...
    }  // ← Rechteck-Klasse endet HIER!

    // ❌ FALSCH: Konstruktor ist AUSSERHALB der Rechteck-Klasse!
    public Rechteck(int positionX, ...) {
        this.positionX = positionX;
        ...
    }
}
```

**Der Konstruktor gehört INNERHALB der Klasse!**

```java
public class Rechteck {
    private int positionX;
    ...

    // ✅ RICHTIG: Konstruktor INNERHALB der Klasse
    public Rechteck(int positionX, ...) {
        this.positionX = positionX;
        ...
    }
}  // ← Klasse schließen!
```

---

## 🔴 Fehler 3: Fehlende schließende Klammern

```java
public class Rechteck {
    private int positionX;
    ...
}  // ← Diese Klammer fehlt bei dir!
```

**Jede öffnende `{` braucht eine schließende `}`!**

---

## 🔴 Fehler 4: Keine Getter/Setter

```java
private int positionX;  // Private, aber keine Getter/Setter!
```

**Wenn Attribute `private` sind, brauchst du Getter/Setter für Zugriff von außen!**

---

## ✅ Vollständig korrigierter Code

### Datei: Rechteck.java

```java
public class Rechteck {

    // 1. ATTRIBUTE (private)
    private int positionX;
    private int positionY;
    private int breite;
    private int hoehe;
    private String farbe;

    // 2. KONSTRUKTOR (INNERHALB der Klasse!)
    public Rechteck(int positionX, int positionY, int breite, int hoehe, String farbe) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.breite = breite;
        this.hoehe = hoehe;
        this.farbe = farbe;
    }

    // 3. GETTER
    public int getPositionX() { return positionX; }
    public int getPositionY() { return positionY; }
    public int getBreite() { return breite; }
    public int getHoehe() { return hoehe; }
    public String getFarbe() { return farbe; }

    // 4. SETTER
    public void setPositionX(int positionX) { this.positionX = positionX; }
    public void setPositionY(int positionY) { this.positionY = positionY; }
    public void setBreite(int breite) { this.breite = breite; }
    public void setHoehe(int hoehe) { this.hoehe = hoehe; }
    public void setFarbe(String farbe) { this.farbe = farbe; }

    // 5. METHODEN
    public void verschieben(int dx, int dy) {
        this.positionX += dx;
        this.positionY += dy;
    }

    public int berechneFlaече() {
        return breite * hoehe;
    }

}  // ← WICHTIG: Schließende Klammer!
```

---

## 📝 So erstellst du Objekte

```java
// Objekt erstellen:
Rechteck rect1 = new Rechteck(10, 20, 5, 3, "Rot");
//       ▲             ▲         ▲   ▲   ▲  ▲   ▲
//       │             │         │   │   │  │   └─ farbe
//       │             │         │   │   │  └───── hoehe
//       │             │         │   │   └──────── breite
//       │             │         │   └─────────── positionY
//       │             │         └────────────── positionX
//       │             └──────────────────────── "new" erstellt Objekt
//       └────────────────────────────────────── Name des Objekts

// Mit dem Objekt arbeiten:
rect1.zeigeInfo();                    // Methode aufrufen
int x = rect1.getPositionX();         // Getter verwenden
rect1.setFarbe("Blau");               // Setter verwenden
rect1.verschieben(5, 10);             // Methode aufrufen
```

---

## 🎯 Vergleich: Vorher vs. Nachher

### ❌ VORHER (dein Code)

```java
public class KlassenkarteRechteck {
    public class Rechteck{               // ← Verschachtelt
        private int positionX;
        private int positionY;
        private int breite;
        private int hoehe;
        private String farbe;
    }                                    // ← Rechteck endet hier
    public Rechteck(int positionX, ...){ // ← Konstruktor AUSSERHALB!
        this.positionX = positionX;
        ...
    }
}                                        // ← Keine Getter/Setter
```

**Probleme:**
- ❌ Verschachtelte Klassen
- ❌ Konstruktor in falscher Klasse
- ❌ Fehlende Getter/Setter
- ❌ Keine Methoden

---

### ✅ NACHHER (korrigiert)

```java
// Datei: Rechteck.java
public class Rechteck {                  // ← Eigene Datei!
    // Attribute
    private int positionX;
    private int positionY;
    private int breite;
    private int hoehe;
    private String farbe;

    // Konstruktor (INNERHALB!)
    public Rechteck(int positionX, int positionY, int breite, int hoehe, String farbe) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.breite = breite;
        this.hoehe = hoehe;
        this.farbe = farbe;
    }

    // Getter
    public int getPositionX() { return positionX; }
    public int getPositionY() { return positionY; }
    // ... weitere Getter

    // Setter
    public void setPositionX(int x) { this.positionX = x; }
    public void setPositionY(int y) { this.positionY = y; }
    // ... weitere Setter

    // Methoden
    public void verschieben(int dx, int dy) { ... }
    public int berechneFlaече() { ... }
    public void zeigeInfo() { ... }

}  // ← Schließende Klammer!
```

**Verbesserungen:**
- ✅ Eigene Datei (nicht verschachtelt)
- ✅ Konstruktor INNERHALB der Klasse
- ✅ Getter und Setter vorhanden
- ✅ Nützliche Methoden
- ✅ Alle Klammern geschlossen

---

## 📚 Wichtige Regeln

### 1. Eine Klasse = Eine Datei

```
Rechteck.java  ← Enthält nur die Rechteck-Klasse
Main.java      ← Enthält nur die Main-Klasse
```

### 2. Struktur einer Klasse

```java
public class Rechteck {
    // 1. Attribute (ganz oben)
    private int x;

    // 2. Konstruktor (nach Attributen)
    public Rechteck(...) {
        ...
    }

    // 3. Getter/Setter
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    // 4. Andere Methoden
    public void verschieben(...) { ... }

}  // ← Schließende Klammer nicht vergessen!
```

### 3. Konstruktor muss INNERHALB sein!

```java
public class Rechteck {
    private int x;

    // ✅ RICHTIG: Konstruktor INNERHALB
    public Rechteck(int x) {
        this.x = x;
    }

}  // ← Klasse endet hier

// ❌ FALSCH: Konstruktor AUSSERHALB
// public Rechteck(int x) { ... }  // ← Das ist AUSSERHALB!
```

---

## 🚀 Programm ausführen

```bash
# Kompilieren
javac Rechteck.java RechteckTest.java

# Ausführen
java RechteckTest
```

---

## 💡 Zusammenfassung der Korrekturen

| Was war falsch | Warum falsch | Wie korrigiert |
|----------------|--------------|----------------|
| Verschachtelte Klassen | Macht Verwendung kompliziert | Jede Klasse in eigene Datei |
| Konstruktor außerhalb | Gehört in die Klasse | Konstruktor in Klasse verschieben |
| Fehlende `}` | Syntax-Fehler | Alle Klammern schließen |
| Keine Getter/Setter | Kein Zugriff auf private Attribute | Getter/Setter hinzufügen |

---

## ✅ Checkliste für deine Klassen

Wenn du eine Klasse schreibst, überprüfe:

- [ ] Ist die Klasse in einer eigenen Datei? (nicht verschachtelt)
- [ ] Ist der Konstruktor INNERHALB der Klasse?
- [ ] Sind alle Klammern `{` und `}` korrekt?
- [ ] Hast du Getter für alle private Attribute?
- [ ] Hast du Setter für alle veränderbaren Attribute?
- [ ] Hast du sinnvolle Methoden?
- [ ] Hast du toString() überschrieben?

---

**Jetzt ist dein Code vollständig und richtig! 🎉**

**Siehe `Rechteck.java` für die korrigierte Version!**
