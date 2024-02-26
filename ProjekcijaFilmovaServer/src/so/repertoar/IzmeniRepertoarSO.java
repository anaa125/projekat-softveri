/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.repertoar;

import db.DBBroker;
import domen.Film;
import domen.OpstiDomenskiObjekat;
import domen.Repertoar;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author Korisnik
 */
public class IzmeniRepertoarSO extends OpstaSistemskaOperacija {
    @Override
    protected void validacija(OpstiDomenskiObjekat odo) throws Exception {
        if (!(odo instanceof Repertoar)) {
            throw new Exception("Dati objekat nije instanca klase Repertoara.");
        }

        Repertoar repertoar = (Repertoar) odo;

        if (repertoar.getFilmovi().size() < 3 || repertoar.getFilmovi().size() > 6) {
            throw new Exception("Broj filmova na repertoaru mora biti od 3 do 6.");
        }
    }

    @Override
    protected void izvrsiOperaciju(OpstiDomenskiObjekat odo) throws Exception {
        DBBroker.getInstance().update(odo);

        Repertoar repertoar = (Repertoar) odo;

        DBBroker.getInstance().delete(repertoar.getFilmovi().get(0));

        for (Film film : repertoar.getFilmovi()) {
            DBBroker.getInstance().insert(film);
        }
    }
}
