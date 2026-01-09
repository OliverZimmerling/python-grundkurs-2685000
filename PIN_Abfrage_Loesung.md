# PIN-Abfrage mit fußgesteuerter Schleife (do-while)

## Übersicht

Diese Lösung implementiert eine PIN-Abfrage mit einer **fußgesteuerten Schleife** (do-while-Schleife).

## Dateien

1. **Pin_Abfrage_DoWhile.java** - Java-Implementierung mit do-while-Schleife
2. **PIN_Aktivitaetsdiagramm.md** - Aktivitätsdiagramm als ASCII-Art mit Erklärungen
3. **PIN_Aktivitaetsdiagramm.plantuml** - PlantUML-Diagramm (kann mit PlantUML-Tool visualisiert werden)

## Unterschied: Original vs. do-while-Lösung

### Original (einfache if-else):
```java
// Nur EINE Abfrage möglich
int eingabe = scanner.nextInt();
if(eingabe == pin) {
    System.out.println("Richtiger Pin!");
} else {
    System.out.println("Falscher Pin!");
}
// Programm endet hier - keine weitere Chance!
```

### Neue Lösung (do-while):
```java
// Wiederholte Abfragen möglich
do {
    System.out.println("Bitte geben Sie Ihren PIN ein: ");
    eingabe = scanner.nextInt();

    if (eingabe != pin) {
        System.out.println("Falscher PIN! Bitte versuchen Sie es erneut.");
    }

} while (eingabe != pin);  // Wiederhole, solange PIN falsch ist

System.out.println("Richtiger PIN! Zugang gewährt.");
```

## Eigenschaften der fußgesteuerten Schleife

✓ **Mindestens ein Durchlauf**: Der Schleifenrumpf wird IMMER mindestens einmal ausgeführt

✓ **Bedingung am Ende**: Die Abbruchbedingung wird erst NACH dem ersten Durchlauf geprüft

✓ **Wiederholung**: Die Schleife läuft weiter, solange die Bedingung wahr ist

✓ **Semikolon**: Die do-while-Schleife endet mit einem Semikolon (;)

## Programm ausführen

```bash
# Kompilieren
javac Pin_Abfrage_DoWhile.java

# Ausführen
java Pin_Abfrage_DoWhile
```

## Beispiel-Ablauf

```
Bitte geben Sie einen PIN ein, den Sie sich merken sollten:
1234
Ihr PIN wurde gespeichert.

Bitte geben Sie Ihren PIN ein:
1111
Falscher PIN! Bitte versuchen Sie es erneut.

Bitte geben Sie Ihren PIN ein:
1234
Richtiger PIN! Zugang gewährt.
```

## PlantUML-Diagramm visualisieren

Um das PlantUML-Diagramm zu visualisieren, kannst du:

1. **Online**: https://www.plantuml.com/plantuml/uml/
2. **VS Code Extension**: PlantUML Extension installieren
3. **Kommandozeile**: `plantuml PIN_Aktivitaetsdiagramm.plantuml`

## Wichtige Konzepte

| Konzept | Beschreibung |
|---------|--------------|
| **Schleifenrumpf** | Der Code-Block zwischen `do {` und `}` |
| **Abbruchbedingung** | Die Bedingung in `while(...)` am Ende |
| **Initialisierung** | Variable `eingabe` muss vor der Schleife deklariert sein |
| **Iteration** | Jeder Durchlauf der Schleife |

## Vergleich der Schleifenarten

| Schleifenart | Bedingung | Min. Durchläufe |
|--------------|-----------|-----------------|
| **while** (kopfgesteuert) | Am Anfang | 0 oder mehr |
| **do-while** (fußgesteuert) | Am Ende | Mindestens 1 |
| **for** | Am Anfang | 0 oder mehr |

---

**Lernfeld 5 AP - Kontrollstrukturen**
