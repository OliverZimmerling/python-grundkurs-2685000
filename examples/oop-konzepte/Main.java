/**
 * Main-Klasse zum Testen der OOP-Konzepte
 *
 * Demonstriert:
 * - Objekterstellung
 * - Methodenaufrufe
 * - Vererbung
 * - Polymorphismus
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.println("║  OOP-Konzepte in Java - Demonstration            ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");
        System.out.println();

        // ========================================
        // 1. Person-Objekte erstellen
        // ========================================
        System.out.println(">>> 1. Person-Objekte erstellen <<<");
        System.out.println();

        // Mit Standard-Konstruktor
        Person person1 = new Person();
        person1.zeigeInfo();
        System.out.println();

        // Mit Konstruktor (Name, Alter)
        Person person2 = new Person("Max Mustermann", 30);
        person2.zeigeInfo();
        System.out.println();

        // Mit vollständigem Konstruktor
        Person person3 = new Person("Anna Schmidt", 25, "Musterstraße 123, 12345 Berlin");
        person3.zeigeInfo();
        System.out.println();

        // ========================================
        // 2. Getter und Setter verwenden
        // ========================================
        System.out.println(">>> 2. Getter und Setter verwenden <<<");
        System.out.println();

        System.out.println("Name von Person 1: " + person1.getName());
        person1.setName("Lisa Müller");
        person1.setAlter(28);
        person1.setAdresse("Hauptstraße 45, 54321 München");
        System.out.println("Nach Änderung:");
        person1.zeigeInfo();
        System.out.println();

        // ========================================
        // 3. Methoden aufrufen
        // ========================================
        System.out.println(">>> 3. Methoden aufrufen <<<");
        System.out.println();

        person2.begruessung();
        person2.geburtstag();
        person2.geburtstag();
        System.out.println();

        // ========================================
        // 4. Student-Objekte erstellen (Vererbung)
        // ========================================
        System.out.println(">>> 4. Student-Objekte erstellen (Vererbung) <<<");
        System.out.println();

        Student student1 = new Student();
        student1.zeigeInfo();
        System.out.println();

        Student student2 = new Student("Tom Weber", 22, "123456");
        student2.setStudiengang("Informatik");
        student2.setDurchschnittsnote(1.8);
        student2.zeigeInfo();
        System.out.println();

        Student student3 = new Student(
                "Sarah Klein",
                20,
                "Universitätsallee 7, 10115 Berlin",
                "789012",
                "Wirtschaftsinformatik"
        );
        student3.setDurchschnittsnote(2.1);
        student3.zeigeInfo();
        System.out.println();

        // ========================================
        // 5. Student-spezifische Methoden
        // ========================================
        System.out.println(">>> 5. Student-spezifische Methoden <<<");
        System.out.println();

        student2.lernen();
        student3.lernen();
        System.out.println();

        // ========================================
        // 6. Überschriebene Methoden (Polymorphismus)
        // ========================================
        System.out.println(">>> 6. Überschriebene Methoden (Polymorphismus) <<<");
        System.out.println();

        System.out.println("Person begrüßt sich:");
        person3.begruessung();
        System.out.println();

        System.out.println("Student begrüßt sich:");
        student2.begruessung();
        System.out.println();

        // ========================================
        // 7. Polymorphismus in Aktion
        // ========================================
        System.out.println(">>> 7. Polymorphismus in Aktion <<<");
        System.out.println();

        // Ein Student IST auch eine Person (IS-A Beziehung)
        Person personAlsStudent = new Student("Julia Becker", 23, "345678");
        personAlsStudent.begruessung(); // Ruft Student-Version auf!
        System.out.println();

        // ========================================
        // 8. Array von Personen (Polymorphismus)
        // ========================================
        System.out.println(">>> 8. Array von Personen (Polymorphismus) <<<");
        System.out.println();

        Person[] personen = new Person[4];
        personen[0] = new Person("Peter Pan", 35);
        personen[1] = new Student("Emma Watson", 21, "456789");
        personen[2] = new Person("John Doe", 40, "Irgendwo 1");
        personen[3] = new Student("Alex Müller", 24, "567890");

        System.out.println("Alle Personen begrüßen sich:");
        for (Person p : personen) {
            p.begruessung(); // Ruft jeweils die richtige Version auf!
        }
        System.out.println();

        // ========================================
        // 9. toString-Methode verwenden
        // ========================================
        System.out.println(">>> 9. toString-Methode verwenden <<<");
        System.out.println();

        System.out.println(person2);
        System.out.println(student2);
        System.out.println();

        // ========================================
        // 10. Validierung testen
        // ========================================
        System.out.println(">>> 10. Validierung testen <<<");
        System.out.println();

        System.out.println("Versuche negatives Alter zu setzen:");
        person2.setAlter(-5); // Sollte Fehlermeldung ausgeben
        System.out.println();

        System.out.println("Versuche ungültige Note zu setzen:");
        student2.setDurchschnittsnote(6.0); // Sollte Fehlermeldung ausgeben
        student2.setDurchschnittsnote(1.3); // Sollte funktionieren
        System.out.println("Neue Note: " + student2.getDurchschnittsnote());
        System.out.println();

        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.println("║  Demonstration abgeschlossen!                     ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");
    }
}
