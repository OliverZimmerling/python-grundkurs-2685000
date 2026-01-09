# Aktivitätsdiagramm: PIN-Abfrage mit fußgesteuerter Schleife

## Grafische Darstellung (UML-Aktivitätsdiagramm)

```
        ●  (Startknoten)
        |
        ↓
    ┌─────────────────────────────┐
    │ Eingabe: PIN festlegen      │
    │ "Geben Sie PIN ein"         │
    └─────────────────────────────┘
        |
        ↓
    ┌─────────────────────────────┐
    │ PIN speichern               │
    └─────────────────────────────┘
        |
        ↓
    ┌─────────────────────────────┐  ◄─────────┐
    │ Eingabe: PIN abfragen       │            │
    │ "Geben Sie Ihren PIN ein"   │            │
    └─────────────────────────────┘            │
        |                                      │
        ↓                                      │
       ◆ [eingabe != pin]                      │
      ╱ ╲                                      │
     ╱   ╲                                     │
    ╱     ╲                                    │
[wahr]  [falsch]                               │
    |       |                                  │
    ↓       ↓                                  │
┌───────┐   ┌─────────────────────────────┐   │
│Ausgabe│   │ Ausgabe:                    │   │
│"Falsch│   │ "Richtiger PIN!"            │   │
│er PIN"│   │ "Zugang gewährt"            │   │
└───────┘   └─────────────────────────────┘   │
    |               |                          │
    └───────────────┘                          │
            │                                  │
            │ (Rückkehr zum Schleifenkopf      │
            │  nur wenn PIN falsch)            │
            └──────────────────────────────────┘

            ↓
            ⊗  (Endknoten)
```

## Beschreibung der Elemente:

1. **Startknoten (●)**: Beginn des Programms

2. **Aktionsknoten (Rechtecke)**:
   - "PIN festlegen": Benutzer gibt PIN ein
   - "PIN speichern": PIN wird gespeichert
   - "PIN abfragen": Benutzer gibt PIN zur Überprüfung ein
   - "Ausgabe Fehlermeldung": Bei falschem PIN
   - "Ausgabe Erfolgsmeldung": Bei richtigem PIN

3. **Entscheidungsknoten (Raute ◆)**:
   - Bedingung: `eingabe != pin` (ist der eingegebene PIN falsch?)
   - [wahr]: PIN ist falsch → Fehlermeldung → zurück zur PIN-Abfrage
   - [falsch]: PIN ist richtig → Erfolgsmeldung → Programm endet

4. **Verbindungsknoten**: Zusammenführung der Pfade

5. **Endknoten (⊗)**: Programmende

## Besonderheit der fußgesteuerten Schleife:

- Die **Abbruchbedingung** steht am **Ende** (Fuß) der Schleife
- Der Schleifenrumpf (PIN-Abfrage) wird **mindestens einmal** durchlaufen
- Die Schleife wiederholt sich, **solange** `eingabe != pin` **wahr** ist
- Erst nach dem ersten Durchlauf wird die Bedingung geprüft

## Java-Code-Zuordnung:

```java
// Initialisierung (außerhalb der Schleife)
int eingabe;

// Fußgesteuerte Schleife
do {
    // Schleifenrumpf (wird immer mindestens einmal ausgeführt)
    System.out.println("Bitte geben Sie Ihren PIN ein: ");
    eingabe = scanner.nextInt();

    if (eingabe != pin) {
        System.out.println("Falscher PIN!");
    }

} while (eingabe != pin);  // Abbruchbedingung am Fuß
```
