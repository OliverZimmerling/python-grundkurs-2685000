import java.util.Scanner;

/**
 * PIN-Abfrage mit fußgesteuerter Schleife (do-while)
 * Die Schleife wird mindestens einmal durchlaufen und wiederholt sich,
 * solange der eingegebene PIN falsch ist.
 */
public class Pin_Abfrage_DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie einen PIN ein, den Sie sich merken sollten: ");
        int pin = scanner.nextInt();
        System.out.println("Ihr PIN wurde gespeichert.\n");

        int eingabe;

        // Fußgesteuerte Schleife: Bedingung wird am Ende geprüft
        do {
            System.out.println("Bitte geben Sie Ihren PIN ein: ");
            eingabe = scanner.nextInt();

            if (eingabe != pin) {
                System.out.println("Falscher PIN! Bitte versuchen Sie es erneut.\n");
            }

        } while (eingabe != pin);  // Wiederhole, SOLANGE der PIN falsch ist

        System.out.println("Richtiger PIN! Zugang gewährt.");

        scanner.close();
    }
}
