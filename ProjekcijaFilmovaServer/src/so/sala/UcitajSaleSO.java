/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.sala;

import db.DBBroker;
import domen.OpstiDomenskiObjekat;
import domen.Sala;
import java.util.ArrayList;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author Korisnik
 */
public class UcitajSaleSO extends OpstaSistemskaOperacija{
     private ArrayList<Sala> lista;

    @Override
    protected void validacija(OpstiDomenskiObjekat odo) throws Exception {
        if (!(odo instanceof Sala)) {
            throw new Exception("Dati objekat nije instanca klase Sala.");
        }
    }

    @Override
    protected void izvrsiOperaciju(OpstiDomenskiObjekat odo) throws Exception {
        ArrayList<OpstiDomenskiObjekat> sale = DBBroker.getInstance().select(odo);
        lista = (ArrayList<Sala>) (ArrayList<?>) sale;
    }

    public ArrayList<Sala> getLista() {
        return lista;
    }

}
