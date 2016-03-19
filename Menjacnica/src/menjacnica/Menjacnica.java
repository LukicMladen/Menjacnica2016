package menjacnica;

import interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	@Override
	public void dodajKurs(Kurs kurs, Valuta valuta) {
		if (kurs == null || valuta == null)
			System.out.println("Greska!");
		else
			valuta.getKurs().add(0, kurs);
	}

	@Override
	public void obrisiKurs(Kurs kurs, Valuta valuta) {
		if (kurs == null || valuta == null)
			System.out.println("Greska!");
		else {
			if (valuta.getKurs().contains(kurs)) {
				valuta.getKurs().remove(kurs);
			}
		}
	}

	@Override
	public int pronadjiKurs(Kurs kurs, Valuta valuta) {
		if (kurs == null || valuta == null)
			System.out.println("Greska!");
		else {
			for (int i = 0; i < valuta.getKurs().size(); i++) {
				if (valuta.getKurs().get(i).equals(kurs)) {
					return i;
				}
			}
		}
		return -1;
	}

}
