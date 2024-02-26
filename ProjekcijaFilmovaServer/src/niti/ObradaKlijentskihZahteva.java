/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package niti;

import domen.Administrator;
import domen.Bioskop;
import domen.Repertoar;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import konstante.Operacije;
import konstante.Status;
import logika.KontrolerServer;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author Korisnik
 */
public class ObradaKlijentskihZahteva extends Thread{
    private Socket s;

    public ObradaKlijentskihZahteva(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            while (true) {
                ObjectInputStream in = new ObjectInputStream(s.getInputStream());
                KlijentskiZahtev kz = (KlijentskiZahtev) in.readObject();
                ServerskiOdgovor so = vratiOdgovor(kz);
                ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
                out.writeObject(so);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private ServerskiOdgovor vratiOdgovor(KlijentskiZahtev kz) {
         ServerskiOdgovor so = new ServerskiOdgovor(null, null, Status.Uspesno);

        try {
            switch (kz.getOperacija()) {
                case Operacije.LOGIN:
                    Administrator administrator = (Administrator) kz.getParametar();
                    Administrator a = KontrolerServer.getInstance().login(administrator);
                    so.setOdgovor(a);
                    break;
                case Operacije.VRATI_BIOSKOPE:
                    so.setOdgovor(KontrolerServer.getInstance().ucitajBioskope());
                    break;
                case Operacije.VRATI_SALE:
                    so.setOdgovor(KontrolerServer.getInstance().ucitajSale());
                    break;
                case Operacije.VRATI_ZANROVE:
                    so.setOdgovor(KontrolerServer.getInstance().ucitajZanrove());
                    break;
                case Operacije.DODAJ_REPERTOAR:
                    KontrolerServer.getInstance().dodajRepertoar((Repertoar) kz.getParametar());
                    break;
                case Operacije.VRATI_REPERTOARE:
                    so.setOdgovor(KontrolerServer.getInstance().ucitajRepertoare());
                    break;
                case Operacije.OBRISI_REPERTOAR:
                    KontrolerServer.getInstance().obrisiRepertoar((Repertoar) kz.getParametar());
                    break;
                case Operacije.VRATI_FILMOVE:
                    so.setOdgovor(KontrolerServer.getInstance().ucitajFilmove((Repertoar) kz.getParametar()));
                    break;
                case Operacije.IZMENI_REPERTOAR:
                    KontrolerServer.getInstance().izmeniRepertoar((Repertoar) kz.getParametar());
                    break;
                case Operacije.OBRISI_BIOSKOP:
                    KontrolerServer.getInstance().obrisiBioskop((Bioskop) kz.getParametar());
                    break;
                case Operacije.IZMENI_BIOSKOP:
                    KontrolerServer.getInstance().izmeniBioskop((Bioskop) kz.getParametar());
                    break;
                case Operacije.DODAJ_BIOSKOP:
                    KontrolerServer.getInstance().dodajBioskop((Bioskop) kz.getParametar());
                    break;
                default:
                    return null;
            }
        } catch (Exception e) {
            so.setStatus(Status.Neuspesno);
            so.setException(e);
        }
        return so;
    }
 }
    
    

