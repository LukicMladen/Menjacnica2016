package menjacnica;

import interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	@Override
	public void dodajKurs(Kurs kurs, Valuta valuta) {
		valuta.getKurs().add(kurs);
		
	}

	@Override
	public void obrisiKurs(Kurs kurs, Valuta valuta) {
		valuta.getKurs().remove(kurs);
		
	}

	@Override
	public int pronadjiKurs(Kurs kurs, Valuta valuta) {
		return valuta.getKurs().indexOf(kurs);
		
	}

}
