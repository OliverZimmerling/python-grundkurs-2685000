# Zählerschleife (For-Schleife) - Countdown Beispiel

## Übersicht

Dieses Beispiel demonstriert die Verwendung einer **Zählerschleife** (for-Schleife) in Java.
Die Zählerschleife ist eine kopfgesteuerte Schleife, die so oft durchlaufen wird, bis eine
Zählervariable ausgehend von einem Startwert ihren Endwert erreicht hat.

## Was ist eine Zählerschleife?

Die Zählerschleife ist eine spezielle Art einer kopfgesteuerten Schleife. Sie wird so oft
durchlaufen, bis eine Zählervariable ausgehend von einem Startwert ihren Endwert erreicht hat.
Dabei verändert sich normalerweise die Zählervariable bei jedem Durchgang immer um den gleichen
festgelegten Wert.

Bei der Zählerschleife ist im Normalfall im Voraus bekannt, wie oft der Schleifenrumpf
durchlaufen wird.

## Java Syntax

```java
for (startwert; endwert; wertveränderung) {
    // Anweisungen;
}
```

### Erläuterungen:

- **startwert**: legt den Wert fest, ab dem gezählt wird. Diese Variable wird typischerweise
  an Ort und Stelle sowohl deklariert als auch initialisiert.
  - Beispiel: `for (int i = 0; ...`

- **endwert**: wird durch eine Bedingung formuliert. Diese muss den Wert `false` ergeben,
  um die Schleife zu verlassen.
  - Beispiel: `for (int i = 0; i < 3; ...`

- **wertveränderung**: gibt an, wie sich die Zählervariable bei jedem Durchlauf verändern soll.
  - Beispiel: `for (int i = 0; i < 2; i = i + 1)`

## Übung: Countdown

Erstellen Sie eine Kontrollstruktur, die einen Countdown beginnend mit der Zahl zehn simuliert.

## Dateien

### Code
- **Countdown.java**: Die Java-Implementierung des Countdown-Programms

### Grafische Darstellungen
- **DIAGRAMME.md**: 📊 **Übersicht über alle verfügbaren Diagrammformate** (Start hier!)
- **Countdown-Aktivitaetsdiagramm.md**: Einfaches Mermaid-Aktivitätsdiagramm
- **countdown-mermaid-detailed.md**: 5 verschiedene Mermaid-Diagrammvarianten
- **countdown-activity.puml**: PlantUML-Diagramm (UML-Standard)
- **countdown-ascii-diagram.txt**: Textbasiertes ASCII-Art Diagramm

> 💡 **Tipp:** Öffnen Sie zuerst die Datei `DIAGRAMME.md` für eine vollständige Übersicht
> aller grafischen Darstellungen und deren Verwendungszwecke!

## Programm ausführen

```bash
# Kompilieren
javac Countdown.java

# Ausführen
java Countdown
```

## Erwartete Ausgabe

```
10
9
8
7
6
5
4
3
2
1
0
```

## Lernziele

- Verstehen der Syntax einer for-Schleife
- Anwenden einer Zählerschleife mit Dekrementierung
- Visualisierung des Programmablaufs mit einem Aktivitätsdiagramm
- Erkennen, dass die Anzahl der Schleifendurchläufe im Voraus bekannt ist (11 Durchläufe)
