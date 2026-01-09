# Objektorientierte Programmierung (OOP) in Java

## Übersicht

Die **Objektorientierte Programmierung (OOP)** ist ein Programmierparadigma, das auf dem Konzept von "Objekten" basiert. Objekte enthalten Daten (Attribute) und Code (Methoden).

## Die vier Grundprinzipien der OOP

### 1. 🔒 Kapselung (Encapsulation)
- Daten (Attribute) werden vor direktem Zugriff geschützt
- Zugriff erfolgt über Methoden (Getter/Setter)
- Nutzt Zugriffsmodifikatoren: `private`, `protected`, `public`

### 2. 🧬 Vererbung (Inheritance)
- Klassen können Eigenschaften von anderen Klassen erben
- Fördert Wiederverwendbarkeit von Code
- Schlüsselwort: `extends`

### 3. 🎭 Polymorphismus (Polymorphism)
- "Viele Formen" - Objekte können verschiedene Formen annehmen
- Methodenüberladung (Overloading)
- Methodenüberschreibung (Overriding)

### 4. 🎯 Abstraktion (Abstraction)
- Verstecken von Implementierungsdetails
- Zeigen nur das Wesentliche
- Nutzt abstrakte Klassen und Interfaces

## Grundkonzepte

### Klasse (Class)
Eine **Klasse** ist ein Bauplan für Objekte. Sie definiert:
- **Attribute**: Eigenschaften eines Objekts (Variablen)
- **Methoden**: Verhalten eines Objekts (Funktionen)
- **Konstruktoren**: Spezielle Methoden zur Objekterstellung

### Objekt (Object)
Ein **Objekt** ist eine konkrete Instanz einer Klasse.

```java
// Klasse = Bauplan
class Auto {
    String farbe;
    int ps;
}

// Objekt = konkrete Instanz
Auto meinAuto = new Auto();
```

## Beispiel: Person und Student

In diesem Beispiel zeigen wir die OOP-Konzepte anhand eines klassischen Beispiels:

- **Person**: Basisklasse mit grundlegenden Eigenschaften
- **Student**: Erbt von Person und fügt spezifische Eigenschaften hinzu

## Struktur einer Java-Klasse

```java
public class KlassenName {

    // 1. Attribute (Eigenschaften)
    private Datentyp attribut;

    // 2. Konstruktor
    public KlassenName(Parameter) {
        // Initialisierung
    }

    // 3. Methoden (Verhalten)
    public Rückgabetyp methodenName() {
        // Code
    }

    // 4. Getter und Setter
    public Datentyp getAttribute() {
        return attribut;
    }

    public void setAttribute(Datentyp wert) {
        this.attribut = wert;
    }
}
```

## Zugriffsmodifikatoren

| Modifikator | Zugriff innerhalb Klasse | Zugriff innerhalb Package | Zugriff in Subklasse | Zugriff überall |
|-------------|--------------------------|---------------------------|----------------------|-----------------|
| `private` | ✓ | ✗ | ✗ | ✗ |
| (default) | ✓ | ✓ | ✗ | ✗ |
| `protected` | ✓ | ✓ | ✓ | ✗ |
| `public` | ✓ | ✓ | ✓ | ✓ |

## Dateien in diesem Beispiel

### Code-Beispiele
- **Person.java**: Basisklasse mit grundlegenden Attributen
- **Student.java**: Erbt von Person, demonstriert Vererbung
- **Main.java**: Hauptprogramm zum Testen der Klassen

### Grafische Darstellungen
- **DIAGRAMME.md**: 📊 **Übersicht aller UML-Diagramme** (Start hier!)
- **oop-class-diagram.puml**: PlantUML Klassendiagramm (Person & Student)
- **oop-object-diagram.puml**: PlantUML Objektdiagramm (Instanzen)
- **oop-mermaid-diagrams.md**: 6 verschiedene Mermaid-Diagrammvarianten
- **oop-ascii-diagrams.txt**: Umfassende ASCII-basierte Diagramme

> 💡 **Tipp:** Öffnen Sie zuerst die Datei `DIAGRAMME.md` für eine vollständige Übersicht
> aller grafischen Darstellungen und Verwendungsempfehlungen!

## Programm ausführen

```bash
# Alle Dateien kompilieren
javac *.java

# Hauptprogramm ausführen
java Main
```

## Lernziele

- ✓ Verstehen der vier OOP-Grundprinzipien
- ✓ Klassen und Objekte erstellen
- ✓ Attribute und Methoden verwenden
- ✓ Konstruktoren implementieren
- ✓ Kapselung mit Getter/Setter umsetzen
- ✓ Vererbung anwenden
- ✓ UML-Klassendiagramme lesen und erstellen

## Wichtige Begriffe

| Begriff | Englisch | Bedeutung |
|---------|----------|-----------|
| Klasse | Class | Bauplan für Objekte |
| Objekt | Object | Instanz einer Klasse |
| Attribut | Attribute/Field | Eigenschaft eines Objekts |
| Methode | Method | Verhalten eines Objekts |
| Konstruktor | Constructor | Spezielle Methode zur Objekterstellung |
| Instanz | Instance | Konkretes Objekt einer Klasse |
| Vererbung | Inheritance | Übernahme von Eigenschaften |
| this | this | Referenz auf aktuelles Objekt |
| super | super | Referenz auf Elternklasse |

## Nächste Schritte

1. Studieren Sie die Code-Beispiele
2. Betrachten Sie die UML-Diagramme
3. Führen Sie das Programm aus
4. Erweitern Sie die Klassen um eigene Attribute/Methoden
5. Erstellen Sie eigene Klassen (z.B. Lehrer, Kurs)
