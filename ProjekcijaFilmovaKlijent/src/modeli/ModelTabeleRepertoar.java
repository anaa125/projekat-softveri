/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeli;

import domen.Film;
import domen.Repertoar;
import domen.Zanr;
import forme.GlavnaForma;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import logika.KontrolerKlijent;

/**
 *
 * @author Korisnik
 */
public class ModelTabeleRepertoar extends AbstractTableModel implements Runnable{

   ArrayList<Repertoar> lista;
    String[] kolone = {"Datum", "Bioskop", "Sala"};
    private String parametar="";
    //Mesto mesto;
    public ModelTabeleRepertoar() {
        try {
            lista = KontrolerKlijent.getInstance().vratiRepertoare();
        } catch (Exception ex) {
            Logger.getLogger(ModelTabeleRepertoar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ModelTabeleRepertoar(Zanr z) {
        ArrayList<Film> filmovi = new ArrayList<>();
        ArrayList<Repertoar> repertoari = new ArrayList<>();
        ArrayList<Repertoar> noviRepertoari = new ArrayList<>();
        try {
            repertoari = KontrolerKlijent.getInstance().vratiRepertoare();
            for (Repertoar repertoar : repertoari) {
                 filmovi = KontrolerKlijent.getInstance().vratiFilmove(repertoar);
                if(filmovi.get(0).getZanr().getZanrID()== z.getZanrID()){
                    noviRepertoari.add(repertoar);
                }
                
            }
            
            
            
        } catch (Exception ex) {
            Logger.getLogger(ModelTabeleRepertoar.class.getName()).log(Level.SEVERE, null, ex);
        }
        lista = noviRepertoari;
    }
   

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return kolone[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Repertoar stavkaListe = lista.get(rowIndex);
        SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
        switch (columnIndex) {
            case 0:
                return sdf.format(stavkaListe.getDatum());
            case 1:
                return stavkaListe.getBioskop();
            case 2:
                return stavkaListe.getSala();
            default:
                return "return!";
        }
    }

    public void popuniRepertoare(ArrayList<Repertoar> repertoari) {
        lista = repertoari;
        fireTableDataChanged();
    }

    public void obrisiRepertoar(int red) {
        lista.remove(red);
        fireTableDataChanged();
    }

    public Repertoar vratiRepertoar(int red) {
        return lista.get(red);
    }

    public void setParametar(String rec) {
        parametar = rec;
        pronadjiRepertoare();
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                Thread.sleep(3000);
                pronadjiRepertoare();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(ModelTabeleRepertoar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void pronadjiRepertoare() {
        try {
            lista = KontrolerKlijent.getInstance().vratiRepertoare();
            if (!parametar.equals("")) {
                ArrayList<Repertoar> pretrazeniRepertoari = new ArrayList<>();
             
                for (Repertoar r : lista) {
                    
                    if (r.getBioskop().getNaziv().toLowerCase().contains(parametar.toLowerCase())) {
                        pretrazeniRepertoari.add(r);
                    }
                }
                lista = pretrazeniRepertoari;
      
                
            }

            fireTableDataChanged();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
}
