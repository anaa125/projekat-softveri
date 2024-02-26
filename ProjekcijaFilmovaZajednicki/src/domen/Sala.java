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
public class Sala extends OpstiDomenskiObjekat{
    private long salaID;
    private String naziv;

    public Sala() {
    }

    public Sala(long salaID, String naziv) {
        this.salaID = salaID;
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public long getSalaID() {
        return salaID;
    }

    public void setSalaID(long salaID) {
        this.salaID = salaID;
    }

    @Override
    public String toString() {
        return naziv;
    }
     @Override
    public String nazivTabele() {
        return " sala ";
    }

    @Override
    public String alijas() {
        return " s ";
    }

    @Override
    public String join() {
        return "";
    }

    @Override
    public ArrayList<OpstiDomenskiObjekat> vratiListu(ResultSet rs) throws SQLException {
        ArrayList<OpstiDomenskiObjekat> lista = new ArrayList<>();

        while (rs.next()) {
            Sala s = new Sala(rs.getLong("SalaID"), rs.getString("NazivSale"));

            lista.add(s);
        }

        rs.close();
        return lista;
    }

    @Override
    public String koloneZaInsert() {
        return " (NazivSale) ";
    }

    @Override
    public String vrednostZaPrimarniKljuc() {
        return " SalaID = " + salaID;
    }

    @Override
    public String vrednostiZaInsert() {
        return "'" + naziv + "'";
    }

    @Override
    public String vrednostiZaUpdate() {
        return " NazivSale = '" + naziv + "' ";
    }

    @Override
    public String uslov() {
        return "";
    }

   
    
}
