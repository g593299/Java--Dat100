package JavaOppgaver;

import static javax.swing.JOptionPane.*;

public class Oppgave4 {

	public static void main(String[] args) {

		double inntekt = Double.parseDouble(showInputDialog("Skriv inn din inntekt: "));
		double skatt = 0;

		if (inntekt >= 934051) {
			skatt += (inntekt - 934051) * 0.1452;
			inntekt = 934051;
		}
		if (inntekt >= 580651) {
			skatt += (inntekt - 580651) * 0.1152;
			inntekt = 580651;
		}
		if (inntekt >= 230951) {
			skatt += (inntekt - 230951) * 0.0241;
			inntekt = 230951;
		}
		if (inntekt >= 164101) {
			skatt += (inntekt - 164101) * 0.0093;
			
		}

		showMessageDialog(null, "Din trinnskatt er: " + skatt + "kr");

	}

}
