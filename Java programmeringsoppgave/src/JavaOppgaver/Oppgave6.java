package JavaOppgaver;

import static javax.swing.JOptionPane.*;

public class Oppgave6 {

	public static void main(String[] args) {
		int tall = Integer.parseInt(showInputDialog("Skriv inn positivt heltall"));
		int n = tall;
		int svar = 1;

		while (n > 0) {
			svar *= n;
			n--;

		}

		showMessageDialog(null, tall + "!" + " = " + svar);
	}

}
