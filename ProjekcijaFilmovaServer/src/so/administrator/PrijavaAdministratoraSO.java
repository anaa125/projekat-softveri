/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.administrator;

import db.DBBroker;
import domen.Administrator;
import domen.OpstiDomenskiObjekat;
import java.util.ArrayList;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author Korisnik
 */
public class PrijavaAdministratoraSO extends OpstaSistemskaOperacija{
    private Administrator administratorUlogovani;

    @Override
    protected void validacija(OpstiDomenskiObjekat odo) throws Exception {
        if (!(odo instanceof Administrator)) {
            throw new Exception("Dati objekat nije instanca klase Administrator.");
        }
    }

    @Override
    protected void izvrsiOperaciju(OpstiDomenskiObjekat odo) throws Exception {

        Administrator a = (Administrator) odo;

        ArrayList<Administrator> administratori = (ArrayList<Administrator>) (ArrayList<?>) DBBroker.getInstance().select(odo);

        for (Administrator administrator : administratori) {
            if (administrator.getUsername().equals(a.getUsername()) && administrator.getPassword().equals(a.getPassword())) {
                administratorUlogovani = administrator;
                return;
            }
        }

        throw new Exception("Ne postoji korisnik sa datim kredencijalima.");

    }

    public Administrator getAdministrator() {
        return administratorUlogovani;
    }
}
