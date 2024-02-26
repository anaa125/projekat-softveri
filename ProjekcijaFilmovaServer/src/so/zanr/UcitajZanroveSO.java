/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.zanr;

import db.DBBroker;
import domen.OpstiDomenskiObjekat;
import domen.Zanr;
import java.util.ArrayList;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author Korisnik
 */
    public class UcitajZanroveSO extends OpstaSistemskaOperacija {

    private ArrayList<Zanr> lista;

   @Override
    protected void validacija(OpstiDomenskiObjekat odo) throws Exception {
        if (!(odo instanceof Zanr)) {
            throw new Exception("Dati objekat nije instanca klase Zanr.");
        }
    }

    @Override
    protected void izvrsiOperaciju(OpstiDomenskiObjekat odo) throws Exception {
        ArrayList<OpstiDomenskiObjekat> zanrovi = DBBroker.getInstance().select(odo);
        lista = (ArrayList<Zanr>) (ArrayList<?>) zanrovi;
    }

    public ArrayList<Zanr> getLista() {
        return lista;
    }
    
    
}
