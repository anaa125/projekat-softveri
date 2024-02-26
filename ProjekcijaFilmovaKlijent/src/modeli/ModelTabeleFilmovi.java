/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeli;

import domen.Film;
import domen.Repertoar;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.SimpleTimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import logika.KontrolerKlijent;

/**
 *
 * @author Korisnik
 */
public class ModelTabeleFilmovi extends AbstractTableModel {
 ArrayList<Film> lista;
    String[] kolone = {"FilmId","Naziv filma", "Žanr", "Vreme prikazivanja"};
   

    public ModelTabeleFilmovi() {
        lista = new ArrayList<>();
    }

    public ModelTabeleFilmovi(Repertoar repertoar){
        try {
            lista = KontrolerKlijent.getInstance().vratiFilmove(repertoar);
        } catch (Exception ex) {
            Logger.getLogger(ModelTabeleFilmovi.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        Film stavkaListe = lista.get(rowIndex);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        switch (columnIndex) {
            case 0:
                return stavkaListe.getFilmID();
               
            case 1:
               
                return stavkaListe.getNaziv();
            case 2: 
               return stavkaListe.getZanr();
               
            case 3:
               return stavkaListe.getVremePrikazivanja().format(formatter);
           
            default:
                return "return!";
        }
    }
    public void dodajFilm(Film film) {
//        rb = lista.size();
//        film .setFilmID(++rb);
        lista.add(film);
        fireTableDataChanged();
    }

    public void obrisiFilm(int red) {
        lista.remove(red);
        
//        rb=0;
//       for (Film film : lista) {
//          film.setFilmID(++rb);  
//       }
        fireTableDataChanged();
    }

    public ArrayList<Film> vratiFilmove() {
        return lista;
    }

    public void popuniFilmove(ArrayList<Film> filmovi) {
        lista = filmovi;
        fireTableDataChanged();
    }
    
    
}
