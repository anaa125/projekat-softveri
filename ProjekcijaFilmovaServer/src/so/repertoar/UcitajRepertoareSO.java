/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.repertoar;

import db.DBBroker;
import domen.OpstiDomenskiObjekat;
import domen.Repertoar;
import java.util.ArrayList;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author Korisnik
 */
public class UcitajRepertoareSO  extends OpstaSistemskaOperacija{
     private ArrayList<Repertoar> lista;

    @Override
    protected void validacija(OpstiDomenskiObjekat odo) throws Exception {
        if (!(odo instanceof Repertoar)) {
            throw new Exception("Dati objekat nije instanca klase Repertoar.");
        }
    }

    @Override
    protected void izvrsiOperaciju(OpstiDomenskiObjekat odo) throws Exception {
        ArrayList<OpstiDomenskiObjekat> repertoari = DBBroker.getInstance().select(odo);
        lista = (ArrayList<Repertoar>) (ArrayList<?>) repertoari;
    }

    public ArrayList<Repertoar> getLista() {
        return lista;
    }

}
