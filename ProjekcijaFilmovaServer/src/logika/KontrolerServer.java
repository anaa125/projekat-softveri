/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logika;

import domen.Administrator;
import domen.Bioskop;
import domen.Film;
import domen.Repertoar;
import domen.Sala;
import domen.Zanr;
import java.util.ArrayList;
import so.administrator.PrijavaAdministratoraSO;
import so.bioskop.DodajBioskopSO;
import so.bioskop.IzmeniBioskopSO;
import so.bioskop.ObrisiBioskopSO;
import so.bioskop.UcitajBioskopeSO;
import so.film.UcitajFilmoveSO;
import so.repertoar.DodajRepertoarSO;
import so.repertoar.IzmeniRepertoarSO;
import so.repertoar.ObrisiRepertoarSO;
import so.repertoar.UcitajRepertoareSO;
import so.sala.UcitajSaleSO;
import so.zanr.UcitajZanroveSO;

/**
 *
 * @author Korisnik
 */
public class KontrolerServer {
    private static KontrolerServer instance;
    
     

    private KontrolerServer() {
    }
    
    

    public static KontrolerServer getInstance() {
        if(instance==null) {
            instance=new KontrolerServer();
        }     
        return instance;
    }

    public Administrator login(Administrator administrator) throws Exception {
        PrijavaAdministratoraSO paso = new PrijavaAdministratoraSO();
       
        paso.izvrsavanje(administrator);
        return paso.getAdministrator();
    }
    public void dodajRepertoar(Repertoar repertoar) throws Exception {
        (new DodajRepertoarSO()).izvrsavanje(repertoar);
    }

    public void dodajBioskop(Bioskop bioskop) throws Exception {
        (new DodajBioskopSO()).izvrsavanje(bioskop);
    }

    public void obrisiRepertoar(Repertoar repertoar) throws Exception {
        (new ObrisiRepertoarSO()).izvrsavanje(repertoar);
    }

    public void obrisiBioskop(Bioskop bioskop) throws Exception {
        (new ObrisiBioskopSO()).izvrsavanje(bioskop);
    }
 
    public void izmeniRepertoar(Repertoar repertoar) throws Exception {
        (new IzmeniRepertoarSO()).izvrsavanje(repertoar);
    }

    public void izmeniBioskop(Bioskop bioskop) throws Exception {
        (new IzmeniBioskopSO()).izvrsavanje(bioskop);
    }

    public ArrayList<Repertoar> ucitajRepertoare() throws Exception {
        UcitajRepertoareSO urso = new UcitajRepertoareSO();
        urso.izvrsavanje(new Repertoar());
        return urso.getLista();
    }
   
    public ArrayList<Sala> ucitajSale() throws Exception {
        UcitajSaleSO usso = new UcitajSaleSO();
        usso.izvrsavanje(new Sala());
        return usso.getLista();
    }
    
    public ArrayList<Bioskop> ucitajBioskope() throws Exception {
        UcitajBioskopeSO ubso = new UcitajBioskopeSO();
        ubso.izvrsavanje(new Bioskop());
        return ubso.getLista();
    }
    
    public ArrayList<Zanr> ucitajZanrove() throws Exception {
        UcitajZanroveSO uzso = new UcitajZanroveSO();
        uzso.izvrsavanje(new Zanr());
        return uzso.getLista();
    }
    
    public ArrayList<Film> ucitajFilmove(Repertoar repertoar) throws Exception {
        UcitajFilmoveSO ufso = new UcitajFilmoveSO();

        Film f = new Film();
        f.setRepertoar(repertoar);

        ufso.izvrsavanje(f);
        return ufso.getLista();
    }
          
}
