package JavaOppgaver;
import static javax.swing.JOptionPane.*;

public class Oppgave5 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {

			int poeng = Integer.parseInt(showInputDialog("Skriv inn poengsum: "));

			while (poeng > 100 || poeng < 0) {
				System.out.println("Ugyldig poengsum");
				poeng = Integer.parseInt(showInputDialog("Ugyldig poengsum, skriv inn på nytt: "));
			}

			if (poeng >= 90 && poeng <= 100) {
				System.out.println("Karakter A");
			}
			if (poeng >= 80 && poeng <= 89) {
				System.out.println("Karakter B");
			}
			if (poeng >= 60 && poeng <= 79) {
				System.out.println("Karakter C");
			}
			if (poeng >= 50 && poeng <= 59) {
				System.out.println("Karakter D");
			}
			if (poeng >= 40 && poeng <= 49) {
				System.out.println("Karakter E");
			}
			if (poeng >= 0 && poeng <= 39) {
				System.out.println("Karakter F");
			}

		}
	}
}