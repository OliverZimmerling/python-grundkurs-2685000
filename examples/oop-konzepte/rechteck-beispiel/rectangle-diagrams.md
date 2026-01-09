# Rechteck (Rectangle) - UML-Diagramme

## Klassendiagramm

```mermaid
classDiagram
    class Rectangle {
        -double laenge
        -double breite

        +Rectangle()
        +Rectangle(laenge: double, breite: double)
        +Rectangle(seite: double)

        +getLaenge() double
        +getBreite() double
        +setLaenge(laenge: double) void
        +setBreite(breite: double) void

        +berechneFlaече() double
        +berechneUmfang() double
        +berechneDiagonale() double
        +istQuadrat() boolean

        +hatGleicheFlaecheWie(anderes: Rectangle) boolean
        +istGroesserAls(anderes: Rectangle) boolean

        +skaliere(faktor: double) void
        +verdoppeln() void
        +halbieren() void

        +zeigeInfo() void
        +zeichne() void
        +toString() String
    }

    note for Rectangle "Rechteck-Klasse demonstriert:\n• Kapselung (private Attribute)\n• Validierung in Settern\n• Berechnungsmethoden\n• Vergleichsmethoden"
```

## Objektdiagramm - Beispiele

```mermaid
graph TD
    subgraph "Klasse (Bauplan)"
        Klasse["Rectangle<br/>Klassendeklaration"]
    end

    subgraph "Objekte (Instanzen)"
        R1["rechteck1: Rectangle<br/>laenge = 5.0<br/>breite = 3.0<br/>Fläche = 15.0"]
        R2["rechteck2: Rectangle<br/>laenge = 8.0<br/>breite = 6.0<br/>Fläche = 48.0"]
        Q1["quadrat: Rectangle<br/>laenge = 4.0<br/>breite = 4.0<br/>Fläche = 16.0<br/>istQuadrat = true"]
    end

    Klasse -.->|new| R1
    Klasse -.->|new| R2
    Klasse -.->|new| Q1

    style Klasse fill:#B0C4DE,stroke:#4682B4,stroke-width:3px
    style R1 fill:#FFE4B5,stroke:#FF8C00,stroke-width:2px
    style R2 fill:#FFE4B5,stroke:#FF8C00,stroke-width:2px
    style Q1 fill:#98FB98,stroke:#2E8B57,stroke-width:2px
```

## Methodenaufrufe - Sequenzdiagramm

```mermaid
sequenceDiagram
    participant Main
    participant r1 as r1:Rectangle
    participant r2 as r2:Rectangle

    Main->>r1: new Rectangle(5.0, 3.0)
    activate r1
    r1-->>Main: Rectangle-Objekt
    deactivate r1

    Main->>r1: berechneFlaече()
    activate r1
    r1-->>Main: 15.0
    deactivate r1

    Main->>r2: new Rectangle(10.0, 2.0)
    activate r2
    r2-->>Main: Rectangle-Objekt
    deactivate r2

    Main->>r1: hatGleicheFlaecheWie(r2)
    activate r1
    r1->>r2: berechneFlaече()
    activate r2
    r2-->>r1: 20.0
    deactivate r2
    r1-->>Main: false
    deactivate r1
```

## OOP-Prinzipien im Rectangle

```mermaid
mindmap
  root((Rectangle))
    Kapselung
      private laenge
      private breite
      public Getter
      public Setter mit Validierung
    Methoden
      Berechnungen
        berechneFlaече
        berechneUmfang
        berechneDiagonale
      Vergleiche
        hatGleicheFlaecheWie
        istGroesserAls
        istQuadrat
      Manipulation
        skaliere
        verdoppeln
        halbieren
    Ausgabe
      zeigeInfo
      zeichne
      toString
```

## Berechnungsformeln

