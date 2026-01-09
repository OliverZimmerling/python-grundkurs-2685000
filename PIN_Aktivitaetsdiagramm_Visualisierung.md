# Aktivitätsdiagramm: PIN-Abfrage mit fußgesteuerter Schleife (do-while)

## Grafische Darstellung nach UML-Standard

```
                        ●                    ← Startknoten
                        │
                        ↓
            ┌───────────────────────┐
            │  Eingabe:             │
            │  PIN festlegen        │
            └───────────────────────┘
                        │
                        ↓
            ┌───────────────────────┐
            │  PIN speichern        │
            └───────────────────────┘
                        │
                        ↓
                        ●                    ← Verbindungsknoten
                        │                      (Schleifenbeginn)
            ┌───────────┼───────────┐
            │           │           │
            │           ↓           │
            │   ┌───────────────┐   │
            │   │  Eingabe:     │   │
            │   │  PIN abfragen │   │
            │   └───────────────┘   │
            │           │           │
            │           ↓           │
            │      ╱         ╲      │
            │     ╱           ╲     │
            │    ╱ eingabe !=  ╲    │      ← Entscheidungsknoten
            │   ╱     pin?      ╲   │
            │   ╲               ╱   │
            │    ╲             ╱    │
            │     ╲           ╱     │
            │      ╲         ╱      │
            │       ╱       ╲       │
            │   [wahr]   [falsch]   │
            │      │         │      │
            │      ↓         │      │
            │  ┌─────────┐   │      │
            │  │ Drucke: │   │      │
            │  │"Falscher│   │      │
            │  │  PIN!"  │   │      │
            │  └─────────┘   │      │
            │      │         │      │
            └──────┘         │
                             ↓
                 ┌───────────────────────┐
                 │  Drucke:              │
                 │  "Richtiger PIN!      │
                 │   Zugang gewährt"     │
                 └───────────────────────┘
                             │
                             ↓
                             ⊗               ← Endknoten
```

## Legende der Knotentypen

| Symbol | Name | Beschreibung |
|--------|------|--------------|
| **●** | **Startknoten** | Beginn des Programmablaufs |
| **◆** (Raute) | **Entscheidungsknoten** | Verzweigung basierend auf Bedingung (`eingabe != pin`) |
| **●** (Klein) | **Verbindungsknoten** | Zusammenführung von Kontrollflüssen; hier: Schleifeneinstieg |
| **⊗** | **Endknoten** | Ende des Programmablaufs |
| **▭** (Rechteck) | **Aktionsknoten** | Ausführung einer Aktion |

## Ablaufbeschreibung

1. **Start** → Programm beginnt

2. **Aktion**: Benutzer gibt einen PIN ein, den er sich merken soll
   ```java
   int pin = scanner.nextInt();
   ```

3. **Aktion**: PIN wird gespeichert

4. **Verbindungsknoten**: Beginn der do-while-Schleife
   - Dies ist der Punkt, zu dem die Schleife zurückkehrt

5. **Aktion**: Benutzer wird aufgefordert, den PIN einzugeben
   ```java
   eingabe = scanner.nextInt();
   ```

6. **Entscheidungsknoten**: Prüfung `eingabe != pin?`
   - **[wahr]**: PIN ist falsch
     - **Aktion**: Fehlermeldung ausgeben
     - **Rücksprung** zum Verbindungsknoten (Schleife wiederholt sich)

   - **[falsch]**: PIN ist richtig
     - **Aktion**: Erfolgsmeldung ausgeben
     - Weiter zum Ende

7. **Ende** → Programm beendet

## Besonderheit der fußgesteuerten Schleife

```
┌─────────────────────────────────────────┐
│        DO-WHILE SCHLEIFE                │
│                                         │
│  Verbindungsknoten (Schleifenkopf)      │
│         ↓                               │
│  Schleifenrumpf:                        │
│    - Eingabe: PIN abfragen              │
│         ↓                               │
│  Entscheidungsknoten (Schleifenfuß)     │
│    - eingabe != pin?                    │
│         ↓                               │
│    [wahr] → zurück zum Verbindungsknoten│
│    [falsch] → Schleife verlassen        │
└─────────────────────────────────────────┘
```

Die Bedingung steht am **Ende** (Fuß) der Schleife!

## Code-Zuordnung

| Diagramm-Element | Java-Code |
|------------------|-----------|
| Startknoten | `public static void main(String[] args) {` |
| Eingabe: PIN festlegen | `int pin = scanner.nextInt();` |
| Verbindungsknoten | `do {` (Schleifenbeginn) |
| Eingabe: PIN abfragen | `eingabe = scanner.nextInt();` |
| Entscheidungsknoten | `if (eingabe != pin)` und `while (eingabe != pin)` |
| Drucke: "Falscher PIN!" | `System.out.println("Falscher PIN!");` |
| Drucke: "Richtiger PIN!" | `System.out.println("Richtiger PIN! Zugang gewährt.");` |
| Endknoten | `}` (Programmende) |
