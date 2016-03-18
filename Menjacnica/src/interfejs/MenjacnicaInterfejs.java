package interfejs;

import menjacnica.Kurs;
import menjacnica.Valuta;

public interface MenjacnicaInterfejs {
	void dodajKurs(Kurs kurs, Valuta valuta);
	void obrisiKurs(Kurs kurs, Valuta valuta);
	int pronadjiKurs(Kurs kurs, Valuta valuta);
}
