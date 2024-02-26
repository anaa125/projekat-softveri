/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.repertoar;

import db.DBBroker;
import domen.Film;
import domen.OpstiDomenskiObjekat;
import domen.Repertoar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author Korisnik
 */
public class DodajRepertoarSO extends OpstaSistemskaOperacija{
    @Override
    protected void validacija(OpstiDomenskiObjekat odo) throws Exception {
        if (!(odo instanceof Repertoar)) {
            throw new Exception("Dati objekat nije instanca klase Odeljenje.");
        }

        Repertoar repertoar = (Repertoar) odo;

        if (repertoar.getFilmovi().size() < 3 || repertoar.getFilmovi().size() > 6) {
            throw new Exception("Broj filmova na repertoaru mora biti od 3 do 6 .");
        }
    }

    @Override
    protected void izvrsiOperaciju(OpstiDomenskiObjekat odo) throws Exception {
        PreparedStatement ps = DBBroker.getInstance().insert(odo);

        ResultSet tableKeys = ps.getGeneratedKeys();
        tableKeys.next();
        Long repertoarID = tableKeys.getLong(1);

        Repertoar repertoar = (Repertoar) odo;
        repertoar.setRepertoarID(repertoarID);

        for (Film film : repertoar.getFilmovi()) {
            film.setRepertoar(repertoar);
            DBBroker.getInstance().insert(film);
        }
    }
}
