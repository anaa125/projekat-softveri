/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Korisnik
 */
public class Repertoar extends OpstiDomenskiObjekat {
    private long repertoarID;
    private Date datum;
    private Sala sala;
    private Bioskop bioskop;
    private Administrator administrator;
    private ArrayList<Film> filmovi;

    public Repertoar() {
    }

    public Repertoar(long repertoarID, Date datum, Sala sala, Bioskop bioskop, Administrator administrator, ArrayList<Film> filmovi) {
        this.repertoarID = repertoarID;
        this.datum = datum;
        this.sala = sala;
        this.bioskop = bioskop;
        this.administrator = administrator;
        this.filmovi = filmovi;
    }

    public ArrayList<Film> getFilmovi() {
        return filmovi;
    }

    public void setFilmovi(ArrayList<Film> filmovi) {
        this.filmovi = filmovi;
    }

    public long getRepertoarID() {
        return repertoarID;
    }

    public void setRepertoarID(long repertoarID) {
        this.repertoarID = repertoarID;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Bioskop getBioskop() {
        return bioskop;
    }

    public void setBioskop(Bioskop bioskop) {
        this.bioskop = bioskop;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }
    @Override
    public String nazivTabele() {
        return " repertoar ";
    }

    @Override
    public String alijas() {
        return " r ";
    }

    @Override
    public String join() {
        return " JOIN ADMINISTRATOR A ON (A.ADMINISTRATORID = R.ADMINISTRATORID) "
                + "JOIN BIOSKOP B ON (B.BIOSKOPID = R.BIOSKOPID) "
                + "JOIN SALA S ON (S.SALAID = R.SALAID) ";
    }

    @Override
    public ArrayList<OpstiDomenskiObjekat> vratiListu(ResultSet rs) throws SQLException {
        ArrayList<OpstiDomenskiObjekat> lista = new ArrayList<>();

        while (rs.next()) {
            Administrator a = new Administrator(rs.getLong("AdministratorID"), rs.getString("ImeAdministratora"),
                    rs.getString("PrezimeAdministratora"), rs.getString("Username"), rs.getString("Password"));

            Sala s = new Sala(rs.getLong("SalaID"), rs.getString("NazivSale"));

            Bioskop b = new Bioskop(rs.getLong("BioskopID"), rs.getString("NazivBioskopa"),rs.getString("Grad"),
                    rs.getString("Adresa"));

            Repertoar r = new Repertoar(rs.getLong("RepertoarID"), rs.getDate("Datum"), s, b, a, null);

            lista.add(r);
        }

        rs.close();
        return lista;
    }

    @Override
    public String koloneZaInsert() {
        return " (Datum, SalaID, BioskopID , AdministratorID) ";
    }

    @Override
    public String vrednostZaPrimarniKljuc() {
        return " RepertoarID = " + repertoarID;
    }

    @Override
    public String vrednostiZaInsert() {
        return "'" + new java.sql.Date(datum.getTime()) + "', '" + sala.getSalaID()+ "', '" + bioskop.getBioskopID()+ "', '" + administrator.getAdministratorID()+ "'";
    }

    @Override
    public String vrednostiZaUpdate() {
        return " Datum = '" + new java.sql.Date(datum.getTime()) + "', SalaID = " + sala.getSalaID()+ 
                ", BioskopID = " + bioskop.getBioskopID() + ", AdministratorID = "
                + administrator.getAdministratorID() + "";
    }
 
    @Override
    public String uslov() {
        return "";
        
    }

      
    

    
    
}
