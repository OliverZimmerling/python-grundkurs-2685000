# Mermaid UML-Diagramme für OOP-Konzepte

## Variante 1: Vollständiges Klassendiagramm

```mermaid
classDiagram
    class Person {
        -String name
        -int alter
        -String adresse

        +Person()
        +Person(String name, int alter)
        +Person(String name, int alter, String adresse)

        +String getName()
        +int getAlter()
        +String getAdresse()

        +void setName(String name)
        +void setAlter(int alter)
        +void setAdresse(String adresse)

        +void begruessung()
        +void geburtstag()
        +void zeigeInfo()
        +String toString()
    }

    class Student {
        -String matrikelnummer
        -String studiengang
        -double durchschnittsnote

        +Student()
        +Student(String name, int alter, String matrikelnummer)
        +Student(String name, int alter, String adresse, String matrikelnummer, String studiengang)

        +String getMatrikelnummer()
        +String getStudiengang()
        +double getDurchschnittsnote()
        +int getSemester()

        +void setMatrikelnummer(String matrikelnummer)
        +void setStudiengang(String studiengang)
        +void setDurchschnittsnote(double note)

        +void lernen()
        +void begruessung()
        +void zeigeInfo()
        +String toString()
    }

    Person <|-- Student : erbt von

    note for Person "Basisklasse mit grundlegenden\nEigenschaften einer Person"
    note for Student "Erbt von Person und fügt\nstudienspezifische Attribute hinzu"
```

## Variante 2: Vereinfachtes Klassendiagramm

```mermaid
classDiagram
    class Person {
        -String name
        -int alter
        -String adresse
        +getName() String
        +setName(String)
        +begruessung()
        +zeigeInfo()
    }

    class Student {
        -String matrikelnummer
        -String studiengang
        -double durchschnittsnote
        +getMatrikelnummer() String
        +lernen()
        +begruessung()
    }

    Person <|-- Student
```

## Variante 3: Mit Beziehungen und Notizen

```mermaid
classDiagram
    direction TB

    class Person {
        <<Basisklasse>>
        -String name
        -int alter
        -String adresse
        +Person()
        +begruessung() void
        +zeigeInfo() void
    }

    class Student {
        <<Abgeleitete Klasse>>
        -String matrikelnummer
        -String studiengang
        -double durchschnittsnote
        +Student()
        +lernen() void
        +getSemester() int
    }

    Person <|-- Student : Vererbung (extends)

    class Main {
        +main(String[] args) void
    }

    Main ..> Person : verwendet
    Main ..> Student : verwendet

    note "IS-A Beziehung:\nEin Student IST eine Person"
```

## Variante 4: Hierarchie mit Beispiel-Objekten

```mermaid
graph TD
    A[Person<br/>Basisklasse] -->|erbt| B[Student<br/>Abgeleitete Klasse]

    B -->|Instanz| C["student2<br/>Name: Tom Weber<br/>Matrikel: 123456"]
    B -->|Instanz| D["student3<br/>Name: Sarah Klein<br/>Matrikel: 789012"]

    A -->|Instanz| E["person2<br/>Name: Max Mustermann<br/>Alter: 30"]
    A -->|Instanz| F["person3<br/>Name: Anna Schmidt<br/>Alter: 25"]

    style A fill:#ADD8E6,stroke:#4682B4,stroke-width:3px
    style B fill:#90EE90,stroke:#2E8B57,stroke-width:3px
    style C fill:#FFE4B5,stroke:#FF8C00,stroke-width:2px
    style D fill:#FFE4B5,stroke:#FF8C00,stroke-width:2px
    style E fill:#FFB6C1,stroke:#C71585,stroke-width:2px
    style F fill:#FFB6C1,stroke:#C71585,stroke-width:2px
```

## Variante 5: Vererbungshierarchie mit Methoden

