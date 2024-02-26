/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;



import java.security.Timestamp;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;


/**
 *
 * @author Korisnik
 */
public class Film extends OpstiDomenskiObjekat {
    private Repertoar repertoar;
    private long filmID;
    private String naziv;
    private int trajanje;
    private int godina;
    private Double cena;
    private LocalTime vremePrikazivanja;
    private Zanr zanr;

    public Film() {
    }

    public Film(Repertoar repertoar, long filmID, String naziv, int trajanje, int godina, Double cena, LocalTime vremePrikazivanja, Zanr zanr) {
        this.repertoar = repertoar;
        this.filmID = filmID;
        this.naziv = naziv;
        this.trajanje = trajanje;
        this.godina = godina;
        this.cena = cena;
        this.vremePrikazivanja = vremePrikazivanja;
        this.zanr = zanr;
    }

    public Zanr getZanr() {
        return zanr;
    }

    public void setZanr(Zanr zanr) {
        this.zanr = zanr;
    }

    public Repertoar getRepertoar() {
        return repertoar;
    }

    public void setRepertoar(Repertoar repertoar) {
        this.repertoar = repertoar;
    }

    public long getFilmID() {
        return filmID;
    }

    public void setFilmID(long filmID) {
        this.filmID = filmID;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public LocalTime getVremePrikazivanja() {
        return vremePrikazivanja;
    }

    public void setVremePrikazivanja(LocalTime vremePrikazivanja) {
        this.vremePrikazivanja = vremePrikazivanja;
    }
    
    @Override
    public String nazivTabele() {
        return " film ";
    }

    @Override
    public String alijas() {
        return " f ";
    }

    @Override
    public String join() {
        return " JOIN ZANR Z ON (Z.ZANRID = F.ZANRID) "
                + "JOIN REPERTOAR R ON (F.REPERTOARID = R.REPERTOARID) "
                + "JOIN SALA S ON (S.SALAID = R.SALAID) "
                + "JOIN BIOSKOP B ON (B.BIOSKOPID = R.BIOSKOPID) "
                + "JOIN ADMINISTRATOR A ON (A.ADMINISTRATORID = R.ADMINISTRATORID)";
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

            Zanr z = new Zanr(rs.getLong("ZanrID"), rs.getString("NazivZanra"));

            Film f = new Film(r, rs.getLong("FilmID"), rs.getString("NazivFilma"), rs.getInt("TrajanjeFilma"),rs.getInt("GodinaFilma"),
                    rs.getDouble("CenaFilma"), rs.getTime("VremePrikazivanja").toLocalTime(), z);

            lista.add(f);
        }

        rs.close();
        return lista;
    }

    @Override
    public String koloneZaInsert() {
        return " (RepertoarID, FilmID, NazivFilma, TrajanjeFilma, GodinaFilma, CenaFilma, VremePrikazivanja, ZanrID) ";
    }

    @Override
    public String vrednostZaPrimarniKljuc() {
        return " RepertoarID = " + repertoar.getRepertoarID();
    }

   public String vrednostiZaInsert() {
    return "" + repertoar.getRepertoarID()+ ", " + filmID + 
            ", '" + naziv + "', '" + trajanje + "', '"
             + godina + "', '" + cena + "', '" 
            + java.sql.Time.valueOf(vremePrikazivanja) + 
            "', " + zanr.getZanrID()+"";
}

    @Override
    public String vrednostiZaUpdate() {
        return " NazivFilma = '" + naziv + "', TrajanjeFilma = '" + trajanje + "', "
                + " GodinaFilma = '"+ godina + "', CenaFilma = '" + cena +"', " 
                + " VremePrikazivanja = '" + java.sql.Time.valueOf(vremePrikazivanja) + "', ZanrID = '" 
                + zanr.getZanrID()+ "' ";
    }

    @Override
    public String uslov() {
        return " WHERE R.REPERTOARID = " + repertoar.getRepertoarID()+ " ORDER BY F.FILMID";
    }

    @Override
    public String toString() {
        return naziv;
    }

    
}
