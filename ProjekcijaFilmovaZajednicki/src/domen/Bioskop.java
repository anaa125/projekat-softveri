/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Korisnik
 */
public class Bioskop extends OpstiDomenskiObjekat {
    private long bioskopID;
    private String naziv;
    private String grad;
    private String adresa;

    public Bioskop() {
    }

    public Bioskop(long bioskopID, String naziv, String grad, String adresa) {
        this.bioskopID = bioskopID;
        this.naziv = naziv;
        this.grad = grad;
        this.adresa = adresa;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public long getBioskopID() {
        return bioskopID;
    }

    public void setBioskopID(long bioskopID) {
        this.bioskopID = bioskopID;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    @Override
    public String toString() {
        return naziv;
    }
     @Override
    public String nazivTabele() {
        return " bioskop ";
    }

    @Override
    public String alijas() {
        return " b ";
    }

    @Override
    public String join() {
        return "";
    }

    @Override
    public ArrayList<OpstiDomenskiObjekat> vratiListu(ResultSet rs) throws SQLException {
        ArrayList<OpstiDomenskiObjekat> lista = new ArrayList<>();

        while (rs.next()) {
            Bioskop b = new Bioskop(rs.getLong("BioskopID"), rs.getString("NazivBioskopa"),
                    rs.getString("Grad"),rs.getString("Adresa"));

            lista.add(b);
        }

        rs.close();
        return lista;
    }

    @Override
    public String koloneZaInsert() {
        return " (NazivBioskopa, Grad, Adresa) ";
    }

    @Override
    public String vrednostZaPrimarniKljuc() {
        return " BioskopID = " + bioskopID;
    }

    @Override
    public String vrednostiZaInsert() {
        return "'" + naziv + "','" + grad + "', '" + adresa + "'";
    }

    @Override
    public String vrednostiZaUpdate() {
        return " NazivBioskopa = '" + naziv + "',Grad= '" + grad + "' ,Adresa = '" + adresa + "' ";
    }

    @Override
    public String uslov() {
        return "";
    }

   
}