```mermaid
flowchart TD
    Person["👤 Person<br/>───────────<br/>- name<br/>- alter<br/>- adresse<br/>───────────<br/>+ begruessung(✓)<br/>+ zeigeInfo(✓)<br/>+ geburtstag()"]

    Student["🎓 Student<br/>───────────<br/>- matrikelnummer<br/>- studiengang<br/>- durchschnittsnote<br/>───────────<br/>+ begruessung(✓ override)<br/>+ zeigeInfo(✓ override)<br/>+ lernen()<br/>+ getSemester()"]

    Person -->|extends| Student

    style Person fill:#87CEEB,stroke:#4682B4,stroke-width:3px
    style Student fill:#98FB98,stroke:#2E8B57,stroke-width:3px
```

## Variante 6: OOP-Prinzipien Übersicht

```mermaid
mindmap
  root((OOP Konzepte))
    Kapselung
      private Attribute
      public Getter/Setter
      Datenschutz
    Vererbung
      extends Person
      Wiederverwendbarkeit
      IS-A Beziehung
    Polymorphismus
      Methodenüberschreibung
      @Override
      begruessung()
    Abstraktion
      Klassen als Bauplan
      Objekte als Instanzen
      toString()
```

## Erklärung der Symbole

| Symbol | Bedeutung |
|--------|-----------|
| `-` | private (nur in der Klasse) |
| `+` | public (überall zugänglich) |
| `#` | protected (in Klasse + Subklassen) |
| `~` | package (im gleichen Package) |
| `<|--` | Vererbung (erbt von) |
| `..>` | Abhängigkeit (verwendet) |
| `--` | Assoziation |

## Code-Mapping

### Person-Klasse

```java
public class Person {          // Klasse Person
    private String name;       // - name : String
    private int alter;         // - alter : int

    public Person() {...}      // + Person()
    public String getName() {...} // + getName() : String
    public void begruessung() {...} // + begruessung() : void
}
```

### Student-Klasse

```java
public class Student extends Person {  // Student <|-- Person
    private String matrikelnummer;     // - matrikelnummer : String

    @Override                          // Methodenüberschreibung
    public void begruessung() {...}    // + begruessung() : void

    public void lernen() {...}         // + lernen() : void
}
```

## Vererbungskonzept visualisiert

```mermaid
graph LR
    A[Person<br/>name, alter, adresse<br/>begruessung, zeigeInfo] -->|Vererbung| B[Student<br/>ALLE Person-Attribute<br/>+ matrikelnummer<br/>+ studiengang<br/>ALLE Person-Methoden<br/>+ lernen]

    style A fill:#E6F3FF,stroke:#0066CC,stroke-width:2px
    style B fill:#E6FFE6,stroke:#00AA00,stroke-width:2px
```

## Polymorphismus-Beispiel

```mermaid
sequenceDiagram
    participant Main
    participant Person as person:Person
    participant Student as student:Student

    Main->>Person: begruessung()
    Person-->>Main: "Hallo, mein Name ist..."

    Main->>Student: begruessung()
    Note over Student: Überschriebene Methode!
    Student-->>Main: "Hallo, ich bin..., Student/in..."

    Note over Main,Student: Gleicher Methodenname,<br/>unterschiedliches Verhalten
```

## Objektinstanzen

```mermaid
graph TD
    subgraph "Klasse = Bauplan"
        Person["Person<br/>Klassendeklaration"]
        Student["Student<br/>Klassendeklaration"]
    end

    subgraph "Objekte = Instanzen"
        P1["person2<br/>Max Mustermann, 30"]
        P2["person3<br/>Anna Schmidt, 25"]
        S1["student2<br/>Tom Weber, 123456"]
        S2["student3<br/>Sarah Klein, 789012"]
    end

    Person -.->|new| P1
    Person -.->|new| P2
    Student -.->|new| S1
    Student -.->|new| S2

    style Person fill:#B0C4DE
    style Student fill:#90EE90
    style P1 fill:#FFE4B5
    style P2 fill:#FFE4B5
    style S1 fill:#FFB6C1
    style S2 fill:#FFB6C1
```
