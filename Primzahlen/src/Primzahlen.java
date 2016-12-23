import java.util.Vector;

public class Primzahlen {

	public static void main(String[] args) {
		int limit = 100;
		int zahl = 2; // Zu überprüfende Zahl
		int i = 0;
		boolean primzahl; // Hilfsvariable, ob die aktuelle Zahl eine Primzahl
							// ist
		int[] primzahlen = new int[limit];

		// zahl <= x ist der zu überprüfende Zahlenraum
		// Beginn bei 2, weil 1 per Definition keine Primzahl ist
		if (zahl == 2) {
			// 2 ist Primzahl
			primzahlen[0] = zahl;
			System.out.println(primzahlen[0] + " ist eine Primzahl");
		}

		for (zahl = 3; zahl <= limit; zahl += 2) {
			// solange wir für ungerade zahl keinen Teiler finden, gehen wir
			// davon aus,
			// dass es eine Primzahl ist
			primzahl = true;

			// zaehler ist ein möglicher Teiler. Mögliche nicht-triviale
			// Teiler
			// liegen im Bereich 2 bis zahl/2 (abgerundet)
			for (i = 0; primzahlen[i] <= zahl / 2; i++) {
				System.out.println(i);
				if (zahl % primzahlen[i] == 0) {
					// zaehler ist ein nichttrivialer Teiler von zahl und damit
					// zahl keine Primzahl. Weitere Teiler müssen nicht
					// geprüft
					// werden und damit kann die Schleife abgebrochen werden.

					primzahl = false;
					break;

				}

			}

			if (primzahl) {
				// Keine Teiler gefunden -> zahl2 ist eine Primzahl
				primzahlen[i] = zahl;
				System.out.println(primzahlen[i] + " ist eine Primzahl");
			}
		}
	}
}