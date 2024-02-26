/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.film;

import db.DBBroker;
import domen.Film;
import domen.OpstiDomenskiObjekat;
import java.util.ArrayList;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author Korisnik
 */
public class UcitajFilmoveSO extends OpstaSistemskaOperacija {
    private ArrayList<Film> lista;

    @Override
    protected void validacija(OpstiDomenskiObjekat odo) throws Exception {
        if (!(odo instanceof Film)) {
            throw new Exception("Dati objekat nije instanca klase Film.");
        }
    }

    @Override
    protected void izvrsiOperaciju(OpstiDomenskiObjekat odo) throws Exception {
        ArrayList<OpstiDomenskiObjekat> filmovi = DBBroker.getInstance().select(odo);
        lista = (ArrayList<Film>) (ArrayList<?>) filmovi;
    }

    public ArrayList<Film> getLista() {
        return lista;
    }
}