```mermaid
flowchart TD
    Start([Rectangle erstellt]) --> Input["Länge = L<br/>Breite = B"]

    Input --> Calc1["Fläche berechnen"]
    Calc1 --> F["Fläche = L × B"]

    Input --> Calc2["Umfang berechnen"]
    Calc2 --> U["Umfang = 2 × (L + B)"]

    Input --> Calc3["Diagonale berechnen"]
    Calc3 --> D["Diagonale = √(L² + B²)"]

    Input --> Check{"L == B?"}
    Check -->|Ja| Quad["istQuadrat = true"]
    Check -->|Nein| Rect["istQuadrat = false"]

    style Start fill:#90EE90
    style F fill:#FFE4B5
    style U fill:#FFE4B5
    style D fill:#FFE4B5
    style Quad fill:#98FB98
    style Rect fill:#FFB6C1
```

## Verwendungsbeispiel - Aktivitätsdiagramm

```mermaid
flowchart TD
    Start([Start]) --> Create["Rectangle r = new Rectangle(5, 3)"]
    Create --> GetFlaeche["fläche = r.berechneFlaече()"]
    GetFlaeche --> Print1["Ausgabe: fläche"]

    Print1 --> Scale["r.verdoppeln()"]
    Scale --> GetFlaeche2["neueFlaeche = r.berechneFlaече()"]
    GetFlaeche2 --> Print2["Ausgabe: neueFlaeche"]

    Print2 --> Info["r.zeigeInfo()"]
    Info --> Draw["r.zeichne()"]
    Draw --> End([Ende])

    style Start fill:#90EE90
    style End fill:#FFB6C1
    style Create fill:#87CEEB
    style Scale fill:#FFE4B5
```

## Vergleich: Rectangle vs. Square

```mermaid
classDiagram
    class Rectangle {
        -double laenge
        -double breite
        +Rectangle(laenge, breite)
        +berechneFlaече() double
    }

    class Square {
        -double seite
        +Square(seite)
        +berechneFlaече() double
    }

    Rectangle <|-- Square : Alternative:\nErben

    note for Rectangle "Allgemeines Rechteck\nLänge ≠ Breite möglich"
    note for Square "Spezielles Rechteck\nLänge = Breite"
```

## Zustandsdiagramm eines Rechtecks

```mermaid
stateDiagram-v2
    [*] --> Erstellt: new Rectangle()

    Erstellt --> Normal: Standardwerte

    Normal --> Vergrößert: verdoppeln()
    Normal --> Verkleinert: halbieren()
    Normal --> Skaliert: skaliere(faktor)

    Vergrößert --> Normal: halbieren()
    Verkleinert --> Normal: verdoppeln()
    Skaliert --> Normal: weitere Operation

    Normal --> Geändert: setLaenge() / setBreite()
    Geändert --> Normal: weitere Operationen

    Normal --> [*]: Objekt wird gelöscht
    Vergrößert --> [*]: Objekt wird gelöscht
    Verkleinert --> [*]: Objekt wird gelöscht
```

## Getter/Setter Pattern

```mermaid
flowchart LR
    subgraph "Kapselung"
        Private["private double laenge"]
    end

    subgraph "Öffentliche Schnittstelle"
        Get["public double getLaenge()"]
        Set["public void setLaenge(double)"]
    end

    Get -.->|liest| Private
    Set -.->|schreibt mit Validierung| Private

    Client1[Client-Code] -->|Lesen| Get
    Client2[Client-Code] -->|Schreiben| Set

    style Private fill:#FFB6C1,stroke:#C71585,stroke-width:3px
    style Get fill:#90EE90,stroke:#2E8B57,stroke-width:2px
    style Set fill:#90EE90,stroke:#2E8B57,stroke-width:2px
```

## Visualisierung der Rectangle-Größen

```
Klein (2 × 1.5):
┌────┐
│    │
└────┘

Mittel (5 × 3):
┌──────────┐
│          │
│          │
│          │
│          │
│          │
└──────────┘

Groß (10 × 6):
┌────────────────────┐
│                    │
│                    │
│                    │
│                    │
│                    │
│                    │
│                    │
│                    │
│                    │
│                    │
└────────────────────┘
```
