package interfejs;

import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {
	void dodajKurs(GregorianCalendar datum, double prodajni, double kupovni, double srednji);
	void obrisiKurs(GregorianCalendar datum, double prodajni, double kupovni, double srednji);
	void pronadjiKurs(GregorianCalendar datum, String naziv);
}
