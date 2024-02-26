/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Korisnik
 */
public class Zanr extends OpstiDomenskiObjekat {
    private long zanrID;
    private String naziv;

    public Zanr() {
    }

    public Zanr(long zanrID, String naziv) {
        this.zanrID = zanrID;
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public long getZanrID() {
        return zanrID;
    }

    public void setZanrID(long zanrID) {
        this.zanrID = zanrID;
    }

    
    @Override
    public String nazivTabele() {
        return " zanr ";
    }

    @Override
    public String alijas() {
        return " z ";
    }

    @Override
    public String join() {
        return "";
    }

    @Override
    public ArrayList<OpstiDomenskiObjekat> vratiListu(ResultSet rs) throws SQLException {
        ArrayList<OpstiDomenskiObjekat> lista = new ArrayList<>();

        while (rs.next()) {
            Zanr z = new Zanr(rs.getLong("ZanrID"), rs.getString("NazivZanra"));

            lista.add(z);
        }

        rs.close();
        return lista;
    }

    @Override
    public String koloneZaInsert() {
        return " (NazivZanra) ";
    }

    @Override
    public String vrednostZaPrimarniKljuc() {
        return " ZanrID = " + zanrID;
    }

    @Override
    public String vrednostiZaInsert() {
        return "'" + naziv + "'";
    }

    @Override
    public String vrednostiZaUpdate() {
        return " NazivZanra = '" + naziv + "'";
    }

    @Override
    public String uslov() {
        return "";
    }
@Override
    public String toString() {
        return naziv;
        
    }
    
}
