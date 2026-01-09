# Anleitung: Aktivitätsdiagramm visualisieren

## Datei-Übersicht

Das Aktivitätsdiagramm für die PIN-Abfrage ist in folgenden Formaten verfügbar:

1. **PIN_Aktivitaetsdiagramm_UML.plantuml** - PlantUML-Quelldatei (empfohlen)
2. **PIN_Aktivitaetsdiagramm_Visualisierung.md** - ASCII-Art Darstellung mit Erklärungen

## PlantUML-Diagramm visualisieren

### Option 1: Online (am einfachsten)

1. Öffne: https://www.plantuml.com/plantuml/uml/
2. Kopiere den Inhalt von `PIN_Aktivitaetsdiagramm_UML.plantuml`
3. Füge ihn in das Eingabefeld ein
4. Das Diagramm wird automatisch gerendert
5. Du kannst es als PNG oder SVG herunterladen

### Option 2: VS Code Extension

1. Installiere die Extension "PlantUML" in VS Code
2. Öffne die Datei `PIN_Aktivitaetsdiagramm_UML.plantuml`
3. Drücke `Alt + D` (Windows/Linux) oder `Option + D` (Mac)
4. Das Diagramm wird in einer Vorschau angezeigt
5. Rechtsklick → "Export Current Diagram" für PNG/SVG

### Option 3: Kommandozeile (PlantUML installiert)

```bash
# PlantUML installieren (wenn noch nicht vorhanden)
# Ubuntu/Debian:
sudo apt-get install plantuml

# MacOS:
brew install plantuml

# Diagramm generieren
plantuml PIN_Aktivitaetsdiagramm_UML.plantuml

# Erstellt: PIN_Aktivitaetsdiagramm_UML.png
```

### Option 4: Online mit direktem Link

Erstelle einen Link für die Online-Visualisierung:

```bash
# Encode die PlantUML-Datei
cat PIN_Aktivitaetsdiagramm_UML.plantuml | plantuml -encodeurl
```

## Diagramm-Elemente Erklärung

Das Diagramm zeigt die **fußgesteuerte Schleife (do-while)** mit:

### Knotentypen (nach UML-Standard)

| Element | Darstellung | Bedeutung |
|---------|-------------|-----------|
| **Startknoten** | ● (Gefüllter Kreis) | Programmstart |
| **Aktionsknoten** | ▭ (Rechteck) | Aktion/Anweisung |
| **Entscheidungsknoten** | ◆ (Raute) | Bedingung/Verzweigung |
| **Verbindungsknoten** | ● (Kleiner Kreis) | Zusammenführung/Schleifenpunkt |
| **Endknoten** | ⊗ (Kreis mit Ring) | Programmende |

### Kontrollfluss

```
Start
  ↓
PIN festlegen
  ↓
PIN speichern
  ↓
╔═══════════════════════════════╗
║   DO-WHILE-SCHLEIFE           ║
║                               ║
║  Verbindungsknoten            ║
║    ↓                          ║
║  PIN abfragen                 ║
║    ↓                          ║
║  Entscheidung: eingabe != pin?║
║    ├─[wahr]─→ Fehlermeldung   ║
║    │           ↓              ║
║    │         zurück zu ↑      ║
║    └─[falsch]─→ weiter        ║
╚═══════════════════════════════╝
  ↓
Erfolgsmeldung
  ↓
Ende
```

## Vergleich: Beispiel vs. PIN-Abfrage

### Beispiel aus dem Bild (i > 5)

```java
// Kopfgesteuerte Schleife (while)
while (i > 5) {
    System.out.println("Wert x ist größer als 5");
}
System.out.println("Wert x = " + x);
```

### PIN-Abfrage (fußgesteuert)

```java
// Fußgesteuerte Schleife (do-while)
do {
    System.out.println("Bitte geben Sie Ihren PIN ein: ");
    eingabe = scanner.nextInt();

    if (eingabe != pin) {
        System.out.println("Falscher PIN!");
    }
} while (eingabe != pin);

System.out.println("Richtiger PIN! Zugang gewährt.");
```

## Wichtige Unterschiede

| Merkmal | while (kopfgesteuert) | do-while (fußgesteuert) |
|---------|----------------------|------------------------|
| Bedingungsprüfung | Am Anfang | Am Ende |
| Min. Durchläufe | 0 | 1 |
| Beispiel im Bild | ✓ (i > 5) | - |
| PIN-Abfrage | - | ✓ (eingabe != pin) |

## Tipps für die Erstellung eigener Diagramme

1. **Beginne mit Startknoten** (●)
2. **Nummeriere die Schritte** gedanklich durch
3. **Identifiziere Entscheidungen** (◆) - immer eine Raute
4. **Markiere Schleifen** mit Verbindungsknoten
5. **Ende mit Endknoten** (⊗)

---

**Lernfeld 5 AP - Kontrollstrukturen**
*Erstellt für die Übung: Fußgesteuerte Schleife*
