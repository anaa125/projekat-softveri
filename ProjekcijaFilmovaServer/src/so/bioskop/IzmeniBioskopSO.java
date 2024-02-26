/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.bioskop;

import db.DBBroker;
import domen.Bioskop;
import domen.OpstiDomenskiObjekat;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author Korisnik
 */
public class IzmeniBioskopSO extends OpstaSistemskaOperacija{
     @Override
    protected void validacija(OpstiDomenskiObjekat odo) throws Exception {
        if (!(odo instanceof Bioskop)) {
            throw new Exception("Dati objekat nije instanca klase Bioskop.");
        }
    }

    @Override
    protected void izvrsiOperaciju(OpstiDomenskiObjekat odo) throws Exception {
        DBBroker.getInstance().update(odo);
    }
}
