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
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import konstante.Operacije;
import konstante.Status;
import sesija.Sesija;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author Korisnik
 */
public class KontrolerKlijent {
    private static KontrolerKlijent instance;

    private KontrolerKlijent() {
    }

    public static KontrolerKlijent getInstance() {
        if(instance==null){
            instance=new KontrolerKlijent();
        }
        return instance;
    }
     private Object posaljiZahtev(int operacija, Object parametar) throws Exception {
            KlijentskiZahtev kz = new KlijentskiZahtev(operacija, parametar);

            ObjectOutputStream out = new ObjectOutputStream(Sesija.getInstance().getSocket().getOutputStream());
            out.writeObject(kz);

            ObjectInputStream in = new ObjectInputStream(Sesija.getInstance().getSocket().getInputStream());
            ServerskiOdgovor so = (ServerskiOdgovor) in.readObject();

            if (so.getStatus().equals(Status.Neuspesno)) {
                throw so.getException();
            } else {
                return so.getOdgovor();
            }
    }

    public Administrator login(Administrator administrator) throws Exception {
        return (Administrator) posaljiZahtev(Operacije.LOGIN, administrator);
    }

   public ArrayList<Bioskop> ucitajBioskope() throws Exception {
        return (ArrayList<Bioskop>) posaljiZahtev(Operacije.VRATI_BIOSKOPE, null);
    }

    public ArrayList<Sala> ucitajSale() throws Exception {
        return (ArrayList<Sala>) posaljiZahtev(Operacije.VRATI_SALE, null);
    }

    public ArrayList<Zanr> ucitajZanrove() throws Exception {
        return (ArrayList<Zanr>) posaljiZahtev(Operacije.VRATI_ZANROVE, null);
    }

    public void dodajRepertoar(Repertoar repertoar) throws Exception {
        posaljiZahtev(Operacije.DODAJ_REPERTOAR, repertoar);
        
    }

    public ArrayList<Repertoar> vratiRepertoare() throws Exception {
        return (ArrayList<Repertoar>) posaljiZahtev(Operacije.VRATI_REPERTOARE, null);
    }

    public void obrisiRepertoar(Repertoar repertoar) throws Exception {
        posaljiZahtev(Operacije.OBRISI_REPERTOAR, repertoar);
    }

    public ArrayList<Film> vratiFilmove(Repertoar repertoar) throws Exception {
        return (ArrayList<Film>) posaljiZahtev(Operacije.VRATI_FILMOVE, repertoar);
    }

    public void izmeniRepertoar(Repertoar repertoar) throws Exception {
        posaljiZahtev(Operacije.IZMENI_REPERTOAR, repertoar);
    }

    public ArrayList<Bioskop> vratiBioskope() throws Exception {
        return (ArrayList<Bioskop>) posaljiZahtev(Operacije.VRATI_BIOSKOPE, null);
    }

    public void obrisiBioskop(Bioskop bioskop) throws Exception {
        posaljiZahtev(Operacije.OBRISI_BIOSKOP, bioskop);
    }

    public void izmeniBioskop(Bioskop bioskop) throws Exception {
        posaljiZahtev(Operacije.IZMENI_BIOSKOP, bioskop);
    }

    public void dodajBioskop(Bioskop bioskop) throws Exception {
        posaljiZahtev(Operacije.DODAJ_BIOSKOP, bioskop);
    }
    
    
}
